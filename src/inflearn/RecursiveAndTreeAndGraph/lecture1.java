package inflearn.RecursiveAndTreeAndGraph;

public class lecture1 {
    public static void main(String[] args) {
        DFS(3);
    }

    private static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }
}
