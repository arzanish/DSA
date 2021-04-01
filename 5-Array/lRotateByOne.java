public class lRotateByOne {

  static void lROne(int[] arr, int n) {
    int temp = arr[0];
    for (int i = 1; i < n; i++)
      arr[i - 1] = arr[i];
    arr[n - 1] = temp;
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    int n = array.length;
    System.out.println("Before: ");
    for (int i = 0; i < n; i++)
      System.out.print(array[i] + " ");

    lROne(array, n);
    System.out.println("");
    System.out.println("After: ");
    for (int i = 0; i < n; i++)
      System.out.print(array[i] + " ");

  }

}
