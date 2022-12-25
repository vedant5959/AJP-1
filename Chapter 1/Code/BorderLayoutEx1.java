import java.awt.*;
public class BorderLayoutEx1
{
public static void main(String args[ ])
{
Frame f = new Frame("Border Layout");
BorderLayout obj=new BorderLayout();
Button b1 = new Button ("NORTH");
Button b2 = new Button ("SOUTH");
Button b3 = new Button ("EAST");
Button b4 = new Button ("WEST");
TextArea t = new TextArea(4,4);
f.add(b1, BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.EAST);
f.add(b4,BorderLayout.WEST);
f.add(t ,BorderLayout.CENTER);
f.setSize(300,300);
f.setVisible(true);
}
}