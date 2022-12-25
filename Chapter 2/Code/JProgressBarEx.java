import javax.swing.*;
public class JProgressBarEx extends JFrame
{
static JProgressBar pb;
static JPanel p;
public static void main(String args[ ])
{
JFrame f =new JFrame("Progress Bar Demo");
p =new JPanel( );
pb= new JProgressBar( );
pb.setValue(0);
pb.setStringPainted(true);
p.add(pb);
f.add(p);
f. setSize(300, 300);
f.setVisible(true);
fill( );
}
public static void fill(
)
{
int
i
=
0
;
try{
while(
i<=100
)
{
pb
.setValue(i+10
)
;
Thread
.sleep
(2000
)
;
i=i+20
;
}
}
catch(Exception e) { }
}
}