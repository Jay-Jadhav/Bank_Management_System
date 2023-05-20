
package bank.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Signup_two extends JFrame implements ActionListener{
	JTextField adhartextField,pantextField;
	ButtonGroup senior,Exsistingaccount;
	JButton next;
	JComboBox<?> religon,cast,inco,occp,Quali;
	
	String formno;
	
	JRadioButton yes,no,byes,bno;
	

	public Signup_two(String form)
	{
		
		this.formno=form;
		setTitle("New account Application Form");
		
		setSize(800,725);
		setLocation(350, 10);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		
		
		JLabel addsinfo= new JLabel("Page 2 : Additional Information"+"("+formno+")");
		addsinfo.setFont(new Font("raleway",Font.BOLD,22));
		addsinfo.setBounds(250, 50, 400, 30);
		add(addsinfo);

		
		
		//details all
		//30incr
		
		JLabel name= new JLabel("Religon :");
		name.setFont(new Font("raleway",Font.BOLD,20));
		name.setBounds(100, 110, 100, 30);
		add(name);
		
		
		//what is <object> in Jcombobox
		String valreligion[]={"Select","HIndu","Christan","Muslim","Other"};
		religon=new JComboBox<Object>(valreligion);
		religon.setFont(new Font("Raleway",Font.BOLD,14));
		religon.setBounds(300, 110, 400, 30);
		religon.setBackground(Color.white);
		add(religon);
		
	
		JLabel categ= new JLabel("Category :");
		categ.setFont(new Font("raleway",Font.BOLD,20));
		categ.setBounds(100, 160, 200, 30);
		add(categ);
		
		String valcast[]={"Select","Open","OBC","ST","SC","Other"};
		cast=new JComboBox<Object>(valcast);
		cast.setFont(new Font("Raleway",Font.BOLD,14));
		cast.setBounds(300, 160, 400, 30);
		cast.setBackground(Color.white);
		add(cast);
		
		
		JLabel in= new JLabel("Income :");
		in.setFont(new Font("raleway",Font.BOLD,20));
		in.setBounds(100, 210, 200, 30);
		add(in);
		
		String valincome[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000 & more"};
		inco=new JComboBox<Object>(valincome);
		inco.setFont(new Font("Raleway",Font.BOLD,14));
		inco.setBounds(300, 210, 400, 30);
		inco.setBackground(Color.white);
		add(inco);
		
		
		
		JLabel gen= new JLabel("Educational");
		gen.setFont(new Font("raleway",Font.BOLD,20));
		gen.setBounds(100, 260, 200, 30);
		add(gen);
		
		JLabel Qual= new JLabel("Qualification :");
		Qual.setFont(new Font("raleway",Font.BOLD,20));
		Qual.setBounds(100, 285, 200, 30);
		add(Qual);
		
		String valQual[]={"None","High School","UG","PG","Dr","Other"};
		Quali=new JComboBox<Object>(valQual);
		Quali.setFont(new Font("Raleway",Font.BOLD,14));
		Quali.setBounds(300, 270, 400, 30);
		Quali.setBackground(Color.white);
		add(Quali);
		
		
		JLabel marital= new JLabel("Ocupation :");
		marital.setFont(new Font("raleway",Font.BOLD,20));
		marital.setBounds(100, 335, 200, 30);
		add(marital);
		
		
		
		String valoccp[]={"Select","Salaried","Self Employed","Bussiness","Retired","Other"};
		occp=new JComboBox<Object>(valoccp);
		occp.setFont(new Font("Raleway",Font.BOLD,14));
		occp.setBounds(300, 335, 400, 30);
		occp.setBackground(Color.white);
		add(occp);
		
		
		
		JLabel adhar= new JLabel("Adhaar Number :");
		adhar.setFont(new Font("raleway",Font.BOLD,20));
		adhar.setBounds(100, 385, 200, 30);
		add(adhar);
		
		adhartextField = new JTextField();
		adhartextField.setFont(new Font("Raleway",Font.BOLD,14));
		adhartextField.setBounds(300, 385, 400, 30);
		add(adhartextField);
		
		
		
		JLabel panno= new JLabel("PAN No. :");
		panno.setFont(new Font("raleway",Font.BOLD,20));
		panno.setBounds(100, 435, 200, 30);
		add(panno);
		
		pantextField = new JTextField();
		pantextField.setFont(new Font("Raleway",Font.BOLD,14));
		pantextField.setBounds(300, 435, 400, 30);
		add(pantextField);
		
		JLabel seniorlabel= new JLabel("Senior Citizen :");
		seniorlabel.setFont(new Font("raleway",Font.BOLD,20));
		seniorlabel.setBounds(100, 485, 200, 30);
		add(seniorlabel);
		

		yes=new JRadioButton("Yes");
		yes.setBounds(350, 485, 100, 30);
		yes.setBackground(Color.white);
		add(yes);
		
		no=new JRadioButton("No");
		no.setBounds(480, 485, 100, 30);
		no.setBackground(Color.white);
		add(no);
		
		
		senior=new ButtonGroup();
		senior.add(yes);
		senior.add(no);
		
		JLabel ea= new JLabel("Exsiting Account  :");
		ea.setFont(new Font("raleway",Font.BOLD,20));
		ea.setBounds(100, 535, 200, 30);
		add(ea);
		
		
		byes=new JRadioButton("Yes");
		byes.setBounds(350, 535, 100, 30);
		byes.setBackground(Color.white);
		add(byes);
		
		bno=new JRadioButton("No");
		bno.setBounds(480, 535, 100, 30);
		bno.setBackground(Color.white);
		add(bno);
		
		
		Exsistingaccount=new ButtonGroup();
		Exsistingaccount.add(byes);
		Exsistingaccount.add(bno);
		
		
		
		
		
		
		
		
		
		

		
		
		
		next= new JButton("Next");
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620, 600, 80, 30);
		next.setForeground(Color.white);
		next.setBackground(Color.black);
		next.addActionListener(this);
		add(next);
		
		
		setVisible(true);//to resolve the error visibility
	}
	


	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String form_no=formno;
		
		String sreligon=(String) religon.getSelectedItem();
		String scast=(String) cast.getSelectedItem();
		String sinco=(String) inco.getSelectedItem();
		String seducation = (String) Quali.getSelectedItem();
		String soccupation = (String) occp.getSelectedItem();
		String seniorciti=null;
		if (yes.isSelected()) {
			seniorciti="Yes";
		} else if (no.isSelected()) {
			seniorciti="No";
		}
		
		String exisiting=null;
		if (byes.isSelected()) {
			exisiting="Yes";
		} else if (bno.isSelected()) {
			exisiting="No";
		}
		
		String sadhar=""+adhartextField.getText();
		String span=""+pantextField.getText();
		
		
		
			
		
		try {
			Conn cn = new Conn();
			
			String i2query="INSERT INTO signuptw values ('"+form_no+"','"+sreligon+"','"+scast+"','"+
			sinco+"','"+seducation+"','"+soccupation+"','"+seniorciti+"','"
					+exisiting+"','"+sadhar+"','"+span+"');" ;
			
			cn.st.execute(i2query);
			
			setVisible(false);
			new Signup_three(formno).setVisible(true);

			
			
		} catch (Exception e2) {
			System.out.println(e2);
			System.out.println(e2.getMessage());
			
			System.out.println(e2.getStackTrace());;

			}
		
		
		
		
		
		
	
		
		
		
		//for radio buttons it isselected
		//for textfield ""+gettextworks not in combobox
	}

	
	
	
	

	public static void main(String[] args) {
		//whats a need of main
		new Signup_two("");
		
	}
}
