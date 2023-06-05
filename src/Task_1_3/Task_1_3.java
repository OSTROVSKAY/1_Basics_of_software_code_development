	
/*
	3. Вычислить значение выражения по формуле.
	 Все переменные принимают действительные значения.
	 Формула содержит тригонометрические функции.
*/
	
package Task_1_3;
	
import java.io.IOException;
	
public class Task_1_3 {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		double x;
		double y;
		double z;
		
		Task_1_3_res Inp = new Task_1_3_res();
		
		System.out.println("Введите значения : x, y");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		System.out.println("Введите значение x : ");
		System.out.println("----------------------------------");
		x = Inp.Input();
		x = Math.toRadians(x);
		
		
		do {
			System.out.println("Введите значение y : ");
			System.out.println("----------------------------------");
			y = Inp.Input();
			y = Math.toRadians(y);
			
			if ( (Math.cos(x) - Math.sin(y)) == 0 ) {
				
				System.out.println("--------------------------------------------------------");
				System.out.println("Выражение cos x - sin y равно 0. Введите данные снова : ");
				System.out.println("--------------------------------------------------------");
			}
			
		} while ( (Math.cos(x) - Math.sin(y)) == 0 );
		
		/* Вычислить значение выражения по формуле (все переменные принимают действительные значения) */
		
		z = ( (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) * Math.tan(x*y);
		
		System.out.println("------------------------------------");
		System.out.printf("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :  %6.3f%n", z);
		//System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
		System.out.println("------------------------------------");
	}
}
