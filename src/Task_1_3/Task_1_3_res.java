	
package Task_1_3;
	
import java.util.Scanner;
	
public class Task_1_3_res {
	
/*
	В Java Math.cos() возвращает косинус указанного в радианах double значения.
	В Java Math.sin() возвращает синус указанного в радианах double значения.
	В Java Math.tan() возвращает тангенс указанного в радианах double значения.
*/
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
