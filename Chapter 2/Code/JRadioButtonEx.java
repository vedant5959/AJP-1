import java.awt.*;
import javax.swing.*;
public class JRadioButtonEx
{
public static void main(String args[ ])
{
JFrame f = new JFrame("Checkbox Example");
JRadioButton c1 = new JRadioButton ("C");
c1.setBounds(50, 100, 50,50);
JRadioButton c2 = new JRadioButton ("C++");
c2.setBounds(50, 150, 50,50);
JRadioButton c3 = new JRadioButton ("Java", true);
c3.setBounds(50, 200, 70,50);
f.add(c1);
f.add(c2);
f.add(c3);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}
