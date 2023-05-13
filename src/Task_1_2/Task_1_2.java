
/*
   2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
      Функция содержит вычисление квадратного корня, рациональную дробь, и отрицательную степень числа
*/

package Task_1_2;

import java.util.Scanner;

public class Task_1_2 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		double z;
		double a;
		double b;
		double c;
		
		Task_1_2_res Inp = new Task_1_2_res();
		
		System.out.println("Введите значения : a, b, c");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		System.out.println("Введите значение a : ");
		System.out.println("----------------------------------");
		System.out.println("a должно быть не равно 0 :");
		System.out.println("----------------------------------");
		  
		do {
		     a = Inp.Input();
		     
		     if ( a == 0 ) {
		    	 
		    	System.out.println("--------------------------------");
		 		System.out.println("a равно 0. Введите данные снова.");
		 		System.out.println("--------------------------------");
		     }
		    	 
		   }   while ( a == 0 );
		
		System.out.println("----------------------------------");
		
		System.out.println("Введите значение b : ");
		System.out.println("----------------------------------");
		System.out.println("b должно быть не равно 0 :");
		System.out.println("----------------------------------");
		
		do {
		    b = Inp.Input();
		    
		    if ( b == 0 ) {
		    	 
		    	System.out.println("--------------------------------");
		 		System.out.println("b равно 0. Введите данные снова.");
		 		System.out.println("--------------------------------");
		     }
		}  while ( b == 0 );
		    
	
		System.out.println("Введите значение c : ");
		System.out.println("----------------------------------");
		c = Inp.Input();
		System.out.println("----------------------------------");
		
		// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	    // Функция содержит вычисление квадратного корня, рациональную дробь, и отрицательную степень числа 
		
		z = ( b + Math.sqrt(Math.pow(b,2) + 4*a*c) ) / (2*a) -  Math.pow(a,3)*c + Math.pow(b,-2);
		
		System.out.println("-------------------------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
		System.out.println("-------------------------------------------------");
	}

}
