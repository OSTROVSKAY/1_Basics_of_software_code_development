
package Task_3_7;

import Task_3_5.Task_3_5_res;

/* 
  7. Для каждого натурального числа в промежутке от m до n 
     вывести все делители, кроме единицы и самого числа.
     m и n вводятся с клавиатуры.
*/

public class Task_3_7 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ВЫЧИСЛЕНИЯ ДЕЛИТЕЛЕЙ НАТУРАЛЬНОГО ЧИСЛА В ПРОМЕЖУТКЕ ОТ M ДО N");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("ВВЕДИТЕ ЧИСЛО M И N");
		System.out.println("-------------------");
		System.out.println("N ДОЛЖНО БЫТЬ БОЛЬШЕ M");
		System.out.println("-----------------------");
		
		System.out.println("ВВЕДИТЕ ЧИСЛО M");
		System.out.println("---------------");
		
        Task_3_7_res Inp = new Task_3_7_res();
        
		int M = Inp.InputInt();
		int N = 0;
		
		do {
		    System.out.println("ВВЕДИТЕ ЧИСЛО N");
		    System.out.println("---------------");
		
		    N = Inp.InputInt();
		        if (M >= N )
		        {
		        	System.out.println("M больше или равно N");
		        	System.out.println("--------------------");
		        	System.out.println("Введие данные заново");
		        }
		} while ( M >= N );
		
		
		/* 
		  7. Для каждого натурального числа в промежутке от m до n 
		     вывести все делители, кроме единицы и самого числа.
		     m и n вводятся с клавиатуры.
		*/
		
		
		for ( double i = M; i <= N;  i = i + 1 )
		           {
			        System.out.println("--------------------------------");
		            System.out.println("Число : " + i);
			        System.out.println("--------------------------------");
			
			    for (  double j = 1; j <= i;  j = j + 1 )
			            {
			    	      double div = i / j;
			    	    
			    	          if ( (i % j == 0) & ( i != j ) & ( j != 1  ) )
			    	               {
			    	    	          System.out.println( "Делитель : " + j + "   "  + "Частное : " + div );
			    	               }
			            }
		            }
		System.out.println("-------------------------------");
		
	}

}