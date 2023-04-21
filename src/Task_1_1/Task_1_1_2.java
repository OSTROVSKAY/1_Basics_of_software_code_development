                      
                            // КОНСОЛЬНОЕ ПРИЛОЖЕНИЕ ДЛЯ JAVA //
                    // 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //

package Task_1_1;

import java.io.Console;
import java.io.IOException;

public class Task_1_1_2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		
		double z = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		
		System.out.println("Введите значения : a, b, c");
		System.out.println("----------------------------------");
		
		//System.out.print("Введите значения : a...........:");
		// Получение консоли
        Console console = System.console();
        if(console!=null){
            // Считывание данных с консоли
            String a1 = console.readLine("Введите значения : a...........:");
            a = Double.parseDouble(a1);
         }
		System.out.println("----------------------------------");
		
		
		//System.out.print("Введите значения : b...........:");
		 if(console!=null){
	            // Считывание данных с консоли
	            String b1 = console.readLine("Введите значения : b...........:");
	            b = Double.parseDouble(b1);
	        }
		System.out.println("----------------------------------");
		
		
		//System.out.print("Введите значения : c...........:");
		if(console!=null){
            // Считывание данных с консоли
            String c1 = console.readLine("Введите значения : c...........:");
            c = Double.parseDouble(c1);
        }
		 
		System.out.println("----------------------------------");
		
		                 // 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
		
		       z = ( (a-3) * (b/2) ) + c;
		
		System.out.println("----------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
		System.out.println("----------------------------------");
		
	}

}
