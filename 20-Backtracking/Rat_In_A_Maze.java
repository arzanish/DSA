public class Rat_In_A_Maze {

  static int N;

  static boolean isSafe(int[][] maze, int i, int j) {
    return (i < N && j < N && maze[i][j] == 1);
  }

  static boolean solveMaze(int[][] maze) {
    int[][] sol = new int[N][N];
    if (solveMazeRec(maze, sol, 0, 0) == false)
      return false;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++)
        System.out.print(sol[i][j] + " ");
      System.out.println();
    }
    return true;
  }

  static boolean solveMazeRec(int[][] maze, int[][] sol, int i, int j) {
    if (i == N - 1 && j == N - 1) {
      sol[i][j] = 1;
      return true;
    }
    if (isSafe(maze, i, j)) {
      sol[i][j] = 1;
      if (solveMazeRec(maze, sol, i + 1, j) == true)
        return true;
      if (solveMazeRec(maze, sol, i, j + 1))
        return true;
      sol[i][j] = 0;
    }
    return false;
  }

  public static void main(String[] args) {
    int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };

    N = maze.length;
    solveMaze(maze);
  }
}
