	
package Task_1_5;
	
import java.util.Scanner;
	
public class Task_1_5_res {
	
		// Ввод данных
	
		public double Input () {
		
			int check = 1;
			double x = 0;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("------------------------------");
			
			do	{
					System.out.print("Введите Данные :.............: " + "  ");
					
					String xx = scanner.nextLine();
					
					check = 1;
					
					try {
						x = Double.parseDouble(xx);
						}
					catch (NumberFormatException e) {
						check = 0; // Проверка
						System.out.println("------------------------------------------");
						System.out.println("Данные введены не правильно. Введите снова");
						System.out.println("------------------------------------------");
					}
				System.out.println("----------------------------------");
			} while ( check == 0 );
		return x;
		}
	
	}
