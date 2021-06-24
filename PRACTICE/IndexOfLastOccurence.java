public class IndexOfLastOccurence {

  static int indexOfLastOccurence(int[] arr, int x) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] > x)
        high = mid - 1;
      else if (arr[mid] < x)
        low = mid + 1;
      else {
        if (mid != arr.length - 1 && arr[mid] == arr[mid + 1])
          low = mid + 1;
        else
          return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 10, 20, 20, 30, 30, 30, 40, 50, 60, 60 };
    System.out.println(indexOfLastOccurence(arr, 60));
  }
}
