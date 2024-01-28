import java.util.Scanner;

public class GraphOperations {
    static class UnionFind {
        private int[] parent;
        private int[] size;

        public UnionFind(int n) {
            parent = new int[n];
            size = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX != rootY) {
                if (size[rootX] < size[rootY]) {
                    parent[rootX] = rootY;
                    size[rootY] += size[rootX];
                } else {
                    parent[rootY] = rootX;
                    size[rootX] += size[rootY];
                }
            }
        }

        public int getSize(int x) {
            return size[find(x)];
        }
    }

    public static int minOperations(int[] C, int[][] edges, int K) {
        int N = C.length;
        UnionFind uf = new UnionFind(N);

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int colorU = C[u];
            int colorV = C[v];

            if (colorU != colorV) {
                uf.union(u, v);
            }
        }

        int[] colorCount = new int[N + 1];
        for (int i = 0; i < N; i++) {
            colorCount[uf.find(i)]++;
        }

        int minOperations = 0;
        for (int i = 0; i < N; i++) {
            if (colorCount[i] != 0) {
                minOperations += colorCount[i] - 1;
            }
        }

        minOperations += K - 1;

        return minOperations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of edges (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of colors (K): ");
        int K = scanner.nextInt();

        int[] C = new int[N];
        System.out.println("Enter the color of each vertex (space-separated):");
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }

        int[][] edges = new int[M][2];
        System.out.println("Enter the edges (vertex1 vertex2):");
        for (int i = 0; i < M; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }

        scanner.close();

        int minOps = minOperations(C, edges, K);
        System.out.println("Minimum number of operations: " + minOps);
    }
}
