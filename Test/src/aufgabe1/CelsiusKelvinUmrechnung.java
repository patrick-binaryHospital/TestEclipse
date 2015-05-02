package aufgabe1;

import java.util.Scanner;

public class CelsiusKelvinUmrechnung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Wert Celsius ein:");
		int celsius = sc.nextInt();
		double kelvin = celsius + 273.15;
		System.out.println("Der Wert Celsius: " + celsius
				+ " in Kelvin beträgt: " + kelvin);

	}

}
