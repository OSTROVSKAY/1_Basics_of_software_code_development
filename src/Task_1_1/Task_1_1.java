	
// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
	
package Task_1_1;
	
public class Task_1_1 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		double z;
		double a;
		double b;
		double c;
		
		Task_1_1_res Inp = new Task_1_1_res();
		
		int check = 0;
		
		do {
			System.out.println("Введите значения : a, b, c");
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			
			System.out.println("Введите значение a : ");
			System.out.println("----------------------------------");
			a = Inp.Input();
			
			System.out.println("Введите значение b : ");
			System.out.println("----------------------------------");
			b = Inp.Input();
			
			System.out.println("Введите значение c : ");
			System.out.println("----------------------------------");
			c = Inp.Input();
			
			// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
			
			z = ( (a-3) * b/2 ) + c;
			
			// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
			
			System.out.println("------------------------------------");
			System.out.printf("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :  %6.3f%n", z);
			//System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
			System.out.println("------------------------------------");
			
			check = Inp.Repeat();
			
		} while ( check == 1 );
		
	}
	
}
