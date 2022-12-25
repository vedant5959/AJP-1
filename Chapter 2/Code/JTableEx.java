import java.awt.*;
import javax.swing.*;
public class JTableEx
{
public static void main(String args[ ])
{
JFrame f = new JFrame( );
String data[ ][ ] ={{ "101","Vedant","20000"},
{ "102","Om","40000"},
{ "103","Gopal","70000"}};
String column[ ]={"ID","NAME","SALARY"};
JTable jt = new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp= new JScrollPane(jt);
f.add(sp);
f.setSize(300,400);
f.setVisible(true);
}
}
