
/*   6. Для данной области составить линейную программу, 
        которая печатает true, если точка с координатами (х, у) 
        принадлежит закрашенной области, и false — в противном случае: 
*/

package Task_1_6;

import java.util.Scanner;

public class Task_1_6 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ПОИСКА КООРДИНАТ");
		System.out.println("----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		double X;
		double Y;
		
		
		System.out.println("Введите значения : X, Y");
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : X...........:");
		X = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : Y...........:");
		Y = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		                    // ПРИНАДЛЕЖНОСТЬ ТОЧКИ ЗАКРАШЕННОЙ ОБЛАСТИ
		boolean log;
		
		log = ( ( ( X >= -2 ) & ( X <= 2 ) & ( Y >= 0 ) & ( Y <= 4 ) ) | ( ( X >= -4 ) & ( X <= 4 ) & ( Y >= -3 ) & ( Y <= 0 ) ) );
		
		System.out.println("----------------------------------");
		System.out.println("ПРИНАДЛЕЖНОСТЬ ТОЧКИ ЗАКРАШЕННОЙ ОБЛАСТИ :" + "   " + log);
		System.out.println("----------------------------------");
		
		scanner.close();
	}
}
