public class CountOccurencesInSortedArray {

  static int countOccurencesInSortedArray(int[] arr, int x) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] > x)
        high = mid - 1;
      else if (arr[mid] < x)
        low = mid + 1;
      else {
        if (mid != 0 && arr[mid] == arr[mid - 1])
          high = mid - 1;
        else {
          int count = 0;
          while (mid != arr.length && arr[mid] == x) {
            count++;
            mid++;
          }
          return count;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 10, 10, 20, 20, 30, 40, 50, 50 };
    System.out.println(countOccurencesInSortedArray(arr, 50));
  }
}
