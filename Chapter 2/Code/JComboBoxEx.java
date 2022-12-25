import java.awt.*;
import javax.swing.*;
public class JComboBoxEx
{
public static void main(String args[ ])
{
JFrame f = new JFrame("JComboBox Example");
String country[ ] ={"India", "USA","England","Aus","Newzaland"};
JComboBox cb = new JComboBox (country);
cb.setBounds(130, 100, 100, 40);
f.add(cb);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
}