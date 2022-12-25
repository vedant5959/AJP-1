import java.awt.*;
public class LabelExample
{
public static void main(String args[ ])
{
Frame f = new Frame("Label Example");
Label l1 = new Label ("Hello ");
l1.setBounds(50, 100, 100, 30);
Label l2 = new Label ( );
l2.setText("Students....!!");
l2.setAlignment(Label.CENTER);
l2.setBackground(Color.pink);
l2.setForeground(Color.blue);
l2.setBounds(50, 150, 100, 30);
f.add(l1);
f.add(l2);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
}
}
