import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Select option:\n" + "1. C > K\n" + "2. K > C");
		int option = in.nextInt();
		in.nextLine();
		System.out.println("Insert value:");
		double value = in.nextDouble();
		double result;
		switch (option) {
		case 1:
			result = TemperatureController.celsiusToKelvin(value);
			System.out.println(result);
			break;
		case 2:
			result = TemperatureController.kelvinToCelsius(value);
			System.out.println(result);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}

	}

}
