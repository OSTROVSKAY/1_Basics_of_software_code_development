
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
		
		double s = 0;
		
		for ( int i = 1; i <= n; i = i + 1 );
			      {
			        s = Inp.member (n);
			    	if ( Math.abs(s) >= e ) {
			    	sum = sum + s;
			    	}
				  }
		
		System.out.println("-------------------------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + sum);
		System.out.println("-------------------------------------------------");
	}

}
