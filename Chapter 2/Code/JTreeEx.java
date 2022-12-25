import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeEx
{
public static void main(String args[ ])
{
JFrame f = new JFrame( );
DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
top.add(style);
DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
top.add(color);
DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
top.add(font);
DefaultMutableTreeNode s1 = new DefaultMutableTreeNode("Regular");
DefaultMutableTreeNode s2 = new DefaultMutableTreeNode("Italic");
DefaultMutableTreeNode s3 = new DefaultMutableTreeNode("Bold");
style.add(s1); style.add(s2); style.add(s3);
DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Red");
DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Green");
DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("Blue");
color.add(c1); color.add(c2); color.add(c3);
JTree jt =new JTree(top);
JScrollPane jsp =new JScrollPane(jt);
f.add(jsp);
f.setSize(100,100);
f.setVisible(true);
}
}