public class SortTwoTypesOfElements {

  static void segPosNeg(int[] arr, int n) {
    int i = -1;
    int j = n;
    while (true) {
      do {
        i++;
      } while (arr[i] < 0);// initially it will point at the first non-negative element
      do {
        j--;
      } while (arr[j] >= 0);// initially it will point at the last negative element
      if (i >= j)
        return;
      // swapping
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 15, -3, -2, 18 };

    segPosNeg(arr, arr.length);
    for (int item : arr)
      System.out.print(item + " ");
  }

}
