import javax.swing.*;
public class JPasswordEx extends JFrame
{
public static void main(String args[ ])
{
JFrame f =new JFrame("Password Field Example");
JLabel obj =new JLabel ("Password:");
obj.setBounds(20,100,80,30);
JPasswordField pf= new JPasswordField( );
pf.setBounds(100,100,100,30);
f.add(obj);
f.add(pf);
f. setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}