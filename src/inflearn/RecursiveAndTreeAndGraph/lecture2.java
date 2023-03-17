package inflearn.RecursiveAndTreeAndGraph;

public class lecture2 {
    public static void main(String[] args) {
        DFS(11);
    }

    private static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n%2 + " ");
            DFS(n/2);
        }
    }
}
