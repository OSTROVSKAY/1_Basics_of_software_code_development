	
/*
	3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3)
		Определить, будут ли они расположены на одной прямой.
*/
	
package Task_2_3;
	
public class Task_2_3 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------");
		System.out.println("ПРОГРАММА ОПРЕДЕЛЕНИЯ РАСПОЛОЖЕНИЯ ТОЧЕК НА ОДНОЙ ПРЯМОЙ");
		System.out.println("--------------------------------------------------------");
		
	// Координаты Точки A
		double x1;
		double y1;
		
	// Координаты Точки B
		double x2;
		double y2;
		
	// Координаты Точки C
		double x3;
		double y3;
		
		
		int check = 0;
		
		do {
			do {
				System.out.println("----------------------------");
				System.out.println("Введите Координаты точки A :");
				System.out.println("----------------------------");
				
				System.out.println("Введите значение : X");
				System.out.println("--------------------");
				
				x1 = Task_2_3_res.Input();
				
				System.out.println("Введите значение : Y");
				System.out.println("--------------------");
				
				y1 = Task_2_3_res.Input();
				
				System.out.println("----------------------------");
				System.out.println("Введите Координаты точки B :");
				System.out.println("----------------------------");
				
				System.out.println("Введите значение : X");
				System.out.println("--------------------");
				
				x2 = Task_2_3_res.Input();
				
				System.out.println("Введите значение : Y");
				System.out.println("--------------------");
				
				y2 = Task_2_3_res.Input();
				
				System.out.println("----------------------------");
				System.out.println("Введите Координаты точки C :");
				System.out.println("----------------------------");
				
				System.out.println("Введите значение : X");
				System.out.println("--------------------");
				
				x3 = Task_2_3_res.Input();
				
				System.out.println("Введите значение : Y");
				System.out.println("--------------------");
				
				y3 = Task_2_3_res.Input();
				
				System.out.println("----------------------------------");
					
					if ( ( ( y2 - y1 ) != 0 ) | ( ( x2 - x1 ) != 0 ) )
						{
							double div1 = ( y3 - y1 ) / ( y2 - y1 );
							double div2 = ( x3 - x1 ) / ( x2 - x1 );
							
							System.out.printf("Деление 1 : %6.3f%n", div1);
							// System.out.println("Деление 1 :" + "  " + div1);
							System.out.println("--------------------");
							
							System.out.printf("Деление 2 : %6.3f%n", div2);
							// System.out.println("Деление 2 :" + "  " + div2);
							System.out.println("--------------------");
							System.out.println("--------------------");
						}
							else
									if ( ( ( y2 - y1 ) == 0 ) | ( ( x2 - x1 ) == 0 ) )
										{
										System.out.println("-------------------------------------------------");
										System.out.println("y2 - y1 = 0 ИЛИ x2 - x1 = 0  Введите данные снова");
										System.out.println("-------------------------------------------------");
										}
										
				} while ( ( ( y2 - y1 ) == 0 ) | ( ( x2 - x1 ) == 0 ) );
				
				/*
					Условие, при котором три данные точки лежат на одной прямой :
					Пусть даны три точки : A ( x1, y1 ), B ( x2, y2 ), C ( x3, y3 )
					Уравнение прямой линии, проходящей через точки A и B, имеет форму :
					( y - y1 ) / ( y2 - y1 ) = ( x - x1 ) / ( x2 - x1 )
					
					Точка C лежит на этой прямой только в том случае, когда её координаты x3, y3
					удовлетворяют уравнению этой прямой.
					
					Искомым условием является :
					( y3 - y1 ) / ( y2 - y1 ) = ( x3 - x1 ) / ( x2 - x1 )
				*/
					
					if ( ( ( y2 - y1 ) != 0 ) | ( ( x2 - x1 ) != 0 ) )
						{
							if ( ( ( y3 - y1 ) / ( y2 - y1 ) ) == ( ( x3 - x1 ) / ( x2 - x1 ) ) )
								{
								System.out.println("----------------------------------------");
								System.out.println("Три точки A, B и C лежат на одной прямой");
								System.out.println("----------------------------------------");
								}
									else
										{
										System.out.println("-------------------------------------------");
										System.out.println("Три точки A, B и C не лежат на одной прямой");
										System.out.println("-------------------------------------------");
										}
						}
						
						else {
							System.out.println("-------------------------------------------");
							System.out.println("Три точки A, B и C не лежат на одной прямой");
							System.out.println("-------------------------------------------");
							}
							
					System.out.println("-----------------------------------------------");
					System.out.println("ПРОДОЛЖИТЬ РАБОТУ ПРОГРАММЫ ?   1 - ДА. 0 - НЕТ");
					System.out.println("-----------------------------------------------");
					
					do {
						System.out.println("Введите : 1 - Да или 0 - Нет");
						System.out.println("----------------------------");
						
						check = (int)Task_2_3_res.Input();
							
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
