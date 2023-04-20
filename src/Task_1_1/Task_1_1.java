
// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //

package Task_1_1;

import java.util.Scanner;

public class Task_1_1 {

	public static void main(String[] args) {
		
		// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		double z;
		double a;
		double b;
		double c;
		
		System.out.println("Введите значения : a, b, c");
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : a...........:");
		a = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : b...........:");
		b = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : c...........:");
		c = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c //
		
		z = ( (a-3) * (b/2) ) + c;
		
		System.out.println("----------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
		System.out.println("----------------------------------");
		
		scanner.close();
	}

}
