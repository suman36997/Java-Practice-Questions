
import java.util.Scanner;

public class Test1 {
    public static int findSmallestElement(int[] A, int X, int Y) {
        int smallestElement = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= X && A[i] <= Y && A[i] < smallestElement) {
                smallestElement = A[i];
            }
        }

        if (smallestElement == Integer.MAX_VALUE) {
            return -1; // No element found
        }

        return smallestElement;
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

        System.out.print("Enter the lower bound X: ");
        int X = scanner.nextInt();

        System.out.print("Enter the upper bound Y: ");
        int Y = scanner.nextInt();

        int smallestElement = findSmallestElement(A, X, Y);
        System.out.println("Smallest element in the range [" + X + ", " + Y + "]: " + smallestElement);
    }
}

