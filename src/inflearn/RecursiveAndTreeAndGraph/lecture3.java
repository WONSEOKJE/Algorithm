package inflearn.RecursiveAndTreeAndGraph;

public class lecture3 {
    public static void main(String[] args) {
        System.out.println(DFS(5));
    }

    private static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }
}
