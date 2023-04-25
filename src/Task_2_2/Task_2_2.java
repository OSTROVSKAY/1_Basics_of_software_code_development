
// 2. Найти max { min(a, b), min(c, d) }

package Task_2_2;

import java.util.Scanner;

public class Task_2_2 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ВЫЧИСЛЕНИЯ ЗНАЧЕНИЯ ВЫРАЖЕНИЯ");
		System.out.println("----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		
		System.out.println("Введите значения : a, b, c, d");
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
		
		System.out.print("Введите значения : d...........:");
		d = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		// 1. Найти max { min(a, b), min(c, d) }
		
		double x;
		
		// Вычисление min(a, b)
		
		double ab;
		
		   if ( a < b )
		          { ab = a; }
		   else { ab = b; }
		
		
		// Вычисление min(c, d)
		
		double cd;
		
		   if ( c < d )
	              { cd = c; }
	       else { cd = d; }
		   
		   
		// Вычисление max { min(a, b), min(c, d) }
		   
		   if ( ab > cd    )
		          { x = ab; }
		   else { x = cd; }
		   
		   
		System.out.println("----------------------------------");
		System.out.println("ЗНАЧЕНИЕ ВЫРАЖЕНИЯ РАВНО :" + "   " + x);
		System.out.println("----------------------------------");
		
		scanner.close();
	}

}
