import java.awt.*;
public class BorderLayoutEx2
{
public static void main(String args[ ])
{
Frame f = new Frame( );
f.setLayout(new BorderLayout ( ));
Button b1 = new Button ("Button 1");
b1.setBackground(Color.pink);
Button b2 = new Button ("Button 2");
b2.setBackground(Color.blue);
Button b3 = new Button ("Button 3");
b3.setBackground(Color.cyan);
Button b4 = new Button ("Button 4");
b4.setBackground(Color.yellow);
Button b5 = new Button ("Button 5");
b5.setBackground(Color.green);
f.add(b1, BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.EAST);
f.add(b4,BorderLayout.WEST);
f.add(b5,BorderLayout.CENTER);
f.setSize(300,300);
f.setVisible(true);
}
}