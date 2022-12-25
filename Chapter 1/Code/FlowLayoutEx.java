import java.awt.*;
public class FlowLayoutEx
{
public static void main(String args[ ])
{
Frame f = new Frame( );
FlowLayout obj = new FlowLayout( );
Button b1 = new Button ("Button 1");
Button b2 = new Button ("Button 2");
Button b3 = new Button ("Button 3");
Button b4 = new Button ("Button 4");
Button b5 = new Button ("Button 5");
Button b6 = new Button ("Button 6");
f.add(b1); f.add(b2); f.add(b3);
f.add(b4); f.add(b5); f.add(b6);
f.setLayout(obj);
f.setSize(300, 300);
f.setVisible(true);
}
}