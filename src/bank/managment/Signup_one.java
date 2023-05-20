package bank.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class Signup_one extends JFrame implements ActionListener{
	 
	JTextField textField,pntextField,stextField,ctextField,atextField,etextField,ftextField;
	ButtonGroup gendergr,maritalgr;
	JButton next;
	JDateChooser date;
	JRadioButton male,female,married,other,unmarried;
	long random;
	public Signup_one()
	{
		setTitle("Sign Up Page");
		
		setSize(800,725);
		setLocation(350, 10);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		
		//mechanism behinde genrating the random number 
		Random ran = new Random();
		random=Math.abs((ran.nextLong() %9000L)+1000L);
		
		JLabel formno= new JLabel("Application Form No. :"+random);
		formno.setFont(new Font("raleway",Font.BOLD,36));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		
		
		JLabel persinfo= new JLabel("Page 1 : Personal Information");
		persinfo.setFont(new Font("raleway",Font.BOLD,22));
		persinfo.setBounds(250, 80, 400, 30);
		add(persinfo);

		
		
		//details all
		
		JLabel name= new JLabel("Name :");
		name.setFont(new Font("raleway",Font.BOLD,20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		
		
		
		JLabel fname= new JLabel("Father's Name :");
		fname.setFont(new Font("raleway",Font.BOLD,20));
		fname.setBounds(100, 190, 200, 30);
		add(fname);
		
		
		
		JLabel dob= new JLabel("Date of Birth :");
		dob.setFont(new Font("raleway",Font.BOLD,20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		
		date=new JDateChooser();
		date.setBounds(300, 240, 400, 30);
		date.setForeground(new Color(105,105,105));
		add(date);
		
		
		
		JLabel gen= new JLabel("Gender :");
		gen.setFont(new Font("raleway",Font.BOLD,20));
		gen.setBounds(100, 290, 200, 30);
		add(gen);
		
		male=new JRadioButton("Male");
		male.setBounds(400, 290, 80, 30);
		male.setBackground(Color.white);
		add(male);
		
		female=new JRadioButton("Female");
		female.setBounds(500, 290, 120, 30);
		female.setBackground(Color.white);
		add(female);
		
		gendergr=new ButtonGroup();
		gendergr.add(female);
		gendergr.add(male);
		
		JLabel email= new JLabel("Email :");
		email.setFont(new Font("raleway",Font.BOLD,20));
		email.setBounds(100, 340, 200, 30);
		add(email);
		
		
		
		JLabel marital= new JLabel("Marital Status :");
		marital.setFont(new Font("raleway",Font.BOLD,20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);
		
		married=new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried=new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 100, 30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other=new JRadioButton("Other");
		other.setBounds(630, 390, 100, 30);
		other.setBackground(Color.white);
		add(other);
		
		maritalgr=new ButtonGroup();
		maritalgr.add(married);
		maritalgr.add(unmarried);
		maritalgr.add(other);
		
		
		JLabel adr= new JLabel("Address :");
		adr.setFont(new Font("raleway",Font.BOLD,20));
		adr.setBounds(100, 440, 200, 30);
		add(adr);
		
		
		
		JLabel city= new JLabel("City :");
		city.setFont(new Font("raleway",Font.BOLD,20));
		city.setBounds(100, 490, 200, 30);
		add(city);
		
		JLabel state= new JLabel("State :");
		state.setFont(new Font("raleway",Font.BOLD,20));
		state.setBounds(100, 540, 200, 30);
		add(state);
		
		JLabel pincode= new JLabel("Pincode :");
		pincode.setFont(new Font("raleway",Font.BOLD,20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);
		
		
		
		
		//textfeilds
		
		textField = new JTextField();
		textField.setFont(new Font("Raleway",Font.BOLD,14));
		textField.setBounds(300, 140, 400, 30);
		add(textField);
		
		ftextField = new JTextField();
		ftextField.setFont(new Font("Raleway",Font.BOLD,14));
		ftextField.setBounds(300, 190, 400, 30);
		add(ftextField);
		
		
		etextField = new JTextField();
		etextField.setFont(new Font("Raleway",Font.BOLD,14));
		etextField.setBounds(300, 340, 400, 30);
		add(etextField);
		
		atextField = new JTextField();
		atextField.setFont(new Font("Raleway",Font.BOLD,14));
		atextField.setBounds(300, 440, 400, 30);
		add(atextField);
		
		ctextField = new JTextField();
		ctextField.setFont(new Font("Raleway",Font.BOLD,14));
		ctextField.setBounds(300, 490, 400, 30);
		add(ctextField);
		
		stextField = new JTextField();
		stextField.setFont(new Font("Raleway",Font.BOLD,14));
		stextField.setBounds(300, 540, 400, 30);
		add(stextField);
		
		pntextField = new JTextField();
		pntextField.setFont(new Font("Raleway",Font.BOLD,14));
		pntextField.setBounds(300, 590, 400, 30);
		add(pntextField);
		
		
		
		
		next= new JButton("Next");
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620, 645, 80, 30);
		next.setForeground(Color.white);
		next.setBackground(Color.black);
		next.addActionListener(this);
		add(next);
		
		
		setVisible(true);//to resolve the error visibility
	}
	

	public static void main(String[] args) {
		new Signup_one();
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String formno=""+random;
		//to do chhange type from long to string cant covert or downcast
		String nm=textField.getText();
		String fname=ftextField.getText();
		String dob=((JTextField)date.getDateEditor().getUiComponent()).getText();
		
		String gender=null;
		if (male.isSelected()) {
			gender="Male";
		} else if(female.isSelected()) {
			gender="Female";
		}
		
		String email=etextField.getText();
		String maritalstate=null;
		if (married.isSelected()) {
			maritalstate="Married";
		}
		else if (unmarried.isSelected()) {
			
		maritalstate="Unmarried";
		}
		else if (other.isSelected()) {
			
			maritalstate="Other";
			}
		
		String addr=atextField.getText();
		String ct = ctextField.getText();
		String stat=stextField.getText();
		String pin=pntextField.getText();
		
		try {
			if (nm.equals("")||fname.equals("")||dob.equals("")||
					gender.equals("")||email.equals("")||maritalstate.equals("")||addr.equals("")||ct.equals("")||
					stat.equals("")||pin.equals("")) {
				JOptionPane.showMessageDialog(null, "All fields are required");
			}
			else {
				Conn cn=new Conn();
				 String Iquery="INSERT INTO signup values('"+formno+"','"+nm+"','"+fname
						 +"','"+dob+"','"+gender+"','"+email+"','"+maritalstate+"','"
						 +addr+"','"+ct+"','"+stat+"','"+pin+"')";
				 cn.st.executeUpdate(Iquery);
				 setVisible(false);
				 new Signup_two(formno).setVisible(true);
				 
			}
			
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
	}

	
}
