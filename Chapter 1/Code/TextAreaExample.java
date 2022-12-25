import java.awt.*;
public class TextAreaExample
{
public static void main(String args[ ])
{
Frame f = new Frame( );
TextArea t1 = new Textarea(“Welcome in Sanjivani”);
t1.setBounds(50, 80, 300, 300);
f.add(t1);
f.add(t2);
f.setSize(400, 400);
f.setLayout(null);
f.setVisible(true);
}
}