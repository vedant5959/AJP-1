import java.net.*;
public class URLDemo
{
	public static void main(String args[]) throws MalformedURLException
	{
		URL u = new URL("http://www.msbte.com");
		System.out.println("Portocal:"+u.getProtocol());
		System.out.println("Port:"+u.getPort());
		System.out.println("Host:"+u.getHost());
		System.out.println("File:"+u.getFile());
		System.out.println("Ref:"+u.getRef());
		System.out.println("Exit:"+u.toExternalForm());
	}
}