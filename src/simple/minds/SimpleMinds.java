package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMinds extends JFrame implements ActionListener {

    JButton b1,b2;
    JTextField t1;
    SimpleMinds(){
        setBounds(270,160,900,400); //d-left,//d-up,//length,//height//
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/login.jpeg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,480,400);
        add(l1);

        JLabel l2 = new JLabel("Amazing Brains");
        l2.setFont(new Font("Mongolian Baiti", Font.BOLD,40));
        l2.setForeground(Color.BLACK);
        l2.setBounds(550,40,300,40);
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        l3.setForeground(Color.BLUE);
        l3.setBounds(610,160,300,20);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(580,180,200,20);
        t1.setFont(new Font("Times New Roman", Font.BOLD,18));
        add(t1);

        b1=new JButton("Rules");
        b1.setBounds(580,250,80,25);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Exit");
        b2.setBounds(700,250,80,25);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);

        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new SimpleMinds();
    }
}
