
/* 
  1. Напишите программу, где пользователь вводит любое целое положительное число. 
     Программа суммирует все числа от 1 до введенного пользователем числа.
*/

package Task_3_1;

import java.util.Scanner;

public class Task_3_1 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА СУММИРОВАНИЯ ВСЕХ ЧИСЕЛ ОТ 1 ДО ВВЕДЕННОГО ПОЛЬЗОВАТЕЛЕМ ЧИСЛА");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
        Scanner scanner = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		
		int check = 1;
		
		System.out.println("Введите любое целое положительное число");
		System.out.println("----------------------------------");
		
		 do {
	            System.out.print("Введите любое целое положительное число :.............:");
	            String xx = scanner.nextLine();
	            
	            check = 1;
	            
	            try {
	                  x = Double.parseDouble(xx);
	                  
	                           if ( x <= 0 )
	                                {
	                        	      System.out.println("----------------------------------------------------------------");
                                      System.out.println("Данные введены не правильно. Введите снова"); 
	                                }
	                  
	                 }                                    catch (NumberFormatException e) {
	                    	                                    check = 0;
	                	                                        System.out.println("----------------------------------------------------------------");
	                	                                        System.out.println("Данные введены не правильно. Введите снова");
	                                                       }
	            System.out.println("----------------------------------------------------------------");
	           }
	        	
	     while ( check == 0 | x <= 0 ); 
		 
		                        // 5. Вычисление суммы всех чисел от 1 до введенного пользователем числа.
		 
		 for ( int i = 1; i <= x; i++ )
		    {
			  y = y + i;
			}
		
		    System.out.println("----------------------------------");
			System.out.println("ЗНАЧЕНИЕ СУММЫ ЧИСЕЛ РАВНО :" + "   " + y);
			System.out.println("----------------------------------");
		
		scanner.close();
	}

}
