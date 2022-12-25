import java.io.*;
import java.net.*;
import java.nio.Buffer;

class Client
{
    public InputStream in;
    public OutputStream out;
    private Socket client;
    public Client(String host,int port)
    {

        try
        {
            client = new Socket(host,port);
            System.out.println("Client requesting to the server");
            System.out.println("Socket information: \n"+client);
            out=client.getOutputStream();
            in=client.getInputStream();
        }
        catch(IOException e)
        {
            System.out.println("IOException :"+e);
        }
    }
}

public class username_client
{
    public static void main(String args[])
    {
        String start,res;
        Client client;
        BufferedReader br;
        PrintWriter wr;
        String msg;
        char ch='y';
        BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
        client=new Client("",1200);

        do
        {
            try
            {
                br=new BufferedReader(new InputStreamReader(client.in));
                wr=new PrintWriter(new OutputStreamWriter(client.out));
                start=br.readLine();
                System.out.println("Server: "+start+"");
                System.out.println("Please enter the text:");
                msg=dis.readLine();
                System.out.println("I am sending"+msg);
                wr.println(msg);
                wr.flush();
                res=br.readLine();
                System.out.println("Server responds:"+res+"");
                wr.println("END");
                wr.flush();
            }
            catch(IOException e)
            {
                System.out.println("IOException"+e);
            }
            System.out.println("Do you want to send more information...?");
            try
            {
                ch=(char)dis.read();}
                catch(IOException e)
                {
                    System.out.println("IOException"+e);
                    System.exit(0);
                }
           }   
           while(ch!='n');
        }
    }
