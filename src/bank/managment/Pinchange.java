package bank.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Pinchange extends JFrame implements ActionListener  {
	String  pin;
	JPasswordField npin , repin;
	JButton change,back;
	
	public Pinchange(String pn)
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
		
		
		JLabel trastext= new JLabel("Change Your Pin");
		trastext.setBounds(270, 230, 700, 35);;
		trastext.setForeground(Color.white);
		trastext.setFont(new Font("System",Font.BOLD,16));
		img.add(trastext);
		
		
		
		JLabel pntext= new JLabel("New Pin :");
		pntext.setBounds(180, 280, 700, 35);;
		pntext.setForeground(Color.white);
		pntext.setFont(new Font("System",Font.BOLD,16));
		img.add(pntext);
		
		JLabel rpntext= new JLabel("Re-Enter New Pin :");
		rpntext.setBounds(180, 320, 700, 35);;
		rpntext.setForeground(Color.white);
		rpntext.setFont(new Font("System",Font.BOLD,16));
		img.add(rpntext);
		
		
		
		
		npin = new JPasswordField();
		npin.setFont(new Font("Raleway",Font.BOLD,22));
		npin.setBounds(350, 280, 150, 25);
		img.add(npin);
		
		
		
		repin = new JPasswordField();
		repin.setFont(new Font("Raleway",Font.BOLD,22));
		repin.setBounds(350, 320, 150, 25);
		img.add(repin);
		
		
		change = new JButton("Change");
		change.setBounds(383, 380, 110, 20);
		img.add(change);
		change.addActionListener(this);
		
		
		back = new JButton("Back");
		back.setBounds(383, 410, 110, 20);
		img.add(back);
		back.addActionListener(this);
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
			new Pinchange ("");
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getSource()==change) 
		{
			String np =npin.getText();
			String rpn =repin.getText();
			 
			
			if (np.equals("")) {
				JOptionPane.showMessageDialog(null,"Please correctly feel the pin and re-pin");
				return;
			}
			
			
			
			if (np.equals(rpn)) {
				
				 Conn cf = new Conn();
				 String query1="UPDATE bank SET pinno='"+rpn+"' WHERE pinno='"+pin+"';";
				 String query2="UPDATE login SET pinno='"+rpn+"' WHERE pinno='"+pin+"';";
				 String query3="UPDATE signupthree SET pinno='"+rpn+"' WHERE pinno='"+pin+"';";
				 
				 	try {
						cf.st.executeUpdate(query3);
						cf.st.executeUpdate(query2);
						cf.st.executeUpdate(query1);
						JOptionPane.showMessageDialog(null,"Pin Changed Successfully ");
						setVisible(false);
						 new Transactions(rpn);
						 
						 
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					
					}
					 
			}
			 else {
				 JOptionPane.showMessageDialog(null,"Please correctly feel the pin and re-pin");
			}
			
			
		}
		else
		{
			setVisible(false);
			 new Transactions(pin);
		}
		
		
	}

}
