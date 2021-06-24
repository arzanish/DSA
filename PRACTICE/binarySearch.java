public class binarySearch {
  static int bsearch(int[] arr, int x) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == x) {
        return mid;
      } else if (arr[mid] > x) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  static int bsearchRecursive(int[] arr, int l, int h, int x) {
    if (l > h)
      return -1;
    int mid = (l + h) / 2;
    if (arr[mid] == x)
      return mid;
    else if (arr[mid] > x) {
      return bsearchRecursive(arr, l, mid - 1, x);
    } else {
      return bsearchRecursive(arr, mid + 1, h, x);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50, 60 };

    int x = 40;
    System.out.println(bsearchRecursive(arr, 0, arr.length, x));
  }
}
