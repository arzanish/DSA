import java.util.*;

// Given a source and an undirected graph print BFS. There is no disconnection among the nodes in the graph.
public class BFS_version1 {
  static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  static void printGraph(ArrayList<ArrayList<Integer>> adj) {
    for (int i = 0; i < adj.size(); i++) {
      for (int j = 0; j < adj.get(i).size(); i++) {
        System.out.print(adj.get(i).get(j));
      }
    }
  }

  static void BFS_v1(ArrayList<ArrayList<Integer>> adj, int V, int s) {
    boolean[] visited = new boolean[V];
    for (int i = 0; i < V; i++)
      visited[i] = false;

    Queue<Integer> q = new LinkedList<>();

    visited[s] = true;
    q.add(s);

    while (q.isEmpty() == false) {
      int u = q.poll();
      System.out.print(u + " ");

      for (int v : adj.get(u)) {
        if (visited[v] == false) {
          visited[v] = true;
          q.add(v);
        }
      }
    }
  }

  public static void main(String[] ags) {

  }

}
