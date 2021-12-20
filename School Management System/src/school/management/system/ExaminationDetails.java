// EXAM DETAILS 

package school.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{

   //these variables are only accesible in this class
   private JPanel contentPane;
   private JTable table;
   private JTextField search;
   private JButton b1,b2,b3;

 public void Book() {
        try {
	    //object of class conn which is used to establish connection with MySQL
            conn con = new conn();
	    //sql command to retrieve data from table student 
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
	   
	    //setting the dataset retrieved in rs to table
	    table.setModel(DbUtils.resultSetToTableModel(rs));
	
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {}

    }
public ExaminationDetails() {
	
        setBounds(350, 200, 930, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 1080, 282);
        contentPane.add(scrollPane);

	table = new JTable();
	
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               int row = table.getSelectedRow();

	       //listens which row is selected and fetches that row's roll and sets it text field
               search.setText(table.getModel().getValueAt(row, 10).toString());
            }
        });

	//setting table in scrollpane
	scrollPane.setViewportView(table);

	//creating new button result selecting its position , size and adding it
	b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBounds(564, 89, 138, 33);
        contentPane.add(b1);

	//creating and adding label Check result to show title
	JLabel l1 = new JLabel("Check Result");
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);
	
	//adding textfield search
	search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

	//onclicking Back the window disappears as action does its visibilty to false
	JLabel l3 = new JLabel("Back");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
	l3.setBounds(97, 89, 72, 33);
        contentPane.add(l3);
 
	JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Book-Details",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(67, 54, 1100, 368);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        Book();
        setSize(1200,500);
    }

	public void actionPerformed(ActionEvent ae){
        try{
	    
            conn con = new conn();
            if(ae.getSource() == b1){
		//calls Marks.java which when becomes visible ,ExaminationDetails window disappears            
                new Marks(search.getText()).setVisible(true);
                this.setVisible(false);
            };
        }
        catch(Exception e){}
    }

//main fuction
    public static void main(String[] args){
        new ExaminationDetails().setVisible(true);
    }
}