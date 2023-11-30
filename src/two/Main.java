package two;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan n: ");
        int n = input.nextInt();

        int[][] arr = new int[n+1][n+1];

        System.out.println("\n");
        for (int i=1; i<=n; i++){
            System.out.print("\t" + (i));
        }
        System.out.println();
        for (int i=1; i<=n; i++){
            System.out.print(i + "\t");
            for (int j=1; j<=n; j++){
                arr[i][j] = i*j;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
