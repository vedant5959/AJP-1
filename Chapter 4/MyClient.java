import java.net.*;
import java.io.*;
class MyClient
{
	public static void main(String args[]) throws Exception{
		Socket s=new Socket("192.168.11.200",8634);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(!str.equals("Stop")){
			str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			System.out.println("Server Says: "+str2);
		} 
		dout.close();
		s.close();
	}
}