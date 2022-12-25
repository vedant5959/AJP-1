import java.awt.*;
public class ListEx
{
public static void main(String args[ ])
{
Frame f = new Frame(“List Example");
List country = new List (2);
country.setBounds(40, 40, 60,60);
List capital = new List (2);
capital.setBounds(100, 100, 60,60);
country.add("India");
country.add("Shrilanka");
capital.add("Delhi");
capital.add("Colombo");
f.add(country);
f.add( capital);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}
