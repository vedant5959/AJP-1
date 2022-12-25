import java.io.*;
import java.net.*;

class Client
{
public InputStream in;
public OutputStream out;
private Socket client;
public Client (String host,int port)
{
	try
{	
client=new Socket(host,port);
System.out.println("Client requesting to server");
System.out.println("Socket Info: \n"+client);
out=client.getOutputStream();
in=client.getInputStream();
}
catch(IOException e)
{
	System.out.println("IOException :"+e);
}
}
}
public class MyClient2
{
public static void main(String args[])
{
	String start,res;
	Client client;
	BufferedReader br;
	PrintWriter wr;

String msg;
BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
client=new Client("",1200);
try
{
br=new BufferedReader(new InputStreamReader(client.in));
wr=new PrintWriter(new OutputStreamWriter(client.out));
start=br.readLine();

System.out.println("Please Enter the number:");
msg=dis.readLine();
System.out.println("client: "+msg);
wr.println(msg);
wr.flush();
res=br.readLine();
System.out.println("Server:" +res+"");
wr.flush();
}
catch(IOException e)
{
System.out.println("IOException: "+e);
}
}
}