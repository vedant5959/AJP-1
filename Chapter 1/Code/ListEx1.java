import java.awt.*;
public class ListEx1
{
public static void main(String args[ ])
{
Frame f = new Frame("List Example");
List l1 = new List (5);
l1.setBounds(100, 100, 90,70);
l1.add("June");
l1.add("July");
l1.add("August");
l1.add("September");
l1.add("October");
f.add(l1);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}
