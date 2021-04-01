//  also known as QuickSelect algorihtm
public class KthSmallest {

  static int lPartition(int[] arr, int l, int h) {
    int pivot = arr[h];
    int i = l - 1;
    for (int j = l; j <= h - 1; j++) {
      if (arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[h];
    arr[h] = temp;

    return i + 1;
  }

  static int quickSelect(int arr[], int k) {
    if (k > arr.length)
      return -1;
    int l = 0;
    int h = k - 1;
    while (l <= h) {
      int p = lPartition(arr, l, h);
      if (p == k - 1)
        return p;
      else if (p > k - 1)
        h = p - 1;
      else
        l = p + 1;
    }
    return -1;
  }

  public static void main(String[] argd) {
    int arr[] = new int[] { 10, 4, 5, 8, 11, 6, 26 };

    int n = arr.length;
    int k = 5;
    int index = quickSelect(arr, k);

    System.out.print(arr[index]);

  }
}
