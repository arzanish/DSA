package Detect_Cycle;

import java.util.ArrayList;

public class DetectCycleDirectedGraph_DFS {
  static void addEdge(ArrayList<ArrayList<Integer>> adj, int v, int u) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  static boolean detect_Rec(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited, boolean[] recSt) {
    visited[v] = true;
    recSt[v] = true;
    for (int u : adj.get(v)) {
      if (visited[u] == false && detect_Rec(adj, u, visited, recSt))
        return true;
      else if (recSt[u] == true)
        return true;
    }
    recSt[v] = false;
    return false;

  }

  static boolean detect_DFS(ArrayList<ArrayList<Integer>> adj, int V) {
    boolean[] visited = new boolean[V];
    boolean recSt[] = new boolean[V];

    for (int i = 0; i < V; i++) {
      if (visited[i] == false) {
        if (detect_Rec(adj, i, visited, recSt) == true)
          return true;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int V = 6;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<Integer>());

    addEdge(adj, 0, 1);
    addEdge(adj, 2, 1);
    addEdge(adj, 2, 3);
    addEdge(adj, 3, 4);
    addEdge(adj, 4, 5);
    addEdge(adj, 5, 3);

    if (detect_DFS(adj, V) == true)
      System.out.println("Cycle found");
    else
      System.out.println("No cycle found");
  }

}
