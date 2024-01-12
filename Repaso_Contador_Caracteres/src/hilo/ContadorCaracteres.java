/* Haz un programa que pida al usuario una cadena (longitud L). A continuación, se lanza L hilos
y cada uno comprueba lo sigiente para un solo caracter:
- Si el carácter es un digito(Character.isDigit())
-Si el carácteres una mayuscula (Caracter.isUpperCase())
Al final, el hilo main muestra cuantos caracteres son dígitos, cuantos son mayúsculas y cuántos son de otro tipo.
Ejemplo:

"PRuEBa123$"

Digitos: 3
Mayusculas: 4
Otros: 3 
*/

package hilo;

public class ContadorCaracteres extends Thread{
	 private String cadena; // Cadena de un solo carácter
	    private int digitos = 0; // Contador de dígitos
	    private int mayusculas = 0; // Contador de mayúsculas
	    private int otros = 0; // Contador de otros caracteres

	    // Constructor que recibe un carácter
	    public ContadorCaracteres(String cadena) {
	        this.cadena = cadena;
	    
	    }

	    // Método run, que se ejecuta cuando se inicia el hilo
	    @Override
	    public synchronized  void run() {
	        // Recorre el carácter y verifica su tipo
	        for (int i = 0; i < cadena.length(); i++) {
	            char caracter = cadena.charAt(i);

	            if (Character.isDigit(caracter)) {
	                digitos++;
	            } else if (Character.isUpperCase(caracter)) {
	                mayusculas++;
	            } else {
	                otros++;
	            }
	        }
	    }

	    // Métodos para obtener los resultados de conteo
	    public int getDigitos() {
	        return digitos;
	    }

	    public int getMayusculas() {
	        return mayusculas;
	    }

	    public int getOtros() {
	        return otros;
	    }
	}
