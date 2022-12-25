import java.net.*;
import java.io.*;
import java.util.Date;

public class URLInformation
{
	public static void main(String args[]) throws Exception
	{
		URL url = new URL("http://www.msbte.com");

		URLConnection con = url.openConnection();


		System.out.println("");
		System.out.println(url);


		System.out.println("Date:"+new Date(con.getDate()));
		System.out.println("Content-Type"+con.getContentType());
		System.out.println("Expires:"+con.getExpiration());
		System.out.println("Last-Modified:"+new Date(con.getLastModified()));

		int len = con.getContentLength();
		System.out.println("Content-Length:"+len);
	}
}