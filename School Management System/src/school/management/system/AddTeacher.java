// ADD TEACHER

package school.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class AddTeacher implements ActionListener {

    JFrame f;
    JLabel id, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id15, id16, id17, lab, lab1, lab2;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    JButton b0, b1, b2, b3;
    JComboBox c1, c2;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    AddTeacher() {
        f = new JFrame("Add Teacher");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15 = new JLabel();
        id15.setBounds(0, 0, 900, 700);
        id15.setLayout(null);
        // ImageIcon img = new
        // ImageIcon(ClassLoader.getSystemResource("school/management/system/icons/fifth.jpg"));
        // Image i3 = img.getImage().getScaledInstance(920, 600,Image.SCALE_DEFAULT);
        // ImageIcon icc3 = new ImageIcon(i3);
        // id15.setIcon(icc3);

        // label
        id8 = new JLabel("NEW  TEACHER  DETAILS");
        id8.setBounds(250, 30, 500, 50);
        id8.setFont(new Font("serif", Font.BOLD, 35));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);

        // label
        id1 = new JLabel("First Name");
        id1.setBounds(50, 150, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id1);
        // textfield
        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        id15.add(t1);

        // label
        id2 = new JLabel("Last Name");
        id2.setBounds(400, 150, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id2);
        // textfield
        t2 = new JTextField();
        t2.setBounds(600, 150, 150, 30);
        id15.add(t2);

        // label
        id3 = new JLabel("Age");
        id3.setBounds(50, 200, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id3);
        // textfield
        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        id15.add(t3);

        // label
        id4 = new JLabel("DOB (dd/mm/yyyy)");
        id4.setBounds(400, 200, 200, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id4);
        // textfield
        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 30);
        id15.add(t4);

        // label
        id5 = new JLabel("Address");
        id5.setBounds(50, 250, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id5);
        // textfield
        t5 = new JTextField();
        t5.setBounds(200, 250, 150, 30);
        id15.add(t5);

        // label
        id6 = new JLabel("Phone no");
        id6.setBounds(400, 250, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id6);
        // textfield
        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 30);
        id15.add(t6);

        // label
        id7 = new JLabel("Email Id");
        id7.setBounds(50, 300, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id7);
        // textfield
        t7 = new JTextField();
        t7.setBounds(200, 300, 150, 30);
        id15.add(t7);

        // label
        id8 = new JLabel("Class X (%)");
        id8.setBounds(400, 300, 130, 30);
        id8.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id8);
        // textfield
        t8 = new JTextField();
        t8.setBounds(600, 300, 150, 30);
        id15.add(t8);

        // label
        id9 = new JLabel("Class XII (%)");
        id9.setBounds(50, 350, 130, 30);
        id9.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id9);
        // textfield
        t9 = new JTextField();
        t9.setBounds(200, 350, 150, 30);
        id15.add(t9);

        // label
        id10 = new JLabel("Aadhar No");
        id10.setBounds(400, 350, 100, 30);
        id10.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id10);
        // textfield
        t10 = new JTextField();
        t10.setBounds(600, 350, 150, 30);
        id15.add(t10);

        // label
        lab1 = new JLabel("Education");
        lab1.setBounds(50, 400, 150, 30);
        lab1.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(lab1);
        // textfield combobox
        String course[] = { "B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "BA", "BCom" };
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200, 400, 150, 30);
        id15.add(c1);

        // label
        lab2 = new JLabel("Subject");
        lab2.setBounds(400, 400, 150, 30);
        lab2.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(lab2);
        // textfield combobox
        String subject[] = { "English", "Maths", "Science", "History", "Geography", "Sanskrit", "Marathi" };
        c2 = new JComboBox(subject);
        c2.setBackground(Color.WHITE);
        c2.setBounds(600, 400, 150, 30);
        id15.add(c2);

        // label
        id11 = new JLabel("Emp id");
        id11.setBounds(50, 450, 150, 30);
        id11.setFont(new Font("serif", Font.BOLD, 20));
        id15.add(id11);
        // textfield
        t11 = new JTextField();
        t11.setText("101" + first);
        t11.setBounds(200, 450, 150, 30);
        id15.add(t11);

        // button
        b0 = new JButton("SUBMIT");
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.WHITE);
        b0.setBounds(250, 550, 150, 40);
        id15.add(b0);
        
        // button
        b1 = new JButton("CANCEL");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 550, 150, 40);
        id15.add(b1);

        b0.addActionListener(this);
        b1.addActionListener(this);

        f.setVisible(true);
        f.setSize(900, 700);
        f.setLocation(400, 100);
        f.getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae) {

        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = (String) c1.getSelectedItem();
        String l = (String) c2.getSelectedItem();
        String m = t11.getText();

        if (ae.getSource() == b0) {
            try {
                conn cc = new conn();
                String q = "insert into teacher values('" + a + "','" + bb + "','" + c + "','" + d + "','" + e + "','"
                        + ff + "','" + g + "','" + h + "','" + i + "','" + j + "','" + k + "','" + l + "','" + m + "')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                f.setVisible(false);

            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }
        } else if (ae.getSource() == b1) {
            f.setVisible(false);
            new Project().setVisible(true);

        }
    }

    public static void main(String[] arg) {
        new AddTeacher().f.setVisible(true);
    }
}