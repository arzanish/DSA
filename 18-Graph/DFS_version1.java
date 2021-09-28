
// Print DFS when source is given (Graph is connected)
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class DFS_version1 {
  static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  static void DFS_v1(ArrayList<ArrayList<Integer>> adj, int V, int s) {
    boolean[] visited = new boolean[V];

    DFS_Rec(adj, s, visited);
  }

  static void DFS_Rec(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited) {
    visited[v] = true;
    System.out.print(v + " ");
    for (int u : adj.get(v)) {
      if (visited[u] == false) {
        DFS_Rec(adj, u, visited);
      }
    }
  }

  public static void main(String[] args) {
    int V = 7;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<Integer>());

    addEdge(adj, 0, 1);
    addEdge(adj, 0, 2);
    addEdge(adj, 2, 3);
    addEdge(adj, 1, 3);
    addEdge(adj, 1, 4);
    addEdge(adj, 3, 4);

    System.out.println("Following is Depth First Traversal: ");
    DFS_v1(adj, V, 0);
  }

}
