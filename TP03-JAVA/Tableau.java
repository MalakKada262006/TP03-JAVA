import java.util.Scanner;
public class Tableau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Donner n:");
		int n = sc.nextInt();
		int[] tableau = new int[n];

		for (int i = 0; i < n; i++) {
			int nombre = 2 * i + 1;
			tableau[i] = nombre * nombre;
		}

		System.out.println("Les valeurs sont :");

		for (int i = 0; i < n; i++) {
			System.out.println(tableau[i]);
		}

		sc.close();
	}
}
