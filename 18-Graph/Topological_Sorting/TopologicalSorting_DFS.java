package Topological_Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting_DFS {
  static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
    adj.get(u).add(v);
  }

  static void DFS(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> st, boolean[] visited) {
    visited[v] = true;
    for (int u : adj.get(v)) {
      if (visited[u] == false)
        DFS(adj, u, st, visited);
    }
    st.push(v);
  }

  static void topologicalSortingDFS(ArrayList<ArrayList<Integer>> adj, int V) {
    Stack<Integer> st = new Stack<>();
    boolean[] visited = new boolean[V];
    for (int i = 0; i < V; i++)
      visited[i] = false;

    for (int i = 0; i < V; i++) {
      if (visited[i] == false) {
        DFS(adj, i, st, visited);
      }
    }
    while (st.isEmpty() == false) {
      System.out.print(st.pop() + " ");
    }

  }

  public static void main(String[] args) {
    int V = 5;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<Integer>());

    addEdge(adj, 0, 1);
    addEdge(adj, 1, 3);
    addEdge(adj, 2, 3);
    addEdge(adj, 3, 4);
    addEdge(adj, 2, 4);

    System.out.println("Following is a Topological Sort of");
    topologicalSortingDFS(adj, V);
  }

}
