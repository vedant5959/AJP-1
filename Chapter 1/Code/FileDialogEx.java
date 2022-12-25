import java.awt.*;
class SampleFrame extends Frame
{
SampleFrame(String title)
{
super(title);
}
}
public class FileDialogEx
{
public static void main(String args[ ])
{
SampleFrame f = new SampleFrame("File Dialog Demo" );
f.setVisible(true);
f.setSize(300,300);
FileDialog obj = new FileDialog(f, "File Dialog" );
obj.setVisible(true);
}
}