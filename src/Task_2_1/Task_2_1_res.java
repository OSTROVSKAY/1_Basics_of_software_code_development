	
package Task_2_1;
	
import java.util.Scanner;
	
public class Task_2_1_res {
	
	// Ввод данных
	public static double Input () {
		
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
	}
