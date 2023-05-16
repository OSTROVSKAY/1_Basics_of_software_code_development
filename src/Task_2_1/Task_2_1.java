	
/*
	1. Даны два угла треугольника (в градусах).
		Определить, существует ли такой треугольник,
		и если да, то будет ли он прямоугольным.
*/
	
package Task_2_1;
	
public class Task_2_1 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ОПРЕДЕЛЕНИЯ ВИДА ТРЕУГОЛЬНИКА");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		
		double A;
		double B;
		
		int check = 0;
		
		Task_2_1_res Inp = new Task_2_1_res();
		
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("Введите значения углов треугольников в градусов: A, B");
			System.out.println("-----------------------------------------------------");
			
			do {
				System.out.println("Введите значение угла A...........:");
				System.out.println("-----------------------------------");
				A = Inp.Input();
				
				if ( A <= 0 )
					{
					System.out.println("-----------------------------------------");
					System.out.println("Введите значение угла треугольника заново");
					System.out.println("-----------------------------------------");
					}
			} while ( A <= 0 );
			
			
			do {
				System.out.println("Введите значение угла B...........:");
				System.out.println("-----------------------------------");
				B = Inp.Input();
				
				if ( B <= 0 )
					{
					System.out.println("-----------------------------------------");
					System.out.println("Введите значение угла треугольника заново");
					System.out.println("-----------------------------------------");
					}
				
				} while ( B <= 0 );
				
				
				if( ( A+B ) < 180 ) // Определение существования треугольника
						{
						System.out.println("----------------------");
						System.out.println("Треугольник существует");
						System.out.println("----------------------");
						
						if( (180-(A+B) ) == 90 ) // Определение вида треугольника. Расчёт третьего угла треугольника : Угол C.
							{
							System.out.println("-------------------------");
							System.out.println("Треугольник прямоугольный");
							System.out.println("-------------------------");
							}
							
							else {
								System.out.println("----------------------------");
								System.out.println("Треугольник не прямоугольный");
								System.out.println("----------------------------");
								 }
						}
						else
							{
							System.out.println("-------------------------");
							System.out.println("Треугольник не существует");
							System.out.println("-------------------------");
							}
							
				System.out.println("-----------------------------------------------");
				System.out.println("ПРОДОЛЖИТЬ РАБОТУ ПРОГРАММЫ ?   1 - ДА. 0 - НЕТ");
				System.out.println("-----------------------------------------------");
				
				do	{
					System.out.println("Введите : 1 - Да или 0 - Нет");
					System.out.println("----------------------------");
					
					check = (int)Inp.Input();
					
					if ( check < 0 | check > 1 )
						{
						System.out.println("------------------------------------------------");
						System.out.println("Введеные данные не равны 0 или 1. Введите снова.");
						System.out.println("------------------------------------------------");
						}
					
				} while ( check < 0 | check > 1 );
				
				try {
					Thread.sleep(1500);
					}
						catch(InterruptedException ex)
							{
							System.out.println("-------------------------");
							System.out.println("Ошибка в работе программы");
							System.out.println("-------------------------");
							}
					
				
			} while ( check == 1 );
		}
	}
