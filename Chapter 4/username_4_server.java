import java.util.*;
import java.io.*;
import java.net.*;
class Server
{
    private ServerSocket server;
    public InputStream in;
    public OutputStream out;
    private Socket socket;
    public InetAddress ina;

    public Server(int port)
    {
        try
        {
            server = new ServerSocket(port);
            System.out.println("server waiting foe client");
            socket=server.accept();
            ina=socket.getInetAddress();
            in=socket.getInputStream();
        }
        catch(IOException e)
        {
            System.out.println("IOException"+e);
        }
    }
}


public class username_4_server
{
    final static int SERVER_PORT=2000;
    public static void main(String args[])
    {
        String req;
        Server server;
        BufferedReader br;
        PrintWriter wr;
        String msg;


        BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
        server=new Server(SERVER_PORT);
        br=new BufferedReader(new InputStreamReader(server.in));
        wr=new PrintWriter(new OutputStreamWriter(server.out));
        wr.println("server date information is"+new Date());
        wr.flush();

        try
        {
            String pwd="abc";
            req=br.readLine();
            System.out.println("\nclient input:"+req);

            if(req.equals("abc"))
            {
                wr.println("Confirmed!");
                wr.flush();
                System.exit(0);
            }
            else
            {
                wr.println("InCorrect password");
                wr.flush();
            }
        }
        catch(SocketException e)
        {
            System.out.println("socket error");
        }
        catch(IOException e)
        {
            System.out.println("IOException"+e);
        }
    }
}
