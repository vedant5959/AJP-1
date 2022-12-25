import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="buttondemo.class" width=500 height=500></applet>*/

public class buttondemo extends Applet implements ActionListener 
{
    String msg="";
    Button b1,b2;
    public void init()
    {
        b1=new Button("ONE");
        b2=new Button("TWO");
        add(b1);
        add(b2);


    b1.addActionListener(this);
    b2.addActionListener(this);
    }


    public void actionPerformed(ActionEvent ae)
    {
        String str;
        str=ae.getActionCommand();
        if(str.equals("ONE"))
        {
            msg="You Pressed on Button One";
        }
        if(str.equals("TWO"))
        {
            msg="You Pressed on Button Two";
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,100,100);
    }
}