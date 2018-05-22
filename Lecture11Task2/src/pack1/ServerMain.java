package pack1;

import java.io.IOException;
import java.net.*;

public class ServerMain {

	public static void main(String[] args) {
		
		String ans=System.getProperty("os.name");
		int request=0;
		
		try(ServerSocket soc = new ServerSocket(8091)) {
			
			for(;;) {

				Socket clientSoc=soc.accept();
				request+=1;
				Client client1=new Client(ans+" request number - "+request, clientSoc);
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
