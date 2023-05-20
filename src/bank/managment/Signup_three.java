package bank.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

@SuppressWarnings("serial")
public class Signup_three extends JFrame implements ActionListener {
	
	JRadioButton t1,t2,t3,t4;
	ButtonGroup acctyp;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formnum;
	


	

	public Signup_three(String fr) {

		this.formnum=fr;
		setSize(800,710);
		setLocation(350, 10);
		setLayout(null);
		
		JLabel l1 =new JLabel("Page 3: Account Details	("+formnum+")");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(250, 40, 400, 40);
		add(l1);
		
		
		
		
		JLabel actyp =new JLabel("Account Type :");
		actyp.setFont(new Font("Raleway",Font.BOLD,20));
		actyp.setBounds(100, 100, 200, 30);
		add(actyp);
		
		
		t1= new JRadioButton("Saving Account");
		t1.setFont(new Font("Raleway",Font.BOLD,16));
		t1.setBackground(Color.white);
		t1.setBounds(100, 150, 160, 20);
		add(t1);
		
		t2= new JRadioButton("Fixed Deposit Account");
		t2.setFont(new Font("Raleway",Font.BOLD,16));
		t2.setBackground(Color.white);
		t2.setBounds(350, 150, 210, 20);
		add(t2);
		
		t3= new JRadioButton("Current Account");
		t3.setFont(new Font("Raleway",Font.BOLD,16));
		t3.setBackground(Color.white);
		t3.setBounds(100, 190, 160, 20);
		add(t3);
		
		
		t4= new JRadioButton("Recurring Deposit Account");
		t4.setFont(new Font("Raleway",Font.BOLD,16));
		t4.setBackground(Color.white);
		t4.setBounds(350, 190, 240, 20);
		add(t4);
		
		acctyp = new ButtonGroup();
		acctyp.add(t1);
		acctyp.add(t2);
		acctyp.add(t3);
		acctyp.add(t4);
		
		
		
		

		JLabel cardl =new JLabel("Card Number :");
		cardl .setFont(new Font("Raleway",Font.BOLD,20));
		cardl .setBounds(100, 250, 200, 30);
		add(cardl );
		
		JLabel cardln =new JLabel("XXXX-XXXX-XXXX-4104");
		cardln.setFont(new Font("Raleway",Font.BOLD,20));
		cardln.setBounds(300, 250, 300, 30);
		add(cardln);
		
		JLabel carddet =new JLabel("(Your 16 Digit Card Number)");
		carddet.setFont(new Font("Raleway",Font.BOLD,12));
		carddet.setBounds(100, 280, 200, 20);
		add(carddet);
		
		JLabel pinl =new JLabel("PIN :");
		pinl .setFont(new Font("Raleway",Font.BOLD,20));
		pinl .setBounds(100, 310, 200, 30);
		add(pinl );
		
		JLabel pinn =new JLabel("XXXX");
		pinn.setFont(new Font("Raleway",Font.BOLD,20));
		pinn.setBounds(300, 310, 300, 30);
		add(pinn);
		
		JLabel pindet =new JLabel("(Your 4 DIgit Card PIN)");
		pindet.setFont(new Font("Raleway",Font.BOLD,12));
		pindet.setBounds(100, 340, 200, 20);
		add(pindet);
		
		
		JLabel sactyp =new JLabel("Services Required :");
		sactyp.setFont(new Font("Raleway",Font.BOLD,20));
		sactyp.setBounds(100, 400, 200, 30);
		add(sactyp);
		
		
		c1=new JCheckBox("ATM Card");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100, 450, 200, 20);
		add(c1);
		
		
		c2=new JCheckBox("Internet Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(350, 450, 200, 20);
		add(c2);
		
		
		c3=new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100, 490, 200, 20);
		add(c3);
		
		
		c4=new JCheckBox("Email & SMS Alerts");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(350, 490, 200, 20);
		add(c4);
		
		c5=new JCheckBox("Checkbook");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(100, 530, 200, 20);
		add(c5);
		
		c6=new JCheckBox("E-statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(350, 530, 200, 20);
		add(c6);
		
		c7=new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.white);
		c7.setFont(new Font("Raleway",Font.BOLD,12));
		c7.setBounds(100, 585, 580, 20);
		add(c7);
		
		
		
		
		
		
		cancel=new JButton("Cancel");
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setBounds(400, 625, 100, 30);
		cancel.setFont(new Font("Raleway",Font.BOLD,14));
		add(cancel);
		cancel.addActionListener(this);
		
		submit=new JButton("Submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setBounds(520, 625, 100, 30);
		submit.setFont(new Font("Raleway",Font.BOLD,14));
		add(submit);
		submit.addActionListener(this);
		
		setVisible(true);
	}
	






	public static void main(String args[])
	{
		new Signup_three("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==submit) 
		{
			
			String account=null;
			if (t1.isSelected()) {
				account="Saving Account";
			}
			else if (t2.isSelected()) {
				account="Fixed Deposit Account";
			}
			
			else if (t3.isSelected()) {
				account="Current Account";
			}
			else if (t4.isSelected()) {
				account="Recurring Deposit Account";
			}
			
			Random ran=new Random();
			String cardno= "" + Math.abs(ran.nextLong()%90000000L+5040936000000000L);
			String Pinno= "" + Math.abs((ran.nextLong()%9000L)+1000L);
			
			String facility="";
			if (c1.isSelected()) {
				facility=facility+" ATM Card";
			}
			else if (c2.isSelected()) {
				facility=facility+" Internet Banking";
			}
			else if (c3.isSelected()) {
				facility=facility+" Mobile Banking";
			}
			else if (c4.isSelected()) {
				facility=facility+" Email & SMS Alerts";
			}
			else if (c5.isSelected()) {
				facility=facility+" Checkbook";
			}
			else if (c6.isSelected()) {
				facility=facility+" E-statement";
			}
			
			
			String decl="";
		
			if (c7.isSelected()) {
				decl="done";
			}
			String frm =formnum;
			
			try {
				if(account.equals("")||facility.equals("")||decl.equals("")) {
					JOptionPane.showMessageDialog(null,"All fields are mandatory");
				}
				else {
					Conn cm = new Conn();
					String iquer="INSERT INTO signupthree VALUES('"+frm+"','"+account+
							"','"+cardno+"','"+Pinno+"','"+facility+"');";
					cm.st.executeUpdate(iquer);
					
					
					String iquer2="INSERT INTO login VALUES('"+frm+"','"+cardno+"','"+Pinno+"');";
					cm.st.executeUpdate(iquer2);
					
					JOptionPane.showMessageDialog(null, "Card No :"+cardno+"\n Pin :"+Pinno+"\n Done Successfully");
					setVisible(false);
					new Deposit(Pinno).setVisible(true);
					
				}
				
				
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
			// 		|| facility.equals("")
		}
		else if (e.getSource()==cancel) {
			
		}
		
	}
}
