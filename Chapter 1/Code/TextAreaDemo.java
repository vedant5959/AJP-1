import java.awt.*;
import java.applet.*;
/*<applet code="TextAreaDemo.class" width=200 height=100></applet>*/
public class TextAreaDemo extends Applet
{
public void init()
{
TextArea t1= new TextArea(); //A
TextArea t2= new TextArea(3, 10); //B
TextArea t3= new TextArea("Empty Area "); //C
TextArea t4= new TextArea("Empty Area", 3, 10); //D
//add TextArea to applet window
add(t1);
add(t2);
add(t3);
add(t4);
}
}