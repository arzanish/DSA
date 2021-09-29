import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortesPathUnweightedGraph {

  static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  static int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int s, int V) {
    boolean[] visited = new boolean[V];
    int[] distance = new int[V];
    for (int i = 0; i < V; i++)
      distance[i] = Integer.MAX_VALUE;
    distance[s] = 0;
    Queue<Integer> q = new LinkedList<>();
    q.add(s);
    visited[s] = true;
    while (q.isEmpty() == false) {
      int v = q.poll();
      for (int u : adj.get(v)) {
        if (visited[u] == false) {
          distance[u] = distance[v] + 1;
          visited[u] = true;
          q.add(u);
        }
      }
    }
    return distance;
  }

  public static void main(String[] args) {
    int V = 4;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<Integer>());

    addEdge(adj, 0, 1);
    addEdge(adj, 1, 2);
    addEdge(adj, 2, 3);
    addEdge(adj, 0, 2);
    addEdge(adj, 1, 3);

    int s = 0;
    int[] dist = shortestPath(adj, s, V);

    for (int i = 0; i < V; i++) {
      System.out.print(dist[i] + " ");
    }
  }
}
