
/*
  4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
     Определить, пройдет ли кирпич через отверстие.
*/

package Task_2_4;

import java.io.IOException;
import java.util.Scanner;


public class Task_2_4 {

	public static void main(String[] args)  {
		
		  System.out.println("ПРОГРАММА: ПРОЙДЁТ ЛИ КИРПИЧ ЧЕРЕЗ ПРЯМОУГОЛЬНОЕ ОТВЕРСТИЕ ?");
		  System.out.println("------------------------------------------------------------");
		  System.out.println("------------------------------------------------------------");
		
		  Scanner scanner = new Scanner(System.in);
		
		// Размеры прямоугольного отверстия
		   double A = 0; // Длина прямоугольного отверстия
		   double B = 0; // Ширина прямоугольного отверстия
		
		// Размеры кирпича
		   double x = 0; // Длина кирпича
		   double y = 0; // Ширина кирпича
		   double z = 0; // Высота кирпича
		   
		  
		        System.out.println("Введите размеры прямоугольного отверстия : Длина - A, Ширина - B ");
		        System.out.println("-----------------------------------------------------------------");
		        System.out.println("-----------------------------------------------------------------");
		   
		        do {
		            System.out.print("Введите значения : Длина прямоугольного отверстия - A............:");
		            String AA = scanner.nextLine();
		           
		            try {
		                  A = Double.parseDouble(AA);
		                     } catch (NumberFormatException e) {
		                	                                     System.out.println("----------------------------------------------------------------");
		                	                                     System.out.println("Данные введены не правильно. Введите снова");
		                                                       }
		            System.out.println("----------------------------------------------------------------");
		           }
		        	
		        while (A <= 0); 
		  
		        do {
		            System.out.print("Введите значения : Ширина прямоугольного отверстия - B...........:");
		            String BB = scanner.nextLine();
		            
		            try {
		                  B = Double.parseDouble(BB);
		                     } catch (NumberFormatException e) {
		                	                                     System.out.println("----------------------------------------------------------------");
		                	                                     System.out.println("Данные введены не правильно. Введите снова");
		                                                       }
		            System.out.println("----------------------------------------------------------------");
		           }
		            
		            
		        while (B <= 0);
		        
		        
		       System.out.println("----------------------------------------------------------------");
		       System.out.println("Введите размеры кирпича : Длина - x, Ширина - y, Высота - z ");
		       System.out.println("----------------------------------------------------------------");
		        
		        
		        do {
		            System.out.print("Введите значения : Длина кирпича - x.............................:");
		            String xx = scanner.nextLine();
		            try {
		                  x = Double.parseDouble(xx);
		                     } catch (NumberFormatException e) {
		                	                                     System.out.println("----------------------------------------------------------------");
		                	                                     System.out.println("Данные введены не правильно. Введите снова");
		                                                       }
		            System.out.println("----------------------------------------------------------------");
		           }
		           
		        while (x <= 0);
		        
		        do {
		        	System.out.print("Введите значения : Длина кирпича - y.............................:");
		            String yy = scanner.nextLine();
		            try {
		                  y = Double.parseDouble(yy);
		                     } catch (NumberFormatException e) {
		                	                                     System.out.println("----------------------------------------------------------------");
		                	                                     System.out.println("Данные введены не правильно. Введите снова");
		                                                       }
		            System.out.println("----------------------------------------------------------------");
		           }
		        while (y <= 0);
				
		        do {
		            System.out.print("Введите значения : Высота кирпича - z............................:");
		            String zz = scanner.nextLine();
		            try {
		                  z = Double.parseDouble(zz);
		                     } catch (NumberFormatException e) {
		                	                                     System.out.println("----------------------------------------------------------------");
		                	                                     System.out.println("Данные введены не правильно. Введите снова");
		                                                       }
		            System.out.println("----------------------------------------------------------------");
		            }
		        while (z <= 0);
		   
	                                                   // Определение, пройдет ли кирпич через отверстие
			
		   if ( (( A >= z) & ( B >= y )) | ((A >= y ) & ( B >= z)) | (( A >= x ) & ( B >= z )) | ((A >= z) & ( B >= x )) | (( A >= x) & ( B >= y )) | ((A >= y ) & ( B >= x)) )
		         
		       {
			    System.out.println("--------------------------------------------");
			    System.out.println("Кирпич пройдёт через прямоугольное отверстие");
			    System.out.println("--------------------------------------------");
		       }
		   
		      else
		          {
		    	   System.out.println("-----------------------------------------------");
		    	   System.out.println("Кирпич не пройдёт через прямоугольное отверстие");
		    	   System.out.println("-----------------------------------------------");
		          }
		
		scanner.close();
	}
	
}
		        
