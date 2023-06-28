	
// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
	
package Task_1_1;
	
public class Task_1_1 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		
		double z;
		double a;
		double b;
		double c;
		
		int check = 0;
		
		do {
			System.out.println("Введите значения : a, b, c");
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			
			System.out.println("Введите значение a : ");
			System.out.println("----------------------------------");
			a = Task_1_1_res.Input();
			
			System.out.println("Введите значение b : ");
			System.out.println("----------------------------------");
			b = Task_1_1_res.Input();
			
			System.out.println("Введите значение c : ");
			System.out.println("----------------------------------");
			c = Task_1_1_res.Input();
			
			// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
			
			z = ( (a-3) * b/2 ) + c;
			
			// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
			
			System.out.println("------------------------------------");
			System.out.printf("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :  %6.3f%n", z);
			//System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
			System.out.println("------------------------------------");
			
			check = Task_1_1_res.Repeat();
			
		} while ( check == 1 );
		
	}
	
}
