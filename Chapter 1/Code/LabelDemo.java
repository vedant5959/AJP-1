import java.awt.*;
import java.applet.*;
/*<applet code="LabelDemo.class" width=200 height=100></applet>*/
public class LabelDemo extends Applet
{
public void init()
{
Label l1= new Label("One");
Label l2= new Label("Two");
Label l3=new Label("Three");
//add labels to applet window
add(l1);
add(l2);
add(l3);
}
}