import java.awt.*;
public class CheckboxEx
{
public static void main(String args[ ])
{
Frame f = new Frame("Checkbox Example");
Checkbox c1 = new Checkbox ("C");
c1.setBounds(50, 100, 50,50);
Checkbox c2 = new Checkbox ("C++");
c2.setBounds(50, 150, 50,50);
Checkbox c3 = new Checkbox ("Java", true);
c3.setBounds(50, 200, 50,50);
f.add(c1);
f.add(c2);
f.add(c3);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}