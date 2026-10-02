import java.util.Scanner;

public class FenetreGlissante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = scanner.nextInt();
        }

        int MAXV = 100000;
        int[] freq = new int[MAXV + 1]; 
        int distinct = 0; 
        for (int i = 0; i < k; i++) {
            int x = T[i];
            if (freq[x] == 0) {
                distinct++;
            }
                        freq[x]++;
        }

        System.out.print(distinct);
        for (int i = k; i < n; i++) {
            int out = T[i - k];
            freq[out]--;
            
            if (freq[out] == 0) {
                distinct--;
            }

            int in = T[i];
            
            if (freq[in] == 0) {
                distinct++;
            }
            freq[in]++;

            System.out.print(" " + distinct);
        }

        System.out.println(); 
        scanner.close();
    }
}
