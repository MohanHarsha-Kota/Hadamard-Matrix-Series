import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N, S;
        int i, j, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N value (Need to be a multiple of 2)");
        N = scan.nextInt();
        boolean[][] mat = new boolean[N][N];
        S = 1;
        while(S<=N) { // Initialisation
            for (i = 0; i < S; i++) {
                for (j = 0; j < S; j++) {
                    mat[i][j] = true;
                }
            }
            S = 2*S;
        }
        S = 1;
        while(S<=N) // To print series of Hadamard Matrices
        {
            for(k = 1;k<S;k+=k) {
                for (i = 0; i < k; i++) {
                    for (j = 0; j < k; j++) {
                    mat[i+k][j] = mat[i][j];
                    mat[i][j+k] = mat[i][j];
                    mat[i+k][j+k] = !mat[i][j];
                    }
                }
            }

            for(i=0;i<S;i++)
            {
                for(j=0;j<S;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("***");
            S=2*S;
        }

    }
}
