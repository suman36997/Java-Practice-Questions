import java.util.Arrays;
import java.util.Scanner;

public class MonsterSentinels {
    public static int canKillMonsters(int[] A, int[] H, int[] B, int K) {
        int N = B.length;
        int M = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        int leftSentinelIndex = 0;
        int rightSentinelIndex = N - 1;
        int leftMonsterIndex = 0;
        int rightMonsterIndex = M - 1;

        while (leftMonsterIndex <= rightMonsterIndex && leftSentinelIndex <= rightSentinelIndex) {
            if (A[leftMonsterIndex] < B[leftSentinelIndex] || A[rightMonsterIndex] > B[rightSentinelIndex]) {
                return 0;
            }

            int distanceToLeftSentinel = Math.abs(A[leftMonsterIndex] - B[leftSentinelIndex]);
            int distanceToRightSentinel = Math.abs(A[rightMonsterIndex] - B[rightSentinelIndex]);

            int leftMonsterHealth = H[leftMonsterIndex];
            int rightMonsterHealth = H[rightMonsterIndex];

            int shotsNeeded = Math.max((int) Math.ceil((double) leftMonsterHealth / K),
                    (int) Math.ceil((double) rightMonsterHealth / K));

            if (shotsNeeded > distanceToLeftSentinel && shotsNeeded > distanceToRightSentinel) {
                return 0;
            }

            if (distanceToLeftSentinel >= distanceToRightSentinel) {
                leftMonsterIndex++;
                leftSentinelIndex++;
            } else {
                rightMonsterIndex--;
                rightSentinelIndex--;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sentinels (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of monsters (M): ");
        int M = scanner.nextInt();

        int[] A = new int[M];
        int[] H = new int[M];
        System.out.println("Enter the x-coordinate ");
        for (int i = 0; i < M; i++) {
            A[i] = scanner.nextInt();
            
        }
        System.out.println("Enter the heath of each monster: ");
        for (int i = 0; i < M; i++) {
           
            H[i] = scanner.nextInt();
        }

        int[] B = new int[N];
        System.out.println("Enter the x-coordinate of each sentinel:");
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        System.out.print("Enter the health reduction value (K): ");
        int K = scanner.nextInt();

        scanner.close();

        int result = canKillMonsters(A, H, B, K);
        System.out.println("Possible to kill all monsters? " + (result == 1 ? "1" : "0"));
    }
}
