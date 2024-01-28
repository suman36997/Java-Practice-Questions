import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayOperations {
    public static List<Integer> minOperations(int[] A, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        int sumDiff = 0;

        for (int[] query : queries) {
            int K = query[0];
            int Y = query[1];
            int diff = A[K] - Y;
            A[K] = Y;
            sumDiff += Math.abs(diff);
            result.add(sumDiff);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int N = scanner.nextInt();
        int[] A = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of queries: ");
        int Q = scanner.nextInt();
        int[][] queries = new int[Q][2];

        System.out.println("Enter the queries in the format 'K Y':");
        for (int i = 0; i < Q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }

        scanner.close();

        List<Integer> result = minOperations(A, queries);
        System.out.println("Minimum number of operations for each query: " + result);
    }
}
