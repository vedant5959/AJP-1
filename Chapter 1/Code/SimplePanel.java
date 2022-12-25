import java.awt.*;
public class SimplePanel extends Frame
{
SimplePanel ( )
{
Frame f = new Frame( “ Panel Example”);
Panel p = new Panel( );
p.setBounds(20, 20, 60, 50);
p.setBackground(Color.red);
f.add(p);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[ ])
{
SimplePanel sp = new SimplePanel( );
}
}