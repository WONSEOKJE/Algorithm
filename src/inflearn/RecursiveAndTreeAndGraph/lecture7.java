package inflearn.RecursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;

public class lecture7 {
    NodeBFS root;
    public void BFS(NodeBFS root) {
        Queue<NodeBFS> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                NodeBFS cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    queue.offer(cur.lt);
                }
                if (cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        lecture7 tree = new lecture7();
        tree.root = new NodeBFS(1);
        tree.root.lt = new NodeBFS(2);
        tree.root.rt = new NodeBFS(3);
        tree.root.lt.lt = new NodeBFS(4);
        tree.root.lt.rt = new NodeBFS(5);
        tree.root.rt.lt = new NodeBFS(6);
        tree.root.rt.rt = new NodeBFS(7);
        tree.BFS(tree.root);
    }
}

class NodeBFS {
    int data;
    NodeBFS lt,rt;
    public NodeBFS(int val) {
        data = val;
        lt = rt = null;
    }
}
