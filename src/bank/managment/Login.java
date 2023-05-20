	package bank.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login implements ActionListener {
	JFrame fr;
	ImageIcon i1 , i2;
	JLabel l1;
	Image im;
	JButton signup,clear,log;
	JTextField cardText;
	JPasswordField pinText;
	//scope is local and global
	
	public Login()
	{
		i1 = new ImageIcon(getClass().getResource("logo.jpg"));
		im=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		i2= new ImageIcon(im);
		//you can't give image to label
		
		l1=new JLabel(i2);
		l1.setBounds(70, 10, 100, 100);
		
		JLabel Text=new JLabel("Welcome To ATM");
		Text.setBounds(200, 40, 400, 40);
		Text.setFont(new Font("Osward",Font.BOLD ,38));
		
		JLabel cardno=new JLabel("Card No. :");
		cardno.setBounds(120, 150, 150, 30);
		cardno.setFont(new Font("Raleway",Font.BOLD ,28));
		
		cardText=new JTextField();
		cardText.setBounds(300, 150, 250, 30);
		cardText.setFont(new Font("Arial",Font.BOLD,14));
		
		JLabel pin=new JLabel("PIN :");
		pin.setBounds(120, 220, 250, 30);
		pin.setFont(new Font("Raleway",Font.BOLD ,28));
		
		pinText= new JPasswordField();
		pinText.setBounds(300, 220, 250, 30);
		
		
		
		log=new JButton("Log in");
		log.setBounds(300, 300, 100, 30);
		log.setBackground(Color.black);
		log.setForeground(Color.white);
		log.addActionListener(this);
		
		clear=new JButton("Clear");
		clear.setBounds(450, 300, 100, 30);
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		clear.addActionListener(this);
		
		
		signup=new JButton("Sign Up");
		signup.setBounds(300, 360, 250, 30);
		signup.setBackground(Color.black);
		signup.setForeground(Color.white);
		signup.addActionListener(this);
		
		
		
		fr=new JFrame("Login Page");
		fr.getContentPane().setBackground(Color.white);
		fr.setSize(800, 600);
		fr.setVisible(true);
		fr.setLocation(400, 100);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		fr.add(l1);
		fr.add(Text);
		fr.add(cardno);
		fr.add(cardText);
		fr.add(pin);
		fr.add(pinText);
		fr.add(log);
		fr.add(signup);
		fr.add(clear);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==log) {
			Conn cd = new Conn();
			String scard = cardText.getText();
			String spin = pinText.getText(); 
			
			String retreivequery=" SELECT * FROM login WHERE cardno='"+
			scard+"' AND pinno='"+spin+"';";
			
			try {
				ResultSet rs= cd.st.executeQuery(retreivequery);// its ddl command
				if (rs.next()) {
					fr.setVisible(false);
					new Transactions(spin).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card or Pin \n Please Try Again !");
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		else if (e.getSource()==signup) {
			fr.setVisible(false);
			new Signup_one().setVisible(true);
		}
		else {
			cardText.setText(null);
			pinText.setText(null);
		}
		
	}
	
	public static void main (String [] args)
	{
		Login l=new Login();
	}

	

}
