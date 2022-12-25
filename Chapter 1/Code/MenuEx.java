import java.awt.*;
public class MenuEx extends Frame
{
MenuEx ( )
{
MenuBar mb = new MenuBar( );
setMenuBar(mb); // add menu bar to frame
Menu a = new Menu("Colors");
Menu b = new Menu("Fonts");
Menu c = new Menu("Exit");
mb.add(a); // add menus to menu bar
mb.add(b);
mb.add(c);
setSize(300, 300);
setVisible(true);
}
public static void main(String args[ ])
{
MenuEx obj =new MenuEx( );
}
}