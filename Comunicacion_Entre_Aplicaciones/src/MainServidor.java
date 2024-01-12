import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServidor {

	public static void main(String[] args) {

		try {
			ServerSocket serverSocket = new ServerSocket(6565);
			String mensaje;
			do {

				Socket socketCliente = serverSocket.accept();
				DataInputStream dis = new DataInputStream(socketCliente.getInputStream());
				mensaje = dis.readUTF();
				System.out.println("Mensaje recibido: " + mensaje);

				dis.close();
				socketCliente.close();
			}while(!mensaje.equals("EXIT"));
			
			serverSocket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
