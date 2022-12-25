import java.awt.*;
import javax.swing.*;
public class SwingEx
{
SwingEx( )
{
JFrame f = new JFrame( );
JButton b = new JButton ("Welcome");
b.setBounds(130, 100,100,40);
f.add(b);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[ ])
{
SwingEx t = new SwingEx( );
}
}