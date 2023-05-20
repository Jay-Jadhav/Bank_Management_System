package bank.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ministatement extends JFrame implements ActionListener {
	
	JButton back;
	String pin;


	public Ministatement(String pn)
	{
		this.pin=pn;
		setTitle("Mini Statement");
		setSize(550,700);
		setLocation(300,10);
		setLayout(null);
		//setUndecorated(true);
		getContentPane().setBackground(Color.white);
		
		JLabel img= new JLabel("J. J. Bank");
		img.setBounds(190, 30, 150, 30);
		add(img);
		img.setFont(new Font("System",Font.BOLD,22));
		
		JLabel trastext= new JLabel();
		trastext.setBounds(50, 120, 400, 25);
		trastext.setFont(new Font("System",Font.BOLD,16));
		add(trastext);
		
		
		JLabel ltrastext= new JLabel("Your last 5  Transactions :");
		ltrastext.setBounds(50, 170, 400, 25);;
		ltrastext.setFont(new Font("System",Font.BOLD,16));
		add(ltrastext);

		
		

		JLabel rpntext= new JLabel();
		rpntext.setBounds(50, 190, 500, 300);
		rpntext.setFont(new Font("System",Font.BOLD,16));
		add(rpntext);
		
		
		//error of gap
		
		
		try {
			Conn ck= new Conn();
			ResultSet rd =ck.st.executeQuery("SELECT * FROM login WHERE pinno='"+pin+"';");
			
			
			while (rd.next()) {
				trastext.setText("Card Number : XXXXXXXXXXXX"+rd.getString("cardno").substring(12,16));
			}	
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
		
	
		
		
		try {
			
			Conn cl= new Conn();
			ResultSet rp =cl.st.executeQuery("SELECT * FROM bank WHERE pinno='"+pin+"';");
			
			
			
			
			int count = 1;
			while (rp.next()&&count <= 5) {
				
			
					rpntext.setText(rpntext.getText()+
							"<html>"+count+")"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rp.getString("dateof")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
							rp.getString("typeoftr")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rp.getString("amount")+
							"<br><br><html>");

			    count++;
			}
			
			
			
			
				
			// to append explain
			
			// why not </html> why <html> at the end 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	

		JLabel pntext= new JLabel();
		pntext.setBounds(50, 500, 500, 50);
		pntext.setFont(new Font("System",Font.BOLD,16));
		add(pntext);
		
		
		
		
		int bal=0;
	
		try {
			Conn ck= new Conn();
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
			
			pntext.setText("Your Current Balance is Rs. "+bal);
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
		
		
		
		back = new JButton("Back");
		back.setBounds(320, 600, 100, 25);
		add(back);
		back.setForeground(Color.white);
		back.setBackground(Color.black);
		back.addActionListener(this);
		
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ministatement("");
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
