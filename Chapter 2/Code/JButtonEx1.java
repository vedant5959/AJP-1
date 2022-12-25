import java.awt.*;
import javax.swing.*;
public class JButtonEx1
{
public static void main(String args[ ])
{
JFrame f = new JFrame( );
ImageIcon m=new ImageIcon("flower.jpg");
JButton b = new JButton(m);
b.setBounds(50, 50,95, 30);
f.add(b);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}