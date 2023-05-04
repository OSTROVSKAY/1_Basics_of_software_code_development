
/*
    2. Найти max { min(a, b), min(c, d) }
*/

package Task_2_2;

import java.util.Scanner;

public class Task_2_2 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ВЫЧИСЛЕНИЯ ЗНАЧЕНИЯ ВЫРАЖЕНИЯ");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		
		System.out.println("Введите значения : a, b, c, d");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		
		 int check = 1;
		 
		 System.out.println("Введите значение : a");
		 System.out.println("--------------------");
		 
		  do {
			  System.out.print("Введите Данные :.............:" + "  ");
              String xx = scanner.nextLine();
              check = 1;
		
		      try {
		    	   a = Double.parseDouble(xx);
                  } 
                    catch (NumberFormatException e) {
    	            check = 0;
	                System.out.println("------------------------------------------");
	                System.out.println("Данные введены не правильно. Введите снова");
	                System.out.println("------------------------------------------");
                 }
                 System.out.println("----------------------------------");
		  
		  } while ( check == 0);
		
		
		System.out.println("Введите значение : b");
		System.out.println("--------------------");
		
		  do {
			  System.out.print("Введите Данные :.............:" + "  ");
              String xx = scanner.nextLine();
              check = 1;
		
		      try {
		    	   b = Double.parseDouble(xx);
                  } 
                    catch (NumberFormatException e) {
    	            check = 0;
	                System.out.println("------------------------------------------");
	                System.out.println("Данные введены не правильно. Введите снова");
	                System.out.println("------------------------------------------");
                 }
                 System.out.println("----------------------------------");
		  
		  } while ( check == 0 );
		
		
		System.out.println("Введите значение : c");
		System.out.println("--------------------");
		 
		do {
			 System.out.print("Введите Данные :.............:" + "  ");
             String xx = scanner.nextLine();
             check = 1;
		
		     try {
		    	   c = Double.parseDouble(xx);
                  } 
                    catch (NumberFormatException e) {
    	            check = 0;
	                System.out.println("------------------------------------------");
	                System.out.println("Данные введены не правильно. Введите снова");
	                System.out.println("------------------------------------------");
                 }
                 System.out.println("----------------------------------");
		  
		  } while ( check == 0);
		
		
		System.out.println("Введите значение : d");
		System.out.println("--------------------");
		
		  do {
			  System.out.print("Введите Данные :.............:" + "  ");
              String xx = scanner.nextLine();
              check = 1;
		
		      try {
		    	   d = Double.parseDouble(xx);
                  } 
                    catch (NumberFormatException e) {
    	            check = 0;
	                System.out.println("------------------------------------------");
	                System.out.println("Данные введены не правильно. Введите снова");
	                System.out.println("------------------------------------------");
                 }
                 System.out.println("----------------------------------");
		  
		  } while ( check == 0);
		
		
		// 1. Найти max { min(a, b), min(c, d) }
		
		double x;
		
		// Вычисление min(a, b)
		
		double ab;
		
		   if ( a < b )
		          { ab = a; }
		   else { ab = b; }
		
		
		// Вычисление min(c, d)
		
		double cd;
		
		   if ( c < d )
	              { cd = c; }
	       else { cd = d; }
		   
		   
		// Вычисление max { min(a, b), min(c, d) }
		   
		   if ( ab > cd    )
		          { x = ab; }
		   else { x = cd; }
		   
		   
		System.out.println("----------------------------------");
		System.out.println("ЗНАЧЕНИЕ ВЫРАЖЕНИЯ РАВНО :" + "   " + x);
		System.out.println("----------------------------------");
		
		scanner.close();
	}

}
