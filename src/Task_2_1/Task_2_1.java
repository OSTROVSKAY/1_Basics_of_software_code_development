
/*
   1. Даны два угла треугольника (в градусах). 
      Определить, существует ли такой треугольник, 
      и если да, то будет ли он прямоугольным.
*/

package Task_2_1;

import java.util.Scanner;

public class Task_2_1 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ОПРЕДЕЛЕНИЯ ВИДА ТРЕУГОЛЬНИКА");
		System.out.println("----------------------------------");
		
        Scanner scanner = new Scanner(System.in);
		
		double A;
		double B;
		
		do {
		
		System.out.println("Введите значения углов треугольников в градусов: A, B");
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения угла A...........:");
		A = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.print("Введите значения угла B...........:");
		B = scanner.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		
		  if ( (A<=0) | (B<=0) )
		  {
			  System.out.println("Введите значения углов треугольника: A и B заново");
			  System.out.println("----------------------------------");
			  System.out.println("----------------------------------");
		  }
		
		} while ( (A<=0) | (B<=0) );
		
	
		if( (A+B)<180) // Определение существования треугольника
		{
			System.out.println("Треугольник существует");
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			
			
			 if( 180-(A+B)==90 ) // Определение вида треугольника
			 {
				 System.out.println("Треугольник прямоугольный");
				 System.out.println("----------------------------------");
				 System.out.println("----------------------------------");
				 
			 }
			
			 else {
				    System.out.println("Треугольник не прямоугольный");
				    System.out.println("----------------------------------");
				    System.out.println("----------------------------------");
			       }
		}
		else
		    {
			System.out.println("Треугольник не существует");
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
		    }
		
		scanner.close();
	}
}
