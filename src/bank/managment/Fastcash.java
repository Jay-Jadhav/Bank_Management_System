package bank.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;

public class Fastcash extends JFrame implements ActionListener{

	JButton r10000,Rs100,Rs500,rs1000,rs2000,rs5000,exit;
	String  pin;
	
	
	public Fastcash(String pn)
	{
		this.pin=pn;
		setTitle("ATM Machine");
		setSize(900,730);
		setLocation(300,5);
		setLayout(null);
		setUndecorated(true);
		ImageIcon ii = new ImageIcon(getClass().getResource("atm.jpg"));
		Image im = ii.getImage().getScaledInstance(900, 815, Image.SCALE_DEFAULT);
		
		ImageIcon i3=new ImageIcon(im);
		
		JLabel img= new JLabel(i3);
		img.setBounds(0, 0, 900, 730);
		
		add(img);
		
		
		
		JLabel trastext= new JLabel("Please select withdrawl amount");
		trastext.setBounds(240, 240, 700, 35);;
		img.add(trastext);
		trastext.setForeground(Color.white);
		trastext.setFont(new Font("System",Font.BOLD,16));
		
		
		
		
		Rs100 = new JButton("Rs 100");
		Rs100.setBounds(160, 336, 100, 20);
		img.add(Rs100);
		Rs100.addActionListener(this);
		
		Rs500 = new JButton("Rs 500");
		Rs500.setBounds(383, 336, 130, 20);
		img.add(Rs500);
		Rs500.addActionListener(this);
		
		
		rs1000 = new JButton("Rs 1000");
		rs1000.setBounds(160, 369, 100, 20);
		img.add(rs1000);
		rs1000.addActionListener(this);
		
		
		rs2000 = new JButton("Rs 2000");
		rs2000.setBounds(383, 369, 130, 20);
		img.add(rs2000);
		rs2000.addActionListener(this);
		
		
		rs5000 = new JButton("Rs 5000");
		rs5000.setBounds(160, 402, 100, 20);
		img.add(rs5000);
		rs5000.addActionListener(this);
		

		r10000 = new JButton("Rs 10000");
		r10000.setBounds(383, 402, 130, 20);
		img.add(r10000);
		r10000.addActionListener(this);
		
		
		exit = new JButton("Back");
		exit.setBounds(160, 435, 100, 20);
		img.add(exit);
		exit.addActionListener(this);
		
		
		setVisible(true);//changes made are not visle then if do it before and
		//after make changes
		
	}
	
	
	public static void main(String[] args) {
		new Fastcash("");
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==exit) {
			setVisible(false);
			 new Transactions(pin).setVisible(true);
		}
		else {
			String amount =((JButton)e.getSource()).getText().substring(3);
			//to remove the first rs and  space so start form 3rd character as indexing
			
			Conn ck= new Conn();
			try {
				ResultSet rd =ck.st.executeQuery("SELECT * FROM bank WHERE pinno='"+pin+"';");
				int bal=0;
				
				while (rd.next()) {
					if (rd.getString("typeoftr").equals("Deposit"))
					{
						bal += Integer.parseInt(rd.getString("amount"));
					
					}
					else {
						bal -= Integer.parseInt(rd.getString("amount"));
					}
				}
				if (Integer.parseInt(amount)>=bal) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance \n Please Add Funds First !");
					return;
					
					// resolve this return and also the first deposit also min 5000
					
				}
				
				
				
				Date dte = new Date();
				String query ="	INSERT INTO bank VALUES ('"+pin+"','"+dte+"','Withdrawl','"+amount+"');";
				ck.st.executeUpdate(query);
				JOptionPane.showMessageDialog(null, ("Rs "+amount+" Debited successfully"));
				setVisible(false);
				new Transactions(pin).setVisible(true);
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			
		}
		
		
		
		
	}

}
