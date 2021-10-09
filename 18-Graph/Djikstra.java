import java.util.Arrays;

public class Djikstra {
  public static void main(String[] args) {
    int graph[][] = new int[][] { { 0, 50, 100, 0 }, { 50, 0, 30, 200 }, { 100, 30, 0, 20 }, { 0, 200, 20, 0 }, };

    for (int x : djikstra(graph, 0)) {
      System.out.print(x + " ");
    }
  }

  static final int V = 4;

  static int[] djikstra(int[][] graph, int s) {
    int V = graph.length;
    boolean[] finalize = new boolean[V];
    int[] dist = new int[V];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[s] = 0;

    for (int count = 0; count < V; count++) {
      int u = -1;
      for (int i = 0; i < V; i++) {
        if (finalize[i] == false && (u == -1 || dist[i] < dist[u]))
          u = i;
      }

      finalize[u] = true;

      for (int v = 0; v < V; v++) {
        if (graph[u][v] != 0 && finalize[v] == false) {
          dist[v] = Math.min(dist[v], dist[u] + graph[u][v]);
        }
      }
    }
    return dist;
  }
}
