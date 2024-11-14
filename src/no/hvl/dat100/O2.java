package lab3;
import java.util.Scanner;

public class O2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oppgi bruttoinntekt: ");
        double inntekt = input.nextDouble();
        double trinnskatt = 0;

        if (inntekt < 208050) {
            System.out.println("Din trinnskatt er: 0 kr");
        } else {
            if (inntekt <= 297900) {
                trinnskatt = (inntekt - 208050) * 0.017;
            } else if (inntekt <= 742400) {
                trinnskatt = (297900 - 208050) * 0.017 + (inntekt - 297900) * 0.04;
            } else if (inntekt <= 1240000) {
                trinnskatt = (297900 - 208050) * 0.017 + (742400 - 297900) * 0.04 + (inntekt - 742400) * 0.132;
            } else {
                trinnskatt = (297900 - 208050) * 0.017 + (742400 - 297900) * 0.04 + (1240000 - 742400) * 0.132 + (inntekt - 1240000) * 0.162;
            }

            System.out.println("Din trinnskatt er: " + trinnskatt + " kr");
        }

        input.close();
    }
}