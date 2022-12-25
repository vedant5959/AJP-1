import java.awt.*;
public class ScrollbarEx
{
public static void main(String args[ ])
{
Frame f = new Frame( );
Scrollbar s = new Scrollbar( );
s.setBounds(100, 100, 50,100);
f.add(s);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}