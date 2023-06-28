	
package Task_3_5;
	
import java.util.Scanner;
	
public class Task_3_5_res {
	
	// Ввод данных: Double
	public static double InputDouble() {
	
	int check = 1;
	double x = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	do {
		System.out.println("------------------------------");
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
				
		System.out.println("------------------------------");
		
		} while ( check == 0 );
		
		return x;
	}
	
	
	// Ввод данных: Int
	public static int InputInt() {
		
		int check = 1;
		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("------------------------------");
			System.out.print("Введите Данные :.............: " + "  ");
			String xx = scanner.nextLine();
			
			check = 1;
			
			try {
				x = Integer.parseInt(xx);
				}
				catch (NumberFormatException e) {
					
					check = 0;
					System.out.println("------------------------------------------");
					System.out.println("Данные введены не правильно. Введите снова");
					System.out.println("------------------------------------------");
					}
					
			System.out.println("------------------------------");
			
		} while ( check == 0 );
		
		return x;
	}
	
	
	// Вычисление члена ряда
	public static double member (int n) {
		
		double a = 1/Math.pow(2, n) + 1/Math.pow(3, n);
		
		return a;
	}
	
}
