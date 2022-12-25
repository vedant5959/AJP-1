import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*<applet code="JTabbedPaneDemo.class" width=400 height=100> </applet>*/
public class JTabbedPaneDemo extends JApplet
{
public void init()
{
JTabbedPane jtp = new JTabbedPane();
jtp.addTab("Languages", new LangPanel());
jtp.addTab("Colors", new ColorsPanel());
jtp.addTab("Flavors", new FlavorsPanel());
getContentPane().add(jtp);
}
}
class LangPanel extends JPanel
{
public LangPanel()
{
JButton b1 = new JButton("Marathi");
add(b1);
JButton b2 = new JButton("Hindi");
add(b2);
Jbutton b3 = new JButton("Bengali");
add(b3);
Jbutton b4 = new JButton("Tamil");
add(b4);
}
}
class ColorsPanel extends Jpanel
{
public ColorsPanel()
{
JCheckBox cb1 = new JCheckBox("Red");
add(cb1);
JCheckBox cb2 = new JCheckBox("Green");
add(cb2);
JCheckBox cb3 = new JCheckBox("Blue");
add(cb3);
}
}
class FlavorsPanel extends JPanel
{
public FlavorsPanel()
{
JComboBox jcb = new JComboBox();
jcb.addItem("Vanilla");
jcb.addItem("Chocolate");
jcb.addItem("Strawberry");
add(jcb);
}
}