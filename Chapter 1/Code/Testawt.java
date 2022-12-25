import java.awt.*;
public class Testawt
{
Testawt ( )
{
Frame f = new Frame( );
Button b = new Button (“click me”);
b.setBounds(20, 20, 60, 50);
f.add(b);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[ ])
{
Testawt t = new Testawt( );
}
}
