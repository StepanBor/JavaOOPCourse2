package pack1;

import java.io.*;
import java.net.*;

public class Client implements Runnable {

	private String ans;
	private Thread tr;
	private Socket soc;

	public Client(String ans, Socket soc) {
		super();
		this.ans = ans;
		this.soc = soc;
		tr = new Thread(this);
		tr.start();
	}

	@Override
	public void run() {

		try (InputStream is = soc.getInputStream();
				OutputStream os = soc.getOutputStream();
				PrintWriter pw = new PrintWriter(os)) {
			
			byte[] rec1 = new byte[ is.available()];
			
			is.read( rec1);
			
			for (byte b : rec1) {
				System.out.print((char) b);
				
			}

			String response = "HTTP/1.1 200 OK\r\n" + "Server: My_Server\r\n" + "Content-Type:text/html\r\n"
					+ "Content-Length: " + "\r\n" + "Connection: close\r\n\r\n";
			pw.print(response + "<html><head><title>Lecture11 Task2</title> <meta charset='utf-8'></head><body><br> " + ans
					+ " </body></html>");
			pw.flush();
//			System.out.println(response + "<html><head><title>Student</title> <meta charset='utf-8'></head><body><br> "
//					+ ans + "</body></html>");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
