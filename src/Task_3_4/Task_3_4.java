
// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

package Task_3_4;

import java.math.BigInteger;

public class Task_3_4 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ВЫЧИСЛЕНИЯ ПРОИЗВЕДЕНИЯ КВАДРАТОВ ПЕРВЫХ ДВУХСОТ ЧИСЕЛ");
		System.out.println("----------------------------------------------------------------");
		
		// Первое число
		int A = 1;
				
		// Второе число
		int B = 200;
				
		// Произведение квадратов первых двухсот чисел
		BigInteger YY = BigInteger.valueOf(1);
		BigInteger Y = BigInteger.valueOf(1);
		
		// Вычисление произведение квадратов первых двухсот чисел
		
		for ( int i = A; i <= B; i++ )
		 { 
			
			YY = BigInteger.valueOf(i*i);
			
			Y = Y.multiply(BigInteger.valueOf((long) i * i));
			
			  System.out.println("-----------------------------------------------------");
	          System.out.println( "ЧИСЛО :" + "  " + i + "    " + "КВАДРАТ ЧИСЛА :" + "  "+ YY );
	          System.out.println("-----------------------------------------------------");
	       }
		
		System.out.println("-----------------------------------------------------");
		System.out.println("ПРОИЗВЕДЕНИЕ КВАДРАТОВ ПЕРВЫХ ДВУХСОТ ЧИСЕЛ РАВНА :" + "   " + Y);
		System.out.println("-----------------------------------------------------");
	}

}
