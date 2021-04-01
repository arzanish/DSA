
public class BoundaryElements {

  static void printBoundaryElements(int mat[][]) {
    if (mat.length == 1)
      for (int i = 0; i < mat[0].length; i++)
        System.out.print(mat[0][i] + " ");
    else if (mat[0].length == 1)
      for (int i = 0; i < mat.length; i++)
        System.out.println(mat[i][0] + " ");
    else {
      for (int i = 0; i < mat[0].length; i++) {
        System.out.print(mat[0][i] + " ");
      }

      for (int i = 1; i < mat.length; i++) {
        System.out.print(mat[i][(mat[i].length) - 1] + " ");
      }

      for (int i = mat[0].length - 2; i > -1; i--) {
        System.out.print(mat[mat.length - 1][i] + " ");
      }

      for (int i = mat.length - 2; i >= 1; i--) {
        System.out.print(mat[i][0] + " ");
      }
    }

  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

    printBoundaryElements(arr);
  }
}
