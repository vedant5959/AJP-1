import java.awt.*;
public class Simple extends Frame
{
Simple( )
{
setSize(400, 400);
setLayout(null);
setVisible(true);
setTitle(“Third Year”);
}
public void paint( Graphics g)
{
g.drawString(“ Welcome Students…” , 100, 100);
}
public static void main(String args[ ])
{
Simple s = new Simple( );
}
}