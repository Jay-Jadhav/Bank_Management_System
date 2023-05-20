package bank.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener {

	
	JTextField amount;
	JButton withdrawl,back;
	String pin;
	
	
	
	public Withdrawl(String pn)
	{
		this.pin=pn;
		setTitle("ATM Machine");
		setSize(900,730);
		setLocation(300,5);
		setLayout(null);
		ImageIcon ii = new ImageIcon(getClass().getResource("atm.jpg"));
		Image im = ii.getImage().getScaledInstance(900, 815, Image.SCALE_DEFAULT);
		
		ImageIcon i3=new ImageIcon(im);
		
		JLabel img= new JLabel(i3);
		img.setBounds(0, 0, 900, 730);
		
		add(img);
		
		

		JLabel trastext= new JLabel("Enter the amout you want to Withdraw");
		trastext.setBounds(210, 230, 700, 35);;
		img.add(trastext);
		trastext.setForeground(Color.white);
		trastext.setFont(new Font("System",Font.BOLD,16));
		
		
		
		amount = new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(190, 300, 300, 25);
		img.add(amount);
		
		
		withdrawl = new JButton("Withdraw");
		withdrawl.setBounds(383, 369, 110, 20);
		img.add(withdrawl);
		withdrawl.addActionListener(this);
		
		
		back = new JButton("Back");
		back.setBounds(383, 402, 110, 20);
		img.add(back);
		back.addActionListener(this);
		
		
		setVisible(true);//changes made are not visle then if do it before and

	}
	
	
	
	public static void main(String[] args) {
			new Withdrawl("");
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==withdrawl) {
			String samount=amount.getText();
			if (amount.equals("")) {
				JOptionPane.showMessageDialog(null,"Please Enter the amount ");
			}
			else {
				Date dat = new Date();
				Conn cb = new Conn();
				
				
				try {
					String updatequery = "INSERT INTO bank values('"+pin+"','"+
							dat+"','Withdrawl','"+samount+"');";
							cb.st.executeUpdate(updatequery);
							JOptionPane.showMessageDialog(null,"Rs. "+samount+" Withdraw Succesfully");
							setVisible(false);
							 new Transactions(pin);
							
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				
			}
		} else {
			setVisible(false);
			 new Transactions(pin);
		}
		
	}

}
