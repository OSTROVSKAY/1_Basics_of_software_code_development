package Task_3_2;

import java.util.Scanner;

public class Task_3_2_res {
	
  public double Input () {
	  
	      int check = 1;
	      double x  = 0;
	     
	      do {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Введите Данные :.............:" + "  ");
                String xx = scanner.nextLine();
         
                check = 1;
         
                          try {
                                x = Double.parseDouble(xx);
                              } 
                                catch (NumberFormatException e) {
                 	            check = 0;
             	                System.out.println("------------------------------------------");
             	                System.out.println("Данные введены не правильно. Введите снова");
                              }
         System.out.println("------------------------------------------");
        } while ( check == 0 );
		return x; 
    }
  
  
 public void Funct (double a, double b, double h) {
	 
	 double y = 0;
	 
	 for ( double i = a; i <= b; i = i + h )
	        {
		        if( i > 2 ) { y = i; }
		           else { y = -i; }
		        
		        System.out.println("---------------------------------------------------------------------------------");
				System.out.println("ЗНАЧЕНИЕ АРГУМЕНТА ФУНКЦИИ РАВНО :" + "   " + i + "        " + "ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + y);
				System.out.println("---------------------------------------------------------------------------------");
		    }
     }
  
 
}



