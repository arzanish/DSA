public class NQueenProblem {

  static boolean isSafe(int[][] board, int row, int col) {
    int i, j;
    for (i = 0; i < col; i++)
      if (board[row][i] == 1)
        return false;

    for (i = row, j = col; i >= 0 && j >= 0; i--, j--) // for finding if queen is present int the upper left diagonal
    {
      if (board[i][j] == 1)
        return false;
    }

    for (i = row, j = col; i < board.length && j >= 0; i++, j--) {
      if (board[i][j] == 1)
        return false;
    }
    return true;
  }

  static boolean solveRec(int[][] board, int col) {
    if (col == board.length)
      return true;
    for (int i = 0; i < board.length; i++) {
      if (isSafe(board, i, col)) {
        board[i][col] = 1;
        if (solveRec(board, col + 1))
          return true;
        board[i][col] = 0;
      }
    }
    return false;
  }

  static boolean solve(int N) {
    if (N == 0)
      return false;
    int[][] board = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        board[i][j] = 0;
      }
    }

    if (solveRec(board, 0) == false)
      return false;
    else {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }
      return true;
    }
  }

  public static void main(String[] args) {
    System.out.print(solve(4));
  }
}
