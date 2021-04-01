public class SnakePattern {
  static void printSnakePattern(int mat[][]) {
    for (int i = 0; i < mat.length; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < mat[i].length; j++)
          System.out.print(mat[i][j] + " ");
      } else {
        for (int j = mat[i].length - 1; j > -1; j--)
          System.out.print(mat[i][j] + " ");
      }
    }
  }

  public static void main(String[] args) {

    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    printSnakePattern(arr);

  }
}