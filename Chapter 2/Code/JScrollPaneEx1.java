import java.awt.*;
import javax.swing.*;
/*<applet code="JScrollPaneEx1.class" width=300 height=250> </applet> */
public class JScrollPaneEx1 extends Japplet
{
public void init( )
{
setLayout(new BorderLayout ( ));
JPanel jp=new JPanel( );
jp.setLayout(new GridLayout(10,10));
int b=0;
for(int i=0;i<10;i++) {
for(int j=0;j<10;j++) {
jp.add(new JButton("Button " +b));
++b; } }
int vsb =ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int hsb =ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp = new JScrollPane(jp, vsb, hsb);
add(jsp, BorderLayout.CENTER);
}
}
