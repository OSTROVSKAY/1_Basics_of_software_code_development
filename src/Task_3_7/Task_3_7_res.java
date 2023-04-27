package Task_3_7;

import java.util.Scanner;

public class Task_3_7_res {
	
	public int InputInt() {
		  
	      int check = 1;
	      int check1 = 0;
	      int x  = 0;
	     
	      do {
		       Scanner scanner = new Scanner(System.in);
		       System.out.print("Введите Данные :.............:" + "  ");
               String xx = scanner.nextLine();
     
               check = 1;
               check1 = 1;
     
                      try {
                    	   x = Integer.parseInt(xx);
                          } 
                            catch (NumberFormatException e) {
                            check1 = 1;
             	            check = 0;
         	                System.out.println("------------------------------------------");
         	                System.out.println("Данные введены не правильно. Введите снова");
                          }
                      
                      if ( x <= 0 )
                      {
                    	  System.out.println("------------------------------------------");
                    	  System.out.println("Данные равны 0 или меньше 0. Введите снова");
                    	  System.out.println("------------------------------------------");
                      } 
                      
                System.out.println("------------------------------");
     
    } while ( (check == 0) | (x <= 0) );
		return x; 
  }
	
}
