import java.awt.*;
public class AwtFrame
{
public static void main(String args[ ])
{
Frame f = new Frame( “Java AWT Frame”);
Label l1 = new Label (“Welcome to Sanjivani”, Label.CENTER);
f.add(l1); 
f.setSize(300, 300); 
f.setVisible(true); 
}
}