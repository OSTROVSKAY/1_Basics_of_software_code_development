
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
		System.out.println("----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите длительность прошедшего времени в секундах");
		System.out.println("----------------------------------");
		
		int T;
		
		do {
			
		     System.out.print("Введите длительность прошедшего времени в секундах :...........:");
		     T = scanner.nextInt();
		     System.out.println("----------------------------------");
		     
		     if(T<0)
		     {
		    	 System.out.println("Введите длительность прошедшего времени в секундах заново");
		    	 System.out.println("----------------------------------");
		     }
		
		} while (T<0);
		
		                   // 1 час = 60 мин = 60*60 сек = 3600 сек 
		                               //  1 МИН = 60 СЕК 
		
		 int HH = (int)Math.floor(T/3600);
		 
		 int MM1 = T - HH*3600;
		 int MM = (int)Math.floor(MM1/60);
		     
		 int SS = MM1 - MM*60;
		
		System.out.println("----------------------------------");
		System.out.println("ПРОШЛО ЧАСОВ :" + "   " + HH);
		System.out.println("----------------------------------");
		System.out.println("ПРОШЛО МИНУТ :" + "   " +  MM);
		System.out.println("----------------------------------");
		System.out.println("ПРОШЛО СЕКУНД :" + "  " + SS);
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("ЗНАЧЕНИЕ ДЛИТЕЛЬНОСТИ ВРЕМЕНИ В ЧАСАХ, МИНУТАХ И СЕКУНДАХ :");
		System.out.println("----------------------------------");
		System.out.printf("%02d ч %02d м %02d с",HH,MM,SS);
		
		scanner.close();
	}

}
