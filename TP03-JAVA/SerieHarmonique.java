import java.util.Scanner;
public class SerieHarmonique {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	double somme = 0;
	System.out.print("Donner n :");
	n = sc.nextInt();
	for (int i = 1; i <= n; i++) {
		somme = somme + 1.0 / i;
	}
	System.out.println("La somme =" + somme);
	sc.close();
	}

}