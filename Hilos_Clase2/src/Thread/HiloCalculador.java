package Thread;

public class HiloCalculador extends Thread {
	
	private int min;
	private int max;
	private long[] array;
	private int posc;
	
	
   public HiloCalculador(int min,int max, long[] array,int posc) {
	   
	   this.min = min;
	   this.max = max;
	   this.array = array;
	   this.posc = posc;
   }
   
   public void run() {
	   long suma = 0;
	   while (min<=max) {
		   suma+=min;
		   min++; 
	   }
	   array[posc] = suma;
   }

}
