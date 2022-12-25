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
public byte[] bytes;
int fbytes[]=new int[4];
public Server (int port)
{
try
{
server=new ServerSocket(port);
System.out.println("\n server waiting for client");
socket=server.accept();
ina=socket.getInetAddress();
in=socket.getInputStream();
out=socket.getOutputStream();
}
catch(IOException e)
{
System.out.println(" IOException"+e);
}
}
}
public class MyServer2
{
final static int SERVER_PORT=1200;
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
wr.println("server date information is "+new Date());
wr.flush();
while(true)
{
try
{
req=br.readLine();
System.out.println("\nclient input: "+req);
int num=Integer.parseInt(req);
int i;
for (i=2; i<num ;i++){
int n= num%i;
if (n==0){
wr.println("not Prime!");
break;
}
}
if(i==num){
	wr.println("Prime Number!");
}
wr.flush();
System.exit(0);
}
catch(SocketException e)
{
	System.out.println("Socket error");
	break;
}
catch(IOException e)
{
	System.out.println("IOException"+e);
}
}
}
}