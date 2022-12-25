import java.awt.*;
import javax.swing.*;
public class JButtonExample
{
public static void main(String args[ ])
{
JFrame f = new JFrame("JButton Example");
JButton b = new JButton ("Click Here");
b.setBounds(130, 100, 100, 40);
f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
}