	
package Task_3_8;
	
import java.util.ArrayList;
	
import java.util.Scanner;
	
public class Task_3_8_res {
	
	public int InputInt() {
		
		int check = 1;
		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
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
	
	
	public ArrayList numberEnter(int a){
		
		ArrayList<Integer> array = new ArrayList<Integer>();
			
			while(a > 0){
			
			int i = 0;
			array.add(i, a % 10);
			a = a / 10;
			i++;
			
			}
		return array;
	}
	
}
