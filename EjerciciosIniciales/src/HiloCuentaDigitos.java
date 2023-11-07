
public class HiloCuentaDigitos extends Thread {
	private String cadena;
	private int pos0;
	private int pos1;
	private int contDigitos;

	public HiloCuentaDigitos(String cadena, int pos0, int pos1) {
		this.cadena = cadena;
		this.pos0 = pos0;
		this.pos1 = pos1;
	}

	public void run() {

		for (int i = pos0; i < pos1; i++) {

			if (cadena.charAt(i) >= '0' && cadena.charAt(i) <= '9') {
				contDigitos++;
			}

		}

	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public int getPos0() {
		return pos0;
	}

	public void setPos0(int pos0) {
		this.pos0 = pos0;
	}

	public int getPos1() {
		return pos1;
	}

	public void setPos1(int pos1) {
		this.pos1 = pos1;
	}

	public int getContDigitos() {
		return contDigitos;
	}

	public void setContDigitos(int contDigitos) {
		this.contDigitos = contDigitos;
	}

}
