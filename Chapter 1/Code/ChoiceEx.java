import java.awt.*;
public class ChoiceEx
{
public static void main(String args[ ])
{
Frame f = new Frame( );
Choice c = new Choice( );
c.setBounds(80, 80, 100,100);
f.add(c);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}