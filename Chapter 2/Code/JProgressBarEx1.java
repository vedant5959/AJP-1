import javax.swing.*;
public class JProgressBarEx1 extends JFrame
{
JProgressBar pb;
int i=0,num=0;
JProgressBarEx1( )
{
pb= new JProgressBar(0,2000);
pb.setBounds(40,40,160,30);
pb.setValue(0);
pb.setStringPainted(true);
add(pb);
setSize(300, 300);
setLayout(null);
}
public void iterate()
{
while(i<=2000)
{
pb.setValue(i);
i=i+20;
try
{
    Thread.sleep(150);
    }
    catch(Exception e) 
    { }
    }
    }
    public static void main(String args[])
    {
    JProgressBarEx1 m =new JProgressBarEx1();
    m.setVisible(true);
    m.iterate();
    }
    }