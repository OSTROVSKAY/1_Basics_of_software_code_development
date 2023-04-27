
/* 
   5. Даны числовой ряд и некоторое число е. 
      Найти сумму тех членов ряда, модуль которых больше или равен
      заданному е. Общий член ряда имеет вид:
*/

package Task_3_5;

public class Task_3_5 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА РАСЧЁТА СУММЫ ЧЛЕНОВ ЧИСЛОВОГО РЯДА");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		System.out.println("ВВЕДИТЕ ЧИСЛО e");
		System.out.println("---------------");
		
		Task_3_5_res Inp = new Task_3_5_res();
		
		double e = Inp.InputDouble();
		
		System.out.println("ВВЕДИТЕ ЧИСЛО n");
		System.out.println("---------------");
		
		int n = Inp.InputInt();
		
		double sum = 0;
		
		double sum1 = 0;
		
		int i = 0;
		
		for ( i = 0; i <= n; i = i + 1 )
			    {
			      sum1 = Inp.member (i); 
			      
			      System.out.println("------------------------------------------------------------------------------------");
			      System.out.println("НОМЕР ЧЛЕНА РЯДА :" + "  " + i + "      " + "ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + sum1);
			      System.out.println("------------------------------------------------------------------------------------");
			    	 
			    	     if ( Math.abs(sum1) >= e ) {
			    	           sum = sum + sum1;
			    	             }
				 }
		
		System.out.println("----------------------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "    " + sum);
		System.out.println("----------------------------------------------");
	}

}
