import java.awt.*;
public class ButtonEx2
{
public static void main(String args[ ])
{
Frame f = new Frame("Button Example");
Button b1 = new Button ("Okay");
b1.setBounds(50, 100, 100, 30);
Button b2 = new Button ("Cancel");
b2.setBounds(100, 200, 100, 30);
f.add(b1);
f.add(b2);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}