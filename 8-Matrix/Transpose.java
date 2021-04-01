public class Transpose {

  static void transpose(int mat[][]) {
    for (int i = 0; i < mat.length; i++)
      for (int j = i + 1; j < mat[i].length; j++) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }

  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    transpose(arr);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++)
        System.out.print(arr[i][j] + " ");
      System.out.println();
    }
  }
}
