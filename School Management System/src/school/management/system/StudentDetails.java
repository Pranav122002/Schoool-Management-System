
// STUDENT DETAILS
package school.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentDetails extends JFrame implements ActionListener{
 
    JLabel l1,l2,l3,l4;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"First Name","Last Name","Age","Date of Birth","Address","Phone","Email","Mother Tongue)", "Standard","Aadhar No","Roll No"};
    String y[][] = new String[20][11];
    int i=0, j=0;
    
    StudentDetails(){
        
        super("Student Details");
        setSize(1260,650);
        setLocation(200,100);
        setLayout(null);
        
        // label
        l4 = new JLabel("STUDENT  DETAILS");
        l4.setBounds(430, 8, 500, 50);
        l4.setFont(new Font("serif", Font.BOLD, 30));
        add(l4);
        
        // label
        l1 = new JLabel("Enter roll number to delete Student : ");
        l1.setBounds(50,420,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        // textfield
        t2 = new JTextField();
        t2.setBounds(400,420,200,30);
        add(t2);
        // button
        b1 = new JButton("DELETE");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 420, 100 ,30);
        add(b1);
            
        // label
        l2 = new JLabel("Add New Student");
        l2.setBounds(50,480,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        // button
        b2 = new JButton("ADD STUDENT");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 480, 150 ,30);
        add(b2);
        
        // label
        l3 = new JLabel("Update Student Details");
        l3.setBounds(50,520,400,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);
        // button
        b3 = new JButton("UPDATE STUDENT");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300, 520, 150 ,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        try{
            conn c1  = new conn();
            String s1 = "select * from student";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("first_name");
                y[i][j++]=rs.getString("last_name");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("mother_tongue");
                y[i][j++]=rs.getString("standard");
                y[i][j++]=rs.getString("aadhar");
                y[i][j++]=rs.getString("rollno");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);   
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,58,1200,330);
        add(sp);
        getContentPane().setBackground(Color.WHITE);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from student where rollno = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddStudent().f.setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            new UpdateStudent().f.setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new StudentDetails().setVisible(true);
    }
    
}
