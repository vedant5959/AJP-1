import java.io.*;
import java.net.*;
import java.util.*;
class Server
{
    public InputStream in;
    public OutputStream out;
    private Socket socket;
    private ServerSocket server;
    public InetAddress ia;
    public byte[]bytes;
    int fbytes[]=new int[4];

    public Server(int port)
    {
        try
        {
            server=new ServerSocket(port);
            System.out.println("Server Socket before accept");
            System.out.println(""+server);
            System.out.println("\nServer waiting for client");
            socket=server.accept();
            ia=socket.getInetAddress();
            System.out.println("Server responses to"+ia.getHostName()+"\n");
            System.out.println("with IP address");
            bytes=ia.getAddress();
            for(int i=0;i<4;i++)
            fbytes[i]=bytes[i]&255;
            System.out.println(fbytes[0]+"."+fbytes[1]+"."+fbytes[2]+"."+fbytes[3]);

            in=socket.getInputStream();
            out=socket.getOutputStream();
        }
        catch(IOException e)
        {
            System.out.println("IOException:"+e);
        }
    }
}

public class username_server
{
    final static int SERVER_PORT=1200;
    public static void main(String args[])
    {
        String req;
        Server server;
        BufferedReader br;
        PrintWriter wr;
        String msg;
        char ch='y';
        BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
        server=new Server(SERVER_PORT);

        br=new BufferedReader(new InputStreamReader(server.in));
        wr=new PrintWriter(new OutputStreamWriter(server.out));
        wr.println("Server date information is:"+new Date());
        wr.flush();


        while(true)
        {
            try
            {
                req=br.readLine();
                System.out.println("\nClient says:"+req);
                if(req.startsWith("Quit"))
                {
                    System.out.println("Disconnecting...");
                    System.exit(0);
                }
                if(req.startsWith("End"))
                {
                    System.out.println("Quiting...");
                    wr.flush();
                }
                else
                {
                    System.out.println("send");
                    System.out.flush();
                    wr.println("Hello"+req);
                    wr.flush();
                }
            }
            catch(SocketException e)
            {
                System.out.println("socket error");
                break;
            }
            catch(IOException e)
            {
                System.out.println("IOException"+e);
            }
        }
    }
}