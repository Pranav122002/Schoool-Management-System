// PROJECT

package school.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
	Project(){
		//Assigns name to window
		super("School Management System");

		setSize(1920,1030);
		//Select background image
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("school/management/system/icons/third.jpg"));
		
		Image i3=ic.getImage().getScaledInstance(1900,950,Image.SCALE_DEFAULT);
		ImageIcon icc3 = new ImageIcon(i3);
		JLabel l1 = new JLabel(icc3);

		//Add background image to frame

		add(l1);

		//Create the menubar
		JMenuBar mb = new JMenuBar();

		//Create the menu Main
		JMenu main = new JMenu("Main");

		//Creating menu items for Main
		JMenuItem m1 = new JMenuItem("New Faculty");
		JMenuItem m2 = new JMenuItem("New Student Admission");
		

		//assigning listener to New Faculty and New Student Admission
		m1.addActionListener(this);
		m2.addActionListener(this);


		//Create menu DEtails and menu items Student Details and Teacher Details
		JMenu user = new JMenu("Details");
        	JMenuItem u1 = new JMenuItem("Student Details");
        	JMenuItem u2 = new JMenuItem("Teacher Details");
		
		//assigning listener  to Student Details and Teacher Details 
		u1.addActionListener(this);
       		u2.addActionListener(this);

		//creating menu Attendance and its menu items
		JMenu attendance = new JMenu("Attendance");
        	JMenuItem a1 = new JMenuItem("Student Attendance");
        	JMenuItem a2 = new JMenuItem("Teacher Attendance");

		//assigning listener  to Student Attendance and Teacher Attendance 
		a1.addActionListener(this);
        	a2.addActionListener(this);

		//creating menu Attendance Detail and its menu items
		JMenu attendance_detail = new JMenu("Attendance Detail");
        	JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        	JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");

		//Assigning listener to Student Attendance Detail and Teacher Attendance Detail
		b1.addActionListener(this);
        	b2.addActionListener(this);

		//creating menu Examination and its menu items
		JMenu exam = new JMenu("Examination");
        	JMenuItem c1 = new JMenuItem("Examination Details");
        	JMenuItem c2 = new JMenuItem("Enter Marks");

		//Assigning listener to Examination Detail and Enter Marks
		c1.addActionListener(this);
        	c2.addActionListener(this);


		//creating menu Update deatils and its menu items
		JMenu report = new JMenu("Update Details");
        	JMenuItem r1 = new JMenuItem("Update Students");
        	JMenuItem r2 = new JMenuItem("Update Teachers");

		//assigning listemers to Update Students and Update Teachers
		r1.addActionListener(this);
		r2.addActionListener(this);


		//creating menu Fee deatils and its menu items
		JMenu fee = new JMenu("Fee Details");
        	JMenuItem s1 = new JMenuItem("Fee Structure");


		
		s1.addActionListener(this);

		
		JMenu exit = new JMenu("Exit");
        	JMenuItem ex = new JMenuItem("Exit");
		
		ex.addActionListener(this);

		//Adding menu items New Faculty and New Student Admission to menu main
		main.add(m1);
        	main.add(m2);

		//Adding menu items Student Details and Teacher Details to menu Details
		user.add(u1);
        	user.add(u2);
		

		//Adding menu items Update Students and Update Teachers to menu Update Details
		report.add(r1);
        	report.add(r2);


	
		fee.add(s1);

                
                attendance.add(a1);
                attendance.add(a2);
                
                attendance_detail.add(b1);
                attendance_detail.add(b2);
                
                exam.add(c1);
                exam.add(c2);
                
		exit.add(ex);

		//Adding menus to menubar
		mb.add(main);
        	mb.add(user);
       		mb.add(attendance);
        	mb.add(attendance_detail);
        	mb.add(exam);
        	mb.add(report);
        	mb.add(fee);
        	mb.add(exit);
		
		//setting menubar to frame
		setJMenuBar(mb);
/*
		setFont(new Font("Senserif",Font.BOLD,16));
        	setLayout(new FlowLayout());
        	setVisible(false);   */

	}

	//assigning actions when the various defined listeners start to receive input
	public void actionPerformed(ActionEvent ae){
		//store the received command in form of string
        	String msg = ae.getActionCommand();
		
		//match string using else-if  and when matched open that page by making it visible
		if(msg.equals("New Student Admission")){
            		new AddStudent().f.setVisible(true);
            
        	}else if(msg.equals("New Faculty")){
            		new AddTeacher().f.setVisible(true);
            
        	}else if(msg.equals("Student Details")){
            		new StudentDetails().setVisible(true);
            
        	}else if(msg.equals("Teacher Details")){
            		new TeacherDetails().setVisible(true);
           
        
        	}else if(msg.equals("Update Students")){
            		new UpdateStudent().f.setVisible(true);
           
        
        	}else if(msg.equals("Update Teachers")){
            		new UpdateTeacher().f.setVisible(true);
           
        
        	}else if(msg.equals("Fee Structure")){
            		new FeeStructure().setVisible(true);
           
       
           
        	}else if(msg.equals("Exit")){
            		System.exit(0);

		}else if(msg.equals("Student Attendance")){
            		new StudentAttendance().setVisible(true);

        	}else if(msg.equals("Teacher Attendance")){
            		new TeacherAttendance().setVisible(true);

        	}else if(msg.equals("Student Attendance Detail")){
            		new StudentAttendanceDetail().setVisible(true);

        	}else if(msg.equals("Teacher Attendance Detail")){
            		new TeacherAttendanceDetail().setVisible(true);

        	}else if(msg.equals("Examination Details")){
            		new ExaminationDetails().setVisible(true);

        	}else if(msg.equals("Enter Marks")){
            		new EnterMarks().setVisible(true);
        }
        
    }

//Define main function
public static void main(String[] args){
	//make the homescreen of sms visible when it is run
        new Project().setVisible(true);
    }
    
}
		
