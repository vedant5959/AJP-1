import java.awt.*;
import javax.swing.*;
public class JScrollPaneEx
{
public static void main(String args[ ])
{
JFrame f = new JFrame( );
String c[ ] = {"Geeks", "Language", "Java", "Sudo Placement", "Python",
"CS Subject", "Operating System", "Object Oriented Programming Language",
"Data Structure", "Algorithm","Advanced Java Programming Language",
"PHP language", "JAVASCRIPT",
"C Sharp"};
JList list=new JList(c);
JScrollPane sp=new JScrollPane(list);
f.setLayout(new BorderLayout( ));
f.add(sp);
f.setSize(150,150);
f.setVisible(true);
}
}
