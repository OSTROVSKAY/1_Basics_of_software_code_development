
/*
	КОНСОЛЬНОЕ ПРИЛОЖЕНИЕ ДЛЯ JAVA
	1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
*/

package Task_1_1;
	
import java.io.Console;
	
import java.io.IOException;
	
public class Task_1_1_2 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("----------------------------------");
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		
		double z = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		
		int check = 0;
		
		do {
			System.out.println("Введите значения : a, b, c");
			System.out.println("----------------------------------");
			
			System.out.println("Введите значение a : ");
			System.out.println("----------------------------------");
			
			// Получение консоли
			Console console = System.console();
				
				if(console!=null) {
				
				// Считывание данных с консоли
				// String a1 = console.readLine("Введите значение : a...........:");
				// a = Double.parseDouble(a1);
				
				a = Task_1_1_res.Input();
				}
				
			System.out.println("----------------------------------");
			
			
			System.out.println("Введите значение b : ");
			System.out.println("----------------------------------");
				
				if(console!=null) {
				
				// Считывание данных с консоли
				// String b1 = console.readLine("Введите значение : b...........:");
				// b = Double.parseDouble(b1);
				
				b = Task_1_1_res.Input();
				}
				
			System.out.println("----------------------------------");
			
			
			System.out.println("Введите значение c : ");
			System.out.println("----------------------------------");
				
				if(console!=null) {
				
				// Считывание данных с консоли
				// String c1 = console.readLine("Введите значение : c...........:");
				// c = Double.parseDouble(c1);
				
				c = Task_1_1_res.Input();
				}
				
		System.out.println("----------------------------------");
					
					// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
					
					z = ( (a-3) * b/2 ) + c;
					
		System.out.println("------------------------------------");
		System.out.printf("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :  %6.3f%n", z);
		//System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
		System.out.println("------------------------------------");
		
		check = Task_1_1_res.Repeat();
		
		} while ( check == 1 );
	}
}
