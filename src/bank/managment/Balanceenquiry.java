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

public class Balanceenquiry extends JFrame implements ActionListener {
	
	JButton back,deposit;
	String pin;


	public Balanceenquiry(String pn)
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
		int bal=0;
		
		
		Conn ck= new Conn();
		try {
			ResultSet rd =ck.st.executeQuery("SELECT * FROM bank WHERE pinno='"+pin+"';");
			
			
			while (rd.next()) {
				if (rd.getString("typeoftr").equals("Deposit"))
				{
					bal += Integer.parseInt(rd.getString("amount"));
				
				}
				else {
					bal -= Integer.parseInt(rd.getString("amount"));
				}
			}
			
				
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
		
	
		
		JLabel trastext= new JLabel("Your Current Account balance is");
		trastext.setBounds(180, 240, 700, 35);;
		trastext.setForeground(Color.white);
		trastext.setFont(new Font("System",Font.BOLD,16));
		img.add(trastext);
		
		
		

		JLabel rpntext= new JLabel(" Rs. "+bal);
		rpntext.setBounds(180, 270, 700, 35);;
		rpntext.setForeground(Color.white);
		rpntext.setFont(new Font("System",Font.BOLD,16));
		img.add(rpntext);
		
		
		
		
		back = new JButton("Back");
		back.setBounds(383, 410, 110, 20);
		img.add(back);
		back.addActionListener(this);
		
		
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Balanceenquiry("");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==back) {
			setVisible(false);
			new Transactions(pin).setVisible(true);
		}
		
		
		
	}

}
