import java.awt.*;
public class TextFieldExample
{
public static void main(String args[ ])
{
Frame f = new Frame( “TextField Example”);
TextField t1 = new TextField (“Welcome”);
t1.setBounds(50, 100, 100, 30);
TextField t2 = new TextField (“in Sanjivani”);
t2.setBounds(50, 150, 100, 30);
f.add(t1);
f.add(t2);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}