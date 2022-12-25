import java.awt.*;
import javax.swing.*;
public class JLabelExample2 extends JFrame
{
public JLabelExample2( )
{
JLabel one = new JLabel ("First Label");
JLabel two = new JLabel("Second Label");
JLabel three = new JLabel("Third Label");
one.setBounds(50, 50, 100, 100);
two.setBounds(150, 50, 100, 100);
three.setBounds(250, 50, 100, 100);
add(one);
add(two);
add(three);
setSize(300, 300);
setLayout(null);
setVisible(true);
}
public static void main(String args[ ])
{
JLabelExample2 obj = new JLabelExample2( );
}
}