
/* 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
      Функция содержит вычисление квадратного корня, рациональную дробь, и отрицательную степень числа */

package Task_1_2;

import java.util.Scanner;

public class Task_1_2 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА РАСЧЁТА ЗНАЧЕНИЯ ФУНКЦИИ");
		System.out.println("----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		double z;
		double a;
		double b;
		double c;
		
		System.out.println("Введите значения : a, b, c");
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : a...........:"+ "  ");
		a = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : b...........:"+ "  ");
		b = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : c...........:"+ "  ");
		c = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	    // Функция содержит вычисление квадратного корня, рациональную дробь, и отрицательную степень числа 
		
		z = ( b + Math.sqrt(Math.pow(b,2) + 4*a*c) ) / (2*a) -  Math.pow(a,3)*c + Math.pow(b,-2);
		
		System.out.println("----------------------------------");
		System.out.println("ЗНАЧЕНИЕ ФУНКЦИИ РАВНО :" + "   " + z);
		System.out.println("----------------------------------");
		
		scanner.close();
	}

}
