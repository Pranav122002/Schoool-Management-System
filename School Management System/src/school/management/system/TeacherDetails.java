// TEACHER DETAILS

package school.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TeacherDetails extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTable t1;
    JButton b1, b2, b3;
    JTextField t2;
    String x[] = { "First Name", "Last Name", "Age", "Date of Birth", "Address", "Phone", "Email", "Class X(%)",
            "Class XII(%)", "Aadhar No", "Education", "Subject", "Employee Id" };
    String y[][] = new String[20][13];
    int i = 0, j = 0;

    TeacherDetails() {
        super("Teacher Details");
        setSize(1260, 650);
        setLocation(200, 100);
        setLayout(null);

        // label
        l4 = new JLabel("TEACHER  DETAILS");
        l4.setBounds(430, 8, 500, 50);
        l4.setFont(new Font("serif", Font.BOLD, 30));
        add(l4);

        // label
        l1 = new JLabel("Enter employee number to delete Teacher : ");
        l1.setBounds(50,420,400,30);
        l1.setFont(new Font("serif", Font.BOLD, 20));
        add(l1);
        // textfield
        t2 = new JTextField();
        t2.setBounds(430,420,200,30);
        add(t2);
        // button
        b1 = new JButton("DELETE");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(650, 420, 100 ,30);
        add(b1);

        // label
        l2 = new JLabel("Add New Teacher");
        l2.setBounds(50,480,400,30);
        l2.setFont(new Font("serif", Font.BOLD, 20));
        add(l2);
        // button
        b2 = new JButton("ADD TEACHER");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 480, 150 ,30);
        add(b2);

        // label
        l3 = new JLabel("Update Teacher Details");
        l3.setBounds(50,520,400,30);
        l3.setFont(new Font("serif", Font.BOLD, 20));
        add(l3);
        // button
        b3 = new JButton("UPDATE TEACHER");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300, 520, 150 ,30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        try {
            conn c1 = new conn();
            String s1 = "select * from teacher";
            ResultSet rs = c1.s.executeQuery(s1);
            while (rs.next()) {
                y[i][j++] = rs.getString("first_name");
                y[i][j++] = rs.getString("last_name");
                y[i][j++] = rs.getString("age");
                y[i][j++] = rs.getString("dob");
                y[i][j++] = rs.getString("address");
                y[i][j++] = rs.getString("phone");
                y[i][j++] = rs.getString("email");
                y[i][j++] = rs.getString("class_x");
                y[i][j++] = rs.getString("class_xii");
                y[i][j++] = rs.getString("aadhar");
                y[i][j++] = rs.getString("education");
                y[i][j++] = rs.getString("subject");
                y[i][j++] = rs.getString("emp_id");
                i++;
                j = 0;
            }
            t1 = new JTable(y, x);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,58,1200,330);
        add(sp);
        getContentPane().setBackground(Color.WHITE);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        conn c1 = new conn();
        if (ae.getSource() == b1) {
            try {
                String a = t2.getText();
                String q = "delete from teacher where emp_id = '" + a + "'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new TeacherDetails().setVisible(true);
            } catch (Exception e) {
            }

        } else if (ae.getSource() == b2) {
            new AddTeacher().f.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == b3) {
            new UpdateTeacher().f.setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new TeacherDetails().setVisible(true);
    }

}
