package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton b1,b2;
    String username;

    Rules( String username){
        this.username=username;
        setBounds(420,130,700,500);
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);

        JLabel l1=new JLabel(" welcome " + username +" to simple minds ");
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
        l1.setBounds(50,20,700,30);
        add(l1);

        JLabel l2 = new JLabel();
        l2.setFont(new Font("Tahoma",Font.PLAIN,14));
        l2.setBounds(20,85,600,300);
        l2.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
        add(l2);

        b1= new JButton("Back");
        b1.setBounds(220,400,100,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("Start");
        b2.setBounds(380,400,100,30);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);

        }
    }

    public static void main(String[] args){
        new Rules("");

    }
}
