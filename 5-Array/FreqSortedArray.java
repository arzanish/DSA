public class FreqSortedArray {

  public static void freqSortedArray(int[] arr, int n) {
    int freq = 1, i = 1;
    while (i < n) {
      while (i < n && arr[i] == arr[i - 1]) {
        freq++;
        i++;
      }
      System.out.println(arr[i - 1] + " : " + freq);
      i++;
      freq = 1;
    }
    if (n == 1 || arr[n - 1] != arr[n - 2]) // if array has only 1 element OR Last element is different from the second
                                            // last element
      System.out.println(arr[n - 1] + " : " + freq);
  }

  public static void main(String[] args) {
    int[] arr = { 10, 10, 10, 20, 20 };
    freqSortedArray(arr, arr.length);

  }
}
