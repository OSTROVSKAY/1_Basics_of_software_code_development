
/*
   5. Вычислить значение функции.
*/

package Task_2_5;

import java.util.Scanner;

public class Task_2_5 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		double x = 0;
		double y;
		
		int check = 1;
		
		System.out.println("--------------------");
		System.out.println("Введите значение : x");
		System.out.println("--------------------");
		
		 do {
			    System.out.println("---------------------------------");
	            System.out.print("Введите значение : x............: " + "  ");
	            String xx = scanner.nextLine();
	            
	            check = 1;
	            
	            try {
	                  x = Double.parseDouble(xx);
	                     } catch (NumberFormatException e) {
	                    	                                 check = 0;
	                	                                     System.out.println("-------------------------------------------");
	                	                                     System.out.println("Данные введены не правильно. Введите снова");
	                	                                     System.out.println("-------------------------------------------");
	                                                       }
	           }
	        	
	     while (check == 0); 
		 
		                     // Вычисление значение функции :
		 
		 if ( x > 3  &  ( Math.pow(x,3) + 6 ) == 0 ) {
			  System.out.println("---------------------------------");
		      System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ НЕЛЬЗЯ ВЫЧИСЛИТЬ");
			  System.out.println("---------------------------------");
		 }
		 
		 if ( x > 3  &  ( Math.pow(x,3) + 6 ) != 0 )
		      { 
			    y = 1 / ( Math.pow(x,3) + 6 );
		      }
		         else
		             {
			           y = Math.pow(x,2) - 3*x + 9;
		             }
		 
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО : " + " " + y);
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		scanner.close();
	}

}
