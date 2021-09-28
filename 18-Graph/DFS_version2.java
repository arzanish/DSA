
//DFS for disconnected Graphs
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class DFS_version2 {
  static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  static void DFS(ArrayList<ArrayList<Integer>> adj, int V) {
    boolean[] visited = new boolean[V];
    for (int i = 0; i < V; i++) {
      if (visited[i] == false) {
        DFS_Rec(adj, i, visited);
      }
    }
  }

  static void DFS_Rec(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited) {
    visited[v] = true;
    System.out.print(v + " ");
    for (int u : adj.get(v)) {
      if (visited[u] == false)
        DFS_Rec(adj, u, visited);
    }
  }

  public static void main(String[] args) {
    int V = 5;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<Integer>());

    addEdge(adj, 0, 1);
    addEdge(adj, 0, 2);
    addEdge(adj, 1, 2);
    addEdge(adj, 3, 4);

    System.out.println("Following is Depth First Traversal for disconnected graphs: ");
    DFS(adj, V);
  }

}
