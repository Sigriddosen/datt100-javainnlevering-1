package lab3;
import java.util.Scanner;

public class O1 {
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        for (int i = 1; i <= 10; i++) {
		            int poengsum;
		            

		            while (true) {
		                System.out.print("Skriv inn poengsum for student " + i + ": ");
		                poengsum = scanner.nextInt();
		                
		                if (poengsum < 0 || poengsum > 100) {
		                    System.out.println("Feilmelding: Ugyldig poengsum! Prøv igjen.");
		                } else {
		                    break; 
		                }
		            }
		            
		        
		            if (poengsum >= 90) {
		            	System.out.println("A");
		            } else if (poengsum >= 80) {
		                System.out.println("B");
		            } else if (poengsum >= 60) {
		                System.out.println("C");
		            } else if (poengsum >= 50) {
		                System.out.println("D");
		            } else if (poengsum >= 40) {
		                System.out.println("E");
		            } else {
		                System.out.println("F");
		            }
		        }

		        scanner.close();
		    }
		
	}

