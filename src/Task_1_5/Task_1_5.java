
/*  
  5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
     Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
     НН ч ММ мин SS c 
*/

package Task_1_5;

import java.util.Scanner;

public class Task_1_5 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА РАСЧЁТА ДЛИТЕЛЬНОСТИ ПРОШЕДШЕГО ВРЕМЕНИ");
		System.out.println("-------------------------------------------------");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
		System.out.println("Введите длительность прошедшего времени в секундах : ");
		System.out.println("----------------------------------------------------");
		
		int T = 0;
		int check = 1;
		 
		do {
		     System.out.print("Введите данные :...........: " + " ");
		     String xx = scanner.nextLine();
		     
		     check = 1;
		     
		     try {
                 T = Integer.parseInt(xx);
                 } 
		     
                 catch (NumberFormatException e) {
  	             check = 0;
	                System.out.println("------------------------------------------");
	                System.out.println("Данные введены не правильно. Введите снова");
	                System.out.println("------------------------------------------");
               }
		     
		     System.out.println("-----------------------------------------");
		     
		     if(T<0)
		       {
		    	 System.out.println("---------------------------------------------------");
		    	 System.out.println("Введено отрицательное число. Введите данные заново.");
		    	 System.out.println("---------------------------------------------------");
		       }
		
		} while ( (T<0) | (check == 0) );
		
		                   // 1 час = 60 мин = 60*60 сек = 3600 сек 
		                               //  1 МИН = 60 СЕК 
		
		 int HH = (int)Math.floor(T/3600);
		 
		 int MM1 = T - HH*3600;
		 
		 int MM = (int)Math.floor(MM1/60);
		     
		 int SS = MM1 - MM*60;
		
		 System.out.println("--------------------");
		 System.out.println("ПРОШЛО ЧАСОВ  : " + " " + HH);
		 
		 System.out.println("--------------------");
		 System.out.println("ПРОШЛО МИНУТ  : " + " " +  MM);
		 
		 System.out.println("--------------------");
		 System.out.println("ПРОШЛО СЕКУНД : " + " " + SS);
		 System.out.println("--------------------");
		 
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println("ЗНАЧЕНИЕ ПРОШЕДШЕЙ ДЛИТЕЛЬНОСТИ ВРЕМЕНИ В ЧАСАХ, МИНУТАХ И СЕКУНДАХ :");
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println("---------------------------------------------------------------------");
		 
		 System.out.printf("%02d Ч  %02d М  %02d С %n",HH,MM,SS);
		 System.out.println("--------------------");
		 
		 scanner.close();
	}
}
