
// 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

package Task_2_3;

import java.util.Scanner;

public class Task_2_3 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ОПРЕДЕЛЕНИЯ РАСПОЛОЖЕНИЯ ТОЧЕК НА ОДНОЙ ПРЯМОЙ");
		System.out.println("----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		// Координаты Точки A
		double x1;
		double y1;
		
		// Координаты Точки B
		double x2;
		double y2;
		
		// Координаты Точки C
		double x3;
		double y3;
		
		
		System.out.println("----------------------------------");
		System.out.println("Введите Координаты точки A :");
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : X...........:");
		x1 = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : Y...........:");
		y1 = scanner.nextDouble();
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		
		System.out.println("Введите Координаты точки B :");
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : X...........:");
		x2 = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : Y...........:");
		y2 = scanner.nextDouble();
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		System.out.println("Введите Координаты точки C :");
        System.out.println("----------------------------------");
		
		System.out.print("Введите значения : X...........:");
		x3 = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения : Y...........:");
		y3 = scanner.nextDouble();
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		/* 
		 * Условие, при котором три данные точки лежат на одной прямой :
		 * Пусть даны три точки: A ( x1, y1 ), B ( x2, y2 ), C ( x3, y3 )
		 * Уравнение прямой линии, проходящей через точки A и B, имеет форму :
		 * ( y - y1 ) / ( y2 - y1 ) = ( x - x1 ) / ( x2 - x1 )
		 * 
		 * Точка C лежит на этой прямой только в том случае, когда её координаты x3, y3
		 * удовлетворяют уравнению этой прямой.
		 * 
		 * Искомым условием является :
		 * ( y3 - y1 ) / ( y2 - y1 ) = ( x3 - x1 ) / ( x2 - x1 )
		 */
		
		
		
		if ( ( ( y2 - y1 ) != 0 ) | ( ( x2 - x1 ) != 0 ) ) 
		{
			double div1 = ( y3 - y1 ) / ( y2 - y1);
			double div2 = ( x3 - x1 ) / ( x2 - x1 );
			
			 System.out.println("Деление 1 :" + "  " + div1);
			 System.out.println("----------------------------------");
			 System.out.println("Деление 2 :" + "  " + div2);
			 System.out.println("----------------------------------");
			 System.out.println("----------------------------------");
		}
		
		
		
		if ( ( ( y2 - y1 ) != 0 ) | ( ( x2 - x1 ) != 0 ) ) 
			
		{
			if ( ( ( y3 - y1 ) / ( y2 - y1 ) ) == ( ( x3 - x1 ) / ( x2 - x1 ) ) )
			    {
			      System.out.println("Три данные точки : A, B и C лежат на одной прямой");
			      System.out.println("----------------------------------");
			    }
			       else
			         {
			           System.out.println("Три данные точки : A, B и C не лежат на одной прямой");
			      	   System.out.println("----------------------------------");
			         }
		}
		
		    else {
			       System.out.println("Три данные точки : A, B и C не лежат на одной прямой");
			       System.out.println("----------------------------------");
		         }
		
	   scanner.close();
	}
}
