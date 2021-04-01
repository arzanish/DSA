public class Delete {
  static int deleteElem(int[] arr, int x, int n) {
    int i;
    for (i = 0; i < n; i++) {
      if (arr[i] == x)
        break;
    }
    if (i == n)
      return n;
    for (int j = i; j < n - 1; j++) {
      arr[j] = arr[j + 1];
    }
    return n - 1;

  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40 };
    int a = deleteElem(arr, 20, 4);
    for (int k = 0; k < a; k++) {
      System.out.println(arr[k]);
    }
  }
}
