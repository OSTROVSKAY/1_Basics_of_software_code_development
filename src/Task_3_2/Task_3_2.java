	
	// 2. Вычислить значения функции на отрезке [а,b] c шагом h
	
package Task_3_2;
	
public class Task_3_2 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ НА ОТРЕЗКЕ [a,b] с шагом h");
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		
		double a;
		double b;
		
		double h;
		
		Task_3_2_res Inp = new Task_3_2_res();
		
		System.out.println("Введите значения : a, b");
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		
		System.out.println("b должно быть больше a");
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		
		System.out.println("Введите значение : a");
		System.out.println("-----------------------");
		
		a = Inp.Input();
		
		System.out.println("-----------------------");
		System.out.println("Введите значение : b");
		
		
		do {
			System.out.println("-----------------------");
			b = Inp.Input();
			
			if ( a >= b )
				{
				System.out.println("-----------------------------------");
				System.out.println("a больше b :  Нужно ввести b заново");
				System.out.println("-----------------------------------");
				System.out.println("--------------------");
				System.out.println("Введите значение : b");
				System.out.println("--------------------");
				}
		} while ( a >= b );
		
		
		double dif = b - a;
		
		do {
			System.out.println("--------------------");
			System.out.println("Введите значение : h");
			System.out.println("--------------------");
			h = Inp.Input();
			
			if ( h >= dif )
				{
				System.out.println("---------------------------------------------------");
				System.out.println("Шаг h больше дипазона [a,b] : Нужно ввести h заново");
				System.out.println("---------------------------------------------------");
				}
				
			if ( h >= dif | (h <= 0) )
				{
				System.out.println("------------------------------------------------");
				System.out.println("Шаг h меньше или равно 0 : Нужно ввести h заново");
				System.out.println("------------------------------------------------");
				}
		} while ( (h >= dif) | (h <= 0) );
		
		Inp.Funct(a, b, h);
	}
}
