import java.awt.*;
public class SimplePanel1 extends Frame
{
SimplePanel ( )
{
Frame f = new Frame("Panel Example");
Panel p = new Panel( );
p.setBounds(20,40, 200, 100); 
p.setBackground(Color.red);
f.add(p);
Button b = new Button ("click me");
b.setBounds(40, 70, 60, 50);
p.add(b); // adding button into frame
f.setSize(400, 400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[ ])
{
SimplePanel sp = new SimplePanel( );
}
}
