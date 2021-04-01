public class Rotate90 {

  static void transpose(int mat[][]) {
    for (int i = 0; i < mat.length; i++)
      for (int j = i + 1; j < mat[i].length; j++) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }

  }

  static void rotate90(int[][] mat) {
    transpose(mat);
    for (int i = 0; i < mat.length; i++) {
      int low = 0;
      int high = mat.length - 1;
      while (low < high) {
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
        low++;
        high--;
      }

    }
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

    rotate90(arr);
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }

      System.out.println();
    }
  }
}
