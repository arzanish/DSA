import java.util.Iterator;
import java.util.LinkedList;

public class BridgesGraph {

  private int V;
  private LinkedList<Integer> adj[];
  int time = 0;
  static final int NIL = -1;

  BridgesGraph(int v) {
    V = v;
    adj = new LinkedList[V];
    for (int i = 0; i < V; i++)
      adj[i] = new LinkedList();
  }

  void addEdge(int v, int u) {
    adj[u].add(v);
    adj[v].add(u);
  }

  void bridgeUtil(int u, int parent[], int disc[], int low[], boolean[] visited) {
    visited[u] = true;
    low[u] = disc[u] = ++time;
    Iterator<Integer> i = adj[u].iterator();

    while (i.hasNext()) {
      int v = i.next();
      if (!visited[v]) {
        parent[v] = u;
        bridgeUtil(v, parent, disc, low, visited);

        low[u] = Math.min(low[u], low[v]);
        if (low[v] > disc[u])
          System.out.println(u + " " + v);

      } else if (v != parent[u]) {
        low[u] = Math.min(low[u], disc[v]);
      }
    }

  }

  void bridge() {
    int parent[] = new int[V];
    int disc[] = new int[V];
    int low[] = new int[V];
    boolean[] visited = new boolean[V];

    for (int i = 0; i < V; i++) {
      parent[i] = NIL;
      visited[i] = false;
    }

    for (int i = 0; i < V; i++)
      if (!visited[i])
        bridgeUtil(i, parent, disc, low, visited);
  }

  public static void main(String[] args) {
    System.out.println("Bridges in first graph ");
    BridgesGraph g = new BridgesGraph(5);
    g.addEdge(1, 0);
    g.addEdge(0, 2);
    g.addEdge(2, 1);
    g.addEdge(0, 3);
    g.addEdge(3, 4);
    g.bridge();
  }
}
