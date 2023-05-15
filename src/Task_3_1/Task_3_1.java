
/* 
  1. Напишите программу, где пользователь вводит любое целое положительное число. 
     Программа суммирует все числа от 1 до введенного пользователем числа.
*/

package Task_3_1;

import java.util.Scanner;

public class Task_3_1 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("ПРОГРАММА СУММИРОВАНИЯ ВСЕХ ЧИСЕЛ ОТ 1 ДО ВВЕДЕННОГО ПОЛЬЗОВАТЕЛЕМ ЧИСЛА");
		System.out.println("------------------------------------------------------------------------");
		
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		
		int check = 1;
		int check1 = 1;
		
		do {
			System.out.println("-----------------------------------------");
			System.out.println("Введите любое целое положительное число :");
			System.out.println("-----------------------------------------");
		
			do {   
			    System.out.println("---------------------------------------");
	            System.out.print("Введите данные :.............: " + "  ");
	            String xx = scanner.nextLine();
	            
	            check = 1;
	            
	            try {
	                  x = Double.parseDouble(xx);
	                  
	                           if ( x <= 0 )
	                                {
	                        	      System.out.println("---------------------------------------------------");
                                      System.out.println("Введенные данные меньше или равны 0. Введите снова."); 
                                      System.out.println("---------------------------------------------------");
	                                }
	                  
	                 }                                    catch (NumberFormatException e) {
	                    	                                    check = 0;
	                	                                        System.out.println("-------------------------------------------");
	                	                                        System.out.println("Данные введены не правильно. Введите снова.");
	                	                                        System.out.println("-------------------------------------------");
	                                                       }
	           }
	        	
	     while ( check == 0 | x <= 0 ); 
		 
		                        //  Вычисление суммы всех чисел от 1 до введенного пользователем числа.
		 
		 for ( int i = 1; i <= x; i++ )
		       {
			     y = y + i;
			   }
		 
		    System.out.println("----------------------------------------");
		    System.out.println("----------------------------------------");
			System.out.println("ЗНАЧЕНИЕ СУММЫ ЧИСЕЛ РАВНО : " + "  " + y);
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
			
			System.out.println("-----------------------------------------------");
			System.out.println("ПРОДОЛЖИТЬ РАБОТУ ПРОГРАММЫ ?   1 - ДА. 0 - НЕТ");
			System.out.println("-----------------------------------------------");
			
			do	{
				System.out.println("Введите : 1 - Да или 0 - Нет");
				System.out.println("----------------------------");
				
				do {
					System.out.println("---------------------------------------");
		            System.out.print("Введите данные :.............: " + "  ");
		            String check11 = scanner.nextLine();
		            check = 1;
				
		            try {
		            	check1 = Integer.parseInt(check11);
	                	}         
		            	catch (NumberFormatException e) {
		            		check = 0;
		            		System.out.println("-------------------------------------------");
		            		System.out.println("Данные введены не правильно. Введите снова.");
		            		System.out.println("-------------------------------------------");
		            		}              
				}  while ( check == 0 ); 
				
				if ( check < 0 | check > 1 ) 
					{
					System.out.println("------------------------------------------------");
					System.out.println("Введеные данные не равны 0 или 1. Введите снова.");
					System.out.println("------------------------------------------------");
					}
				
			} while ( check < 0 | check > 1 );
			
			try {
				Thread.sleep(1500);
				}
					catch(InterruptedException ex) 
						{
						System.out.println("-------------------------");
						System.out.println("Ошибка в работе программы");
						System.out.println("-------------------------");
						}
		
		} while ( check1 == 1 );
		
		scanner.close();
		scanner1.close();
	}

}
