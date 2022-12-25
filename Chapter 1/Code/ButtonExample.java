import java.awt.*;
public class ButtonExample
{
public static void main(String args[ ])
{
Frame f = new Frame( “Button Example”);
Button b = new Button (“Click Here”);
b.setBounds(50, 100, 100, 30);
f.add(b);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}