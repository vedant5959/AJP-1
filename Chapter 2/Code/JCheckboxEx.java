import java.awt.*;
import javax.swing.*;
public class JCheckboxEx
{
public static void main(String args[ ])
{
JFrame f = new JFrame("Checkbox Example");
JCheckBox c1 = new JCheckBox ("C");
c1.setBounds(50, 100, 50,50);
JCheckBox c2 = new JCheckBox ("C++");
c2.setBounds(50, 150, 50,50);
JCheckBox c3 = new JCheckBox ("Java", true);
c3.setBounds(50, 200, 70,50);
f.add(c1);
f.add(c2);
f.add(c3);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}