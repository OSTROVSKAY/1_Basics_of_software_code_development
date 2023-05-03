
/* 
  3. Вычислить значение выражения по формуле. 
     Все переменные принимают действительные значения.
	 Формула содержит тригонометрические функции.
*/

package Task_1_3;

import java.io.IOException;
import java.util.Scanner;

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
		
		System.out.println("Введите значение y : ");
		System.out.println("----------------------------------");
		y = Inp.Input();
		
		
     /* Вычислить значение выражения по формуле (все переменные принимают действительные значения) */
		
		z = ( (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) * Math.tan(x*y);
				
		System.out.println("-----------------------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
		System.out.println("-----------------------------------------------");	
	}
}
