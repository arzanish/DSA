public class SortThreeTypesOfElements {

  static void sort(int[] arr, int n) {
    int low = 0, mid = 0, high = n - 1;
    while (mid <= high) {
      if (arr[mid] == 0) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
        low++;
        mid++;
      } else if (arr[mid] == 1)
        mid++;
      else if (arr[mid] == 2) {
        int temp = arr[high];
        arr[high] = arr[mid];
        arr[mid] = temp;
        mid++;
        high--;
      }
    }

  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 0, 0, 1, 1, 2, 2, 0 };
    sort(arr, arr.length);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
