import java.awt.*;
import javax.swing.*;
public class ex4{
    static JFrame frm=new JFrame("Border Layout");    
    public static void main(String args[]){
        frm.setSize(900,300); 
        frm.add(new JButton("East"),BorderLayout.EAST);
        frm.add(new JButton("West"),BorderLayout.WEST);
        frm.add(new JButton("South"),BorderLayout.SOUTH);
        frm.add(new JButton("North"),BorderLayout.NORTH);
        frm.add(new JButton("Center"),BorderLayout.CENTER);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    }
}