import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class MainDirecciones {

	public static void main(String[] args) {
		
		try {
			InetAddress direccionLocal = InetAddress.getByName("localhost");
			InetAddress[] todasDirecciones = InetAddress.getAllByName("PC18629");
			
			System.out.println(direccionLocal.getHostName());
			System.out.println(direccionLocal.getHostAddress());
			
			for (InetAddress direccion : todasDirecciones) {
				System.out.println(direccion.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
