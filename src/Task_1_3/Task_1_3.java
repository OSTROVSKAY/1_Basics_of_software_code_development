
  /* 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	                        ( Формула содержит тригонометрические функции ) */

package Task_1_3;

import java.io.IOException;
import java.util.Scanner;

public class Task_1_3 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("Введите значения : x, y");
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : x...........:");
		x = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : y...........:");
		y = scanner.nextDouble();
		System.out.println("----------------------------------");
		
     /* Вычислить значение выражения по формуле (все переменные принимают действительные значения) */
		
		z = ( (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) * Math.tan(x*y);
				
		System.out.println("----------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
		System.out.println("----------------------------------");
		
		scanner.close();		
	}
}
