import java.util.Scanner;
public class Main {

    public static void rotate90ClockwiseInPlace(int[][] A) {
        int N = A.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }

    public static void rotate90CounterClockwiseInPlace(int[][] A) {
        int N = A.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N / 2; i++) {
                int temp = A[i][j];
                A[i][j] = A[N - 1 - i][j];
                A[N - 1 - i][j] = temp;
            }
        }
    }

    public static void rotate180InPlace(int[][] A) {
        int N = A.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N / 2; i++) {
                int temp = A[i][j];
                A[i][j] = A[N - 1 - i][j];
                A[N - 1 - i][j] = temp;
            }
        }
    }

    public static void afficherMatrice(int[][] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(); // Nouvelle ligne à chaque rangée
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez N (taille de la matrice) : ");
        int N = scanner.nextInt();

        int[][] matrice = new int[N][N];

        System.out.println("Entrez les " + (N * N) + " éléments de la matrice :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }

        rotate90ClockwiseInPlace(matrice);

        
        System.out.println("\nMatrice après rotation à 90° (horaire) :");
        afficherMatrice(matrice);

        scanner.close();
    }
}
