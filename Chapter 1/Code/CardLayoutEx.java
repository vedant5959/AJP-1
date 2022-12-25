import java.awt.*;
public class CardLayoutEx
{
public static void main(String args[ ])
{
Frame f = new Frame( );
CardLayout obj = new CardLayout(60,60 );
f.setLayout(obj);
Button b1 = new Button ("Button 1");
Button b2 = new Button ("Button 2");
Button b3 = new Button ("Button 3");
f.add(b1);
f.add(b2);
f.add(b3);
f.setSize(300,300);
f.setVisible(true);
}
}