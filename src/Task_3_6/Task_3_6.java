
/*
   6. Вывести на экран соответствий между символами и 
      их численными обозначениями в памяти компьютера.
*/

package Task_3_6;

public class Task_3_6 {

	public static void main(String[] args) {
		
/*    
   Вывести на экран соответствий между символами и 
   их численными обозначениями в памяти компьютера 
   (Таблицу ASCII).
*/
		  
		System.out.println("СООТВЕТСТВИЯ МЕЖДУ СИМВОЛАМИ И ИХ ЧИСЛЕННЫМИ ОБОЗНАЧЕНИЯМИ");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
		 for (int i = 32; i <= 126; i++) {
			    System.out.println("----------------------------------------");
                System.out.println("НОMЕР СИМВОЛА :  " + i + "   ||   " + "СИМВОЛ :  " +  (char)i);
                System.out.println("----------------------------------------");
               }
	}
}
