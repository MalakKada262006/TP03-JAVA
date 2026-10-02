import java.util.Scanner;
public class TriangleIsocel {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Donner le nombre de lignes :");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
    }
}
