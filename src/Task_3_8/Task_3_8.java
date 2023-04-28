
/* 
  8. Даны два числа. Определить цифры, 
     входящие в запись как первого так и второго числа.
*/

package Task_3_8;

import java.util.ArrayList;

public class Task_3_8 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ОПРЕДЕЛЕНИЕ ЦИФЕР, ВХОДЯЩИХ В ЗАПИСЬ КАК ПЕРВОГО ТАК И ВТОРОГО ЧИСЛА");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("Введите значения двух чисел : A, B");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		Task_3_8_res Inp = new Task_3_8_res();
		
		// Ввод первого числа
		System.out.println("Введите значение числа : A");
		System.out.println("--------------------------");
		
		 int A = 0;
		 
		 do {
		      A = Inp.InputInt();
		      
		      if ( A < 0 )
	             {
	           	  System.out.println("----------------------------------------");
	           	  System.out.println("Введенные данные меньше 0. Введите снова");
	           	  System.out.println("----------------------------------------");
	             } 
		    
		     } while ( A < 0 );
		 
		    // Ввод второго числа
		    System.out.println("Введите значение числа : B");
			System.out.println("--------------------------");
			
		    int B = 0;
		
		    do {
			     B = Inp.InputInt();
			     
			     if (  B < 0 )
	             {
	           	  System.out.println("----------------------------------------");
	           	  System.out.println("Введенные данные меньше 0. Введите снова");
	           	  System.out.println("----------------------------------------");
	             } 
			     
			   } while ( B < 0);
		    
		    
		    ArrayList arrA = new ArrayList();
		    arrA = Inp.numberEnter(A);
		    
		    ArrayList arrB = new ArrayList();
		    arrB = Inp.numberEnter(B);
		    
		    System.out.println("----------------------------------------------------------------");
		    System.out.println("----------------------------------------------------------------");
		    System.out.println("Вывод на печать первого массива : " + arrA);
		    System.out.println("----------------------------------------------------------------");
		    System.out.println("Вывод на печать второго массива : " + arrB);
		    System.out.println("----------------------------------------------------------------");
		    System.out.println("----------------------------------------------------------------");
		    
			int count = 0;
		     
		    for ( int i = 0; i < arrA.size(); i++ )
		        {
		         for (  int j = 0; j < arrB.size(); j++ )
		             {
		    	   if (arrA.get(i) == arrB.get(j))
		    	       {
		    		    count = count + 1;
		    		    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		    		    System.out.println( "Номер элемента первого массива : " + i + "   " + "Значение элемента первого массива : " + arrA.get(i) + "  |||  " + "Номер элемента второго массива : " + j + "   " + "Значение второго массива : " + arrB.get(j));
		    		    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		    	       }
		            }
		      }
		               System.out.println("---------------------------------------------------------------------------");
		               System.out.println("---------------------------------------------------------------------------");
		               System.out.println( "КОЛИЧЕСТВО ЦИФР, ВХОДЯЩИХ В ЗАПИСЬ КАК ПЕРВОГО ТАК И ВТОРОГО ЧИСЛА : " + "   " + count );
		               System.out.println("---------------------------------------------------------------------------");
		               System.out.println("---------------------------------------------------------------------------");
	}

}
