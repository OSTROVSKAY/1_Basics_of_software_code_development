	
/*
	5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
		Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
		НН ч ММ мин SS c
*/
	
package Task_1_5;
		
public class Task_1_5 {
		
	public static void main(String[] args) {
		
		Task_1_5_res Inp = new Task_1_5_res();
		
		int check1 = 0;
		
		do {
			System.out.println("ПРОГРАММА РАСЧЁТА ДЛИТЕЛЬНОСТИ ПРОШЕДШЕГО ВРЕМЕНИ");
			System.out.println("-------------------------------------------------");
			
			int T = 0;
			
			do {
				System.out.println("----------------------------------------------------");
				System.out.println("Введите длительность прошедшего времени в секундах : ");
				System.out.println("----------------------------------------------------");
				
				//System.out.println("----------------------------------");
				T = (int) Inp.Input();
				
				if( T < 0 )
					{
					System.out.println("---------------------------------------------------");
					System.out.println("Введено отрицательное число. Введите данные заново.");
					System.out.println("---------------------------------------------------");
					}
					
			} while ( ( T < 0 ) );
				
								// 1 час = 60 мин = 60*60 сек = 3600 сек
									// 1 МИН = 60 СЕК
				
			int HH = (int)Math.floor(T/3600);
			
			int MM1 = T - HH*3600;
			
			int MM = (int)Math.floor(MM1/60);
			
			int SS = MM1 - MM*60;
			
			System.out.println("--------------------");
			System.out.println("ПРОШЛО ЧАСОВ  : " + " " + HH);
			
			System.out.println("--------------------");
			System.out.println("ПРОШЛО МИНУТ  : " + " " + MM);
			
			System.out.println("--------------------");
			System.out.println("ПРОШЛО СЕКУНД : " + " " + SS);
			System.out.println("--------------------");
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("ЗНАЧЕНИЕ ПРОШЕДШЕЙ ДЛИТЕЛЬНОСТИ ВРЕМЕНИ В ЧАСАХ, МИНУТАХ И СЕКУНДАХ :");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------");
			
			System.out.printf("%02d Ч  %02d М  %02d С %n",HH,MM,SS);
			System.out.println("--------------------");
			System.out.println("--------------------");
			
			System.out.println("-----------------------------------------------");
			System.out.println("ПРОДОЛЖИТЬ РАБОТУ ПРОГРАММЫ ?   1 - ДА. 0 - НЕТ");
			System.out.println("-----------------------------------------------");
			
			do	{
				System.out.println("Введите : 1 - Да или 0 - Нет");
				System.out.println("----------------------------");
				
				check1 = (int)Inp.Input();
				
				if ( check1 < 0 | check1 > 1 )
					{
					System.out.println("------------------------------------------------");
					System.out.println("Введеные данные не равны 0 или 1. Введите снова.");
					System.out.println("------------------------------------------------");
					}
				
			} while ( check1 < 0 | check1 > 1 );
			
			try {
				Thread.sleep(1500);
				}
					catch(InterruptedException ex)
						{
						System.out.println("-------------------------");
						System.out.println("Ошибка в работе программы");
						System.out.println("-------------------------");
						}
					
		} while ( check1 == 1 );
	}
}
