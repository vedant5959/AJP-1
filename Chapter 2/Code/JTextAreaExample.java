import java.awt.*;
import javax.swing.*;
public class JTextAreaExample
{
public static void main(String args[ ])
{
JFrame f = new JFrame( );
JTextArea t1 = new JTextArea("Advanced Java Programming");
t1.setBounds(50, 50,200, 200);
f.add(t1);
f.setSize(400, 400);
f.setLayout(null);
f.setVisible(true);
}
}