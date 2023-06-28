	
/*
	5. Даны числовой ряд и некоторое число е.
	Найти сумму тех членов ряда, модуль которых больше или равен
	заданному е.
*/
	
package Task_3_5;
	
public class Task_3_5 {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------");
		System.out.println("ПРОГРАММА РАСЧЁТА СУММЫ ЧЛЕНОВ ЧИСЛОВОГО РЯДА");
		System.out.println("---------------------------------------------");
		
		System.out.println("ВВЕДИТЕ ЧИСЛО e :");
		System.out.println("-----------------");
		
		double e = Task_3_5_res.InputDouble();
		
		int n = 0;
		
		do {
			System.out.println("ВВЕДИТЕ ЧИСЛО n :");
			System.out.println("-----------------");
			
			n = Task_3_5_res.InputInt();
			
			if ( n <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введеные данные меньше или равны 0. Введите заново");
				System.out.println("--------------------------------------------------");
				}
				
		} while ( n <= 0 );
		
		double sum = 0;
		
		double sum1 = 0;
		
		int i = 0;
		
		for ( i = 0; i <= n; i = i + 1 )
			{
			sum1 = Task_3_5_res.member(i);
			
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("НОМЕР ЧЛЕНА РЯДА : " + "  " + i + "  ||  " + "ЗНАЧЕНИЕ ФУНКЦИИ РАВНО : " + "  " + sum1);
			System.out.println("-------------------------------------------------------------------------------------");
				
				if ( Math.abs(sum1) >= e )
					{
					sum = sum + sum1;
					}
			}
			
		System.out.println("----------------------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО : " + "  " + sum);
		System.out.println("----------------------------------------------");
	}
	
}
