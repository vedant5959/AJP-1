import java.awt.*;
public class MenuDemo extends Frame
{
MenuDemo ( )
{
MenuBar mb = new MenuBar( ); 
setMenuBar(mb); 
Menu a = new Menu("Colors"); 
Menu b = new Menu("Fonts");
Menu c = new Menu("Exit");
mb.add(a); 
mb.add(b);
mb.add(c);
MenuItem m1 = new MenuItem("RED"); 
//MenuItem m2 = new MenuItem("GREEN");
CheckboxMenuItem m2 = new CheckboxMenuItem("GREEN",true);
MenuItem m3 = new MenuItem("BLUE");
a.add(m1); 
a.add(m2);
a.add(m3);
MenuItem m4 = new MenuItem("Times New Roman");
MenuItem m5 = new MenuItem("Cambria");
MenuItem m6 = new MenuItem("Arial");
b.add(m4);
b.addSeparator( ); 
b.add(m5);
b.addSeparator( );
b.add(m6);
setSize(300, 300);
setVisible(true);
}
public static void main(String args[ ])
{
MenuDemo obj =new MenuDemo( );
}
}