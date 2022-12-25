import java.awt.*;
import javax.swing.*;
/*<applet code="JLabelEx.class" width=300 height=300> </applet> */
public class JLabelEx extends JApplet
{
public void init( )
{
Container cPane = getContentPane( );
ImageIcon i1= new ImageIcon("flower.jpg");
JLabel l1 = new JLabel("flower", i1, JLabel.CENTER);
cPane.add(l1);
}
}
