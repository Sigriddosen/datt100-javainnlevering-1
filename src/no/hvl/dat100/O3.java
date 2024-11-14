package lab3;
import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Les inn et heltall n fra brukeren
	        System.out.print("Skriv inn et heltall n > 0: ");
	        int n = scanner.nextInt();

	        // Kontroller at n er større enn 0
	        if (n > 0) {
	            // Beregn fakultet
	            long fakultet = beregnFakultet(n);
	            System.out.println("Fakultet av " + n + " er " + fakultet);
	        } else {
	            System.out.println("Vennligst skriv inn et heltall større enn 0.");
	        }

	        scanner.close();
	    }

	    // Metode for å beregne fakultet
	    public static long beregnFakultet(int n) {
	        long fakultet = 1;
	        for (int i = 2; i <= n; i++) {
	            fakultet *= i;
	        }
	        return fakultet;
	}

}
