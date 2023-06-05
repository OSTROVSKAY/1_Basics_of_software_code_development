	
package Task_1_1;
	
import java.util.Scanner;
	
public class Task_1_1_res {
	
	// Ввод данных
	public double Input() {
			
			int check = 1;
			double x = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.print("Введите Данные :.............: " + "  ");
				String xx = scanner.nextLine();
				
				check = 1;
				
						try {
							x = Double.parseDouble(xx);
							}
								catch (NumberFormatException e) {
									check = 0;
									System.out.println("------------------------------------------");
									System.out.println("Данные введены не правильно. Введите снова");
									System.out.println("------------------------------------------");
							}
		System.out.println("----------------------------------");
		
		} while ( check == 0 );
		return x;
	}
	
	
	// Повтор выполнения программы
	public int Repeat() {
		
		int check = 0;
		
		do {
			System.out.println("Введите : 1 - Да или 0 - Нет");
			System.out.println("----------------------------");
			
			check = (int)Input();
				
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
		return check;
	}
}
