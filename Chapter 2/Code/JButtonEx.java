import java.awt.*;
import javax.swing.*;
public class JButtonEx
{
public static void main(String args[ ])
{
JFrame f = new JFrame( );
JButton b = new JButton("Click Here");
b.setBounds(50, 50,95, 30);
f.add(b);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}