import java.awt.*;
public class DialogEx extends Dialog
{
DialogEx(Frame parent, String title)
{
super(parent, title,false);
setLayout(new FlowLayout( ));
setSize(300,200);
setBackground(Color.pink);
Button b1 = new Button ("Okay");
add(b1);
}
public static void main(String args[ ])
{
Frame f = new Frame( );
DialogEx obj = new DialogEx(f, "Hello" );
obj.setVisible(true);
}
}