	
/*
	8. Даны два числа. Определить цифры,
		входящие в запись как первого так и второго числа.
*/
	
package Task_3_8;
	
import java.util.ArrayList;
	
public class Task_3_8 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ОПРЕДЕЛЕНИЕ ЦИФЕР, ВХОДЯЩИХ В ЗАПИСЬ КАК ПЕРВОГО ТАК И ВТОРОГО ЧИСЛА");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("Введите значения двух чисел : A, B");
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		
		Task_3_8_res Inp = new Task_3_8_res();
		
		// Ввод первого числа
		System.out.println("Введите значение числа : A");
		System.out.println("---------------------------");
		
		int A = 0;
		
		do {
			A = Inp.InputInt();
			
			if ( A < 0 )
				{
				System.out.println("----------------------------------------");
				System.out.println("Введенные данные меньше 0. Введите снова");
				System.out.println("----------------------------------------");
				}
				
		} while ( A < 0 );
			
			// Ввод второго числа
			System.out.println("Введите значение числа : B");
			System.out.println("---------------------------");
			
			int B = 0;
			
			do {
				B = Inp.InputInt();
				
				if (  B < 0 )
					{
					System.out.println("----------------------------------------");
					System.out.println("Введенные данные меньше 0. Введите снова");
					System.out.println("----------------------------------------");
					}
					
			} while ( B < 0);
			
				// Ввод первого массива
			ArrayList<Integer> arrA = new ArrayList<Integer>();
			arrA = Inp.numberEnter(A);
			
				// Ввод второго массива
			ArrayList<Integer> arrB = new ArrayList<Integer>();
			
			arrB = Inp.numberEnter(B);
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Вывод на печать первого массива : " + arrA);
			System.out.println("----------------------------------------------------------------");
			System.out.println("Вывод на печать второго массива : " + arrB);
			System.out.println("----------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------");
			
			/*
			Даны два числа. Определить цифры,
			входящие в запись как первого так и второго числа.
			*/
			
				// Ввод третьего массива
			ArrayList<Integer> arrC = new ArrayList<Integer>();
			
			int count = 0;
			
			for ( int i = 0; i < arrA.size(); i++ )
				{
				for ( int j = 0; j < arrB.size(); j++ )
					{
					if (arrA.get(i) == arrB.get(j))
						{
						arrC.add(arrA.get(i));
						count = count + 1;
						System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.println( "Номер элемента первого массива : " + i + "   " + "Значение элемента первого массива : " + arrA.get(i) + "  |||  " + "Номер элемента второго массива : " + j + "   " + "Значение второго массива : " + arrB.get(j));
						System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
						}
					}
				}
			
			// System.out.println("Вывод на печать третьего массива : " +  arrC);
			
			int min = 0;
			int min1 = 0;
			int minind = 0;
			
			for ( int i = 0; i < arrC.size(); i++) {
			
				min = arrC.get(i);
				min1 = arrC.get(i);
				minind = i;
				
				for ( int j = i; j < arrC.size(); j++) {
					
					if ( arrC.get(j) < min  ) {
						
						min = arrC.get(j);
						minind = j;
					}
				}
				
				arrC.set(i, min);
				arrC.set(minind, min1);
				
				min = 0;
				min1 = 0;
				minind = 0;
			}
			
			// System.out.println("Вывод на печать третьего массива : " +  arrC);
			
			int count0 = 0;
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			int count5 = 0;
			int count6 = 0;
			int count7 = 0;
			int count8 = 0;
			int count9 = 0;
			
			for ( int i = 0; i < arrC.size(); i++ ) {
				if ( arrC.get(i) == 0 ) { count0 = count0 + 1;}
				if ( arrC.get(i) == 1 ) { count1 = count1 + 1;}
				if ( arrC.get(i) == 2 ) { count2 = count2 + 1;}
				if ( arrC.get(i) == 3 ) { count3 = count3 + 1;}
				if ( arrC.get(i) == 4 ) { count4 = count4 + 1;}
				if ( arrC.get(i) == 5 ) { count5 = count5 + 1;}
				if ( arrC.get(i) == 6 ) { count6 = count6 + 1;}
				if ( arrC.get(i) == 7 ) { count7 = count7 + 1;}
				if ( arrC.get(i) == 8 ) { count8 = count8 + 1;}
				if ( arrC.get(i) == 9 ) { count9 = count9 + 1;}
				}
			
			int repeat = 0;
			
			if ( count0 > 1 ) { repeat =  repeat + ( count0 - 1 ); }
			if ( count1 > 1 ) { repeat =  repeat + ( count1 - 1 ); }
			if ( count2 > 1 ) { repeat =  repeat + ( count2 - 1 ); }
			if ( count3 > 1 ) { repeat =  repeat + ( count3 - 1 ); }
			if ( count4 > 1 ) { repeat =  repeat + ( count4 - 1 ); }
			if ( count5 > 1 ) { repeat =  repeat + ( count5 - 1 ); }
			if ( count6 > 1 ) { repeat =  repeat + ( count6 - 1 ); }
			if ( count7 > 1 ) { repeat =  repeat + ( count7 - 1 ); }
			if ( count8 > 1 ) { repeat =  repeat + ( count8 - 1 ); }
			if ( count9 > 1 ) { repeat =  repeat + ( count9 - 1 ); }
			
			int check = 0;
			
			// System.out.println("Вывод на печать третьего массива : " +  arrC);
			
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("КОЛИЧЕСТВО ЦИФР, ВХОДЯЩИХ В ЗАПИСЬ КАК ПЕРВОГО ТАК И ВТОРОГО ЧИСЛА       : " + "   " + count);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("КОЛИЧЕСТВО ВИДОВ ЦИФР, ВХОДЯЩИХ В ЗАПИСЬ КАК ПЕРВОГО ТАК И ВТОРОГО ЧИСЛА : " + "   " + (count - repeat));
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
	}
	
}
