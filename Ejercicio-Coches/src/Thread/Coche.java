package Thread;

import java.util.Random;

public class Coche extends Thread {
	 private String nombre;
     private int vueltas;

     public Coche(String nombre) {
         this.nombre = nombre;
         this.vueltas = 0;
     }

     public String getNombre() {
         return nombre;
     }

     public int getVueltas() {
         return vueltas;
     }
     
   //Método run se simula la vuelta de un coche. 
   //Se genera un tiempo de vuelta aleatorio entre 0.5 y 3 segundos con un Random.
     public void run() {
         Random random = new Random();
         for (int vueltas = 1; vueltas <= 10; vueltas++) {
             int VueltaSegundos = random.nextInt(500,3000); // Tiempo aleatorio entre 0.5 y 3 segundos
             try {
                 Thread.sleep(VueltaSegundos);// se duerme el hilo para simular lo que tarda en la vuelta si el random es 2000 ms se duerme eso tiempo simulando la vuelta
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             vueltas++;
         }
     }
 }






