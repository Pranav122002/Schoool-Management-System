// FEE STRUCTURE

package school.management.system;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame
{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    
    public FeeStructure()
    {
        
        setSize(450,900);
        setLocation(200,200);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setBounds(80,10,400,70);
        add(i1);
        
        l1 = new JLabel("Standard");
        l1.setBounds(80,100,150,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        add(l1);
        
        l2 = new JLabel("Fees");
        l2.setBounds(280,100,200,40);
        l2.setFont(new Font("serif",Font.BOLD,26));
        add(l2);
        
        
        l3 = new JLabel("Standard 1");
        l3.setBounds(80,170,150,40);
        l3.setFont(new Font("serif",Font.BOLD,26));
        add(l3);
        
        l4 = new JLabel("Standard 2");
        l4.setBounds(80,240,150,40);
        l4.setFont(new Font("serif",Font.BOLD,26));
        add(l4);
        
        l5 = new JLabel("Standard 3");
        l5.setBounds(80,310,150,40);
        l5.setFont(new Font("serif",Font.BOLD,26));
        add(l5);
        
        l6 = new JLabel("Standard 4");
        l6.setBounds(80,380,150,40);
        l6.setFont(new Font("serif",Font.BOLD,26));
        add(l6);
        
        l7 = new JLabel("Standard 5");
        l7.setBounds(80,450,150,40);
        l7.setFont(new Font("serif",Font.BOLD,26));
        add(l7);
        
        l8 = new JLabel("Standard 6");
        l8.setBounds(80,520,150,40);
        l8.setFont(new Font("serif",Font.BOLD,26));
        add(l8);
        
        l9 = new JLabel("Standard 7");
        l9.setBounds(80,590,150,40);
        l9.setFont(new Font("serif",Font.BOLD,26));
        add(l9);
        
        l10 = new JLabel("Standard 8");
        l10.setBounds(80,660,150,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        add(l10);
        
        l11 = new JLabel("Standard 9");
        l11.setBounds(80,730,150,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        add(l11);
        
        l12 = new JLabel("Standard 10");
        l12.setBounds(80,800,150,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        add(l12);
        
        
        b1 = new JLabel("Rs 10000");
        b1.setBounds(280,170,200,40);
        b1.setFont(new Font("serif",Font.PLAIN,26));
        add(b1);
        
        b2 = new JLabel("Rs 20000");
        b2.setBounds(280,240,200,40);
        b2.setFont(new Font("serif",Font.PLAIN,26));
        add(b2);
        
        b3 = new JLabel("Rs 30000");
        b3.setBounds(280,310,200,40);
        b3.setFont(new Font("serif",Font.PLAIN,26));
        add(b3);
        
        b4 = new JLabel("Rs 40000");
        b4.setBounds(280,380,200,40);
        b4.setFont(new Font("serif",Font.PLAIN,26));
        add(b4);
        
        b5 = new JLabel("Rs 50000");
        b5.setBounds(280,450,200,40);
        b5.setFont(new Font("serif",Font.PLAIN,26));
        add(b5);
        
        b6 = new JLabel("Rs 60000");
        b6.setBounds(280,520,200,40);
        b6.setFont(new Font("serif",Font.PLAIN,26));
        add(b6);
        
        b7 = new JLabel("Rs 70000");
        b7.setBounds(280,590,200,40);
        b7.setFont(new Font("serif",Font.PLAIN,26));
        add(b7);
        
        b8 = new JLabel("Rs 80000");
        b8.setBounds(280,660,200,40);
        b8.setFont(new Font("serif",Font.PLAIN,26));
        add(b8);
        
        b9 = new JLabel("Rs 90000");
        b9.setBounds(280,730,200,40);
        b9.setFont(new Font("serif",Font.PLAIN,26));
        add(b9);
        
        b10 = new JLabel("Rs 100000");
        b10.setBounds(280,800,250,40);
        b10.setFont(new Font("serif",Font.PLAIN,26));
        add(b10);
             
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new FeeStructure().setVisible(true);
    }
}
