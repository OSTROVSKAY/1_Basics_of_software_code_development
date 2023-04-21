
       /*  4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
               Поменять местами дробную и целую части числа и вывести полученное значение числа. */

package Task_1_4;

public class Task_1_4 {

	public static void main(String[] args) {
		
		/* Получение начального числа рандомным путём */
		int a = 100 + (int) (Math.random()*(999-100));
		int b = 100 + (int) (Math.random()*(999-100));
		
		double R = a + (double)b/1000;
		
		System.out.println("Начальное значение числа   :" + "  " + R);
	
		double R1 = R*1000;	
		R1=R1 % 1000;
		
		System.out.println("Дробная часть числа        :" + "  " + R1/1000);
		
		double R2 = (int)R;
		System.out.println("Целая часть числа          :" + "  " + R2);
		
		     /* Полученное значение числа */
		
		double R3 = R1 + R2/1000;
		System.out.println("Полученное значение числа  :" + "  " + R3);
	}
}
