public class FreqInSortedArray {

  public static void main(String[] args) {

    int[] arr = { 10, 10, 10, 20, 20, 30, 60 };
    freqInSortedArray(arr);
  }

  public static void freqInSortedArray(int arr[]) {
    int n = arr.length;
    int i = 1;
    int freq = 1;
    while (i < n) {
      while (i < n && arr[i] == arr[i - 1]) {
        freq++;
        i++;
      }
      System.out.println(arr[i - 1] + " : " + freq);
      freq = 1;
      i++;
    }

    // If the last and second last element are not same
    if (arr[n - 1] != arr[n - 2])
      System.out.println(arr[n - 1] + " : 1");
  }
}
