/*Haz un programa que lance 10 hilos, los cuales representan a usuarios que comparten un fondo comun(euros).
Cada usuario, genera un numero aleatorio entre 100 y 200 euros
y lo ingresa en el fondo. al final, se tiene que mostrar el total del fondo y la traza
ordenada de los ingresos.

Ejemplo
Fondo: 800 euros
Traza: +100+150+150....
*/
package hilo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hilo extends Thread {
	
	private List<Integer> traza = Collections.synchronizedList(new ArrayList<>());
	
	// Método que se ejecuta cuando se inicia el hilo
    public void run() {
        int ingreso = (int) (Math.random() * 101) + 100; // Generar un número aleatorio entre 100 y 200
        traza.add(ingreso);
        FondoComun.agregarDinero(ingreso); // Actualizar el fondo común con el ingreso del usuario
        
    }

    // Método para obtener la traza de ingresos del usuario
    public List<Integer> getTraza() {
        return traza;
    }
}

