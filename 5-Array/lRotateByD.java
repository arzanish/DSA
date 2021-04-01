public class lRotateByD {

  static void lRD(int[] arr, int n, int D) {
    reverse(arr, 0, D - 1);
    reverse(arr, D, n - 1);
    reverse(arr, 0, n - 1);
  }

  static void reverse(int[] arr, int low, int high) {
    while (low < high) {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;
    System.out.println("Before: ");
    for (int i = 0; i < n; i++)
      System.out.print(array[i] + " ");

    lRD(array, n, 5);
    System.out.println("");
    System.out.println("After: ");
    for (int i = 0; i < n; i++)
      System.out.print(array[i] + " ");

  }
}
