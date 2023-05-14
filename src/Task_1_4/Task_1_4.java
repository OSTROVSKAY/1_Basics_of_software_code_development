
/*
	4.	Дано действительное число R вида nnn.ddd
		Три цифровых разряда в дробной и целой частях.
		Поменять местами дробную и целую части числа и
		вывести полученное значение числа.
*/
	
package Task_1_4;
	
public class Task_1_4 {
	
	public static void main(String[] args) {
	
		int check = 0;
	
		do {
				System.out.println("--------------------------------------------------------");
				System.out.println("--------------------------------------------------------");
				System.out.println("ПРОГРАММА : ДРОБНАЯ И ЦЕЛАЯ ЧАСТЬ ЧИСЛА МЕНЯЮТСЯ МЕСТАМИ");
				System.out.println("--------------------------------------------------------");
				System.out.println("--------------------------------------------------------");
			
				// Получение начального числа рандомным путём 
				int a = 100 + (int) (Math.random()*(999-100));
				int b = 100 + (int) (Math.random()*(999-100));
				
				double R = a + (double)b/1000;
			
				System.out.println("----------------------------------------");
				System.out.printf("Начальное значение числа :     %6.3f%n", R );
			//	System.out.println("Начальное значение числа   :" + "  " + R);
				System.out.println("----------------------------------------");
				
				double R2 = R - ((R * 1000) % 1000) / 1000;
				
				System.out.println("----------------------------------------");
				System.out.printf("Целая часть числа :            %6.3f%n", R2 );
			//	System.out.println("Целая часть числа          :" + "  " + R2);
				
				double R1 = R*1000;	
				R1=R1 % 1000;
			
				System.out.println("----------------------------------------");
				System.out.printf("Дробная часть числа :           %6.3f%n", (R1/1000) );
			//	System.out.println("Дробная часть числа        :" + "  " + R1/1000);
				
								// Полученное значение числа 
			
				double R3 = R1 + R2/1000;
			
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				
				System.out.printf("Полученное значение числа :    %6.3f%n", R3 );
			//	System.out.println("Полученное значение числа  :" + "  " + R3);
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
			
				System.out.println("-----------------------------------------------");
				System.out.println("ПРОДОЛЖИТЬ РАБОТУ ПРОГРАММЫ ?   1 - ДА. 0 - НЕТ");
				System.out.println("-----------------------------------------------");
			
				Task_1_4_res Inp = new Task_1_4_res();
			
				check = 0;
			
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
				
		}	while ( check == 1 );
	}
}
