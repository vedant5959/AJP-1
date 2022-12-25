import java.awt.*;
import javax.swing.*;
/*<applet code= "JTextFieldEx.class" width=300 height=300> </applet> */
public class JTextFieldEx extends JApplet
{
JLabel l1;
JTextField t1;
public void init( )
{
Container cPane = getContentPane( );
cPane.setLayout(new FlowLayout( ));
l1 = new JLabel("TextField");
cPane.add(l1);
t1 = new JTextField(10);
cPane.add(t1);
}
}