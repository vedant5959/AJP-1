import java.awt.*;
public class CheckboxGroupEx
{
public static void main(String args[ ])
{
Frame f = new Frame("CheckboxGroup Example");
CheckboxGroup cbg = new CheckboxGroup ( );
Checkbox c1 = new Checkbox ("C++",cbg,false);
c1.setBounds(50, 100, 50,50);
Checkbox c2 = new Checkbox ("Java",cbg, true);
c2.setBounds(50, 200, 50,50);
f.add(c1);
f.add(c2);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}