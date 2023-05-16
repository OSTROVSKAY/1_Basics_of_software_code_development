	
/*
	6. Для данной области составить линейную программу,
	которая печатает true, если точка с координатами : (х, у)
	принадлежит закрашенной области, и false — в противном случае.
*/
	
package Task_1_6;
	
public class Task_1_6 {
	
	public static void main(String[] args) {
		
		int check = 0;
		
		do {
			System.out.println("ПРОГРАММА ПОИСКА КООРДИНАТ");
			System.out.println("--------------------------");
			System.out.println("--------------------------");
			
			double X;
			double Y;
			
			Task_1_6_res Inp = new Task_1_6_res();
			
			System.out.println("Введите значения : X, Y");
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			
			System.out.println("Введите значение : X...........:");
			System.out.println("--------------------------------");
			X = Inp.Input();
			
			System.out.println("Введите значение : Y...........:");
			System.out.println("--------------------------------");
			Y = Inp.Input();
			
									// ПРИНАДЛЕЖНОСТЬ ТОЧКИ ЗАКРАШЕННОЙ ОБЛАСТИ
			boolean log;
			
			log = ( ( ( X >= -2 ) & ( X <= 2 ) & ( Y >= 0 ) & ( Y <= 4 ) ) | ( ( X >= -4 ) & ( X <= 4 ) & ( Y >= -3 ) & ( Y <= 0 ) ) );
			
			System.out.println("-----------------------------------------------------");
			System.out.println("ПРИНАДЛЕЖНОСТЬ ТОЧКИ ЗАКРАШЕННОЙ ОБЛАСТИ :" + "   " + log);
			System.out.println("-----------------------------------------------------");
			
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
