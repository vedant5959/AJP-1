import java.awt.*;
public class GridBagLayoutEx
{
public static void main(String args[ ])
{
Frame f = new Frame( );
GridBagLayout obj = new GridBagLayout( );
GridBagConstraints gbc = new GridBagConstraints( );
f.setLayout(obj);
gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=0;
Button b1 = new Button ("Button 1");
f.add(b1,gbc);
gbc.gridx=1;
gbc.gridy=0;
Button b2 = new Button ("Button 2");
f.add(b2,gbc);
gbc.fill =
GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=1;
Button b3 = new Button ("Button 3");
f.add(b3,gbc);
f.setSize(300,300);
f.setVisible(true);
}
}