import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class JTreeEx1
{
public static void main(String args[ ])
{
JFrame f = new JFrame( );
DefaultMutableTreeNode root = new DefaultMutableTreeNode("States");
DefaultMutableTreeNode parent1 = new DefaultMutableTreeNode("Maharashtra");
DefaultMutableTreeNode child = new DefaultMutableTreeNode("Ahemadnagar");
DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Nasik");
DefaultMutableTreeNode parent2 = new DefaultMutableTreeNode("Rajasthan");
DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Jaipur");
parent1.add(child);
parent1.add(child1);
parent2.add(child2);
root.add(parent1);
root.add(parent2);
JTree jt =new JTree(root);
JScrollPane jsp =new JScrollPane(jt);
f.add(jsp);
f.setSize(200,200);
f.setVisible(true);
}
}