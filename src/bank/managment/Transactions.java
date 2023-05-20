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

public class Transactions extends JFrame implements ActionListener{

	JButton deposit,exit,withdrawl,balanceenqu,pinchange,ministatement,fastcash;
	String  pin;
	
	
	public Transactions(String pn)
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
		
		
		
		JLabel trastext= new JLabel("Please select your transaction");
		trastext.setBounds(240, 240, 700, 35);;
		img.add(trastext);
		trastext.setForeground(Color.white);
		trastext.setFont(new Font("System",Font.BOLD,16));
		
		
		
		
		deposit = new JButton("Deposit");
		deposit.setBounds(160, 336, 100, 20);
		img.add(deposit);
		deposit.addActionListener(this);
		
		withdrawl = new JButton("Cash Withdrawl");
		withdrawl.setBounds(383, 336, 130, 20);
		img.add(withdrawl);
		withdrawl.addActionListener(this);
		
		
		fastcash = new JButton("Fast Cash");
		fastcash.setBounds(160, 369, 100, 20);
		img.add(fastcash);
		fastcash.addActionListener(this);
		
		
		ministatement = new JButton("Mini Statement");
		ministatement.setBounds(383, 369, 130, 20);
		img.add(ministatement);
		ministatement.addActionListener(this);
		
		
		pinchange = new JButton("Pin Change");
		pinchange.setBounds(160, 402, 100, 20);
		img.add(pinchange);
		pinchange.addActionListener(this);
		

		balanceenqu = new JButton("Balance Enquiry");
		balanceenqu.setBounds(383, 402, 130, 20);
		img.add(balanceenqu);
		balanceenqu.addActionListener(this);
		
		
		exit = new JButton("Exit");
		exit.setBounds(160, 435, 100, 20);
		img.add(exit);
		exit.addActionListener(this);
		
		
		setVisible(true);//changes made are not visle then if do it before and
		//after make changes
		
	}
	
	
	public static void main(String[] args) {
		new Transactions("");
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==deposit) {
			setVisible(false);
			new Deposit(pin).setVisible(true);
		} 
		
		else if (e.getSource()==withdrawl) {
			setVisible(false);
			new Withdrawl(pin).setVisible(true);
		}
		 
		else if (e.getSource()==fastcash) {
			setVisible(false);
			new Fastcash(pin).setVisible(true);
		}
		 
		else if (e.getSource()==ministatement) {
			setVisible(false);
			new Ministatement(pin).setVisible(true);
		}
		 
		else if (e.getSource()==pinchange) {
			setVisible(false);
			new Pinchange(pin).setVisible(true);
		}
		
		else if (e.getSource()==balanceenqu) {
			setVisible(false);
			new Balanceenquiry(pin).setVisible(true);
		}
		 
		else if (e.getSource()==exit) {
			System.exit(0);
		}
		
		
		
		
	}

}
