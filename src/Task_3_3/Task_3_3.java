	
	// 3. Найти сумму квадратов первых ста чисел.
	
package Task_3_3;
	
public class Task_3_3 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА ВЫЧИСЛЕНИЯ СУММЫ КВАДРАТОВ ПЕРВЫХ СТА ЧИСЕЛ");
		System.out.println("-----------------------------------------------------");
		
	// Первое число
		int A = 1;
		
	// Второе число
		int B = 100;
		
	// Сумма квадратов первых ста чисел
		int Y = 0;
		
	// Вычисление суммы квадратов первых ста чисел
		for ( int i = A; i <= B; i++ )
			{
			Y = Y + (int)Math.pow(i, 2);
			}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("СУММА КВАДРАТОВ ПЕРВЫХ СТА ЧИСЕЛ РАВНА : " + "  " + Y);
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
	}
}
