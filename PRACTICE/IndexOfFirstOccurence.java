public class IndexOfFirstOccurence {
  static int indexOfFirstOccurence(int[] arr, int x) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == x) {
        if (mid != 0 && arr[mid - 1] == arr[mid]) {
          high = mid - 1;
        } else {
          return mid;
        }
      } else if (arr[mid] > x) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 10, 10, 20, 20, 30, 40, 50, 60 };
    System.out.println(indexOfFirstOccurence(arr, 60));
  }
}
