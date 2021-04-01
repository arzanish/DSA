
class Insert {
  static int insert(int[] arr, int n, int x, int cap, int pos) {
    if (n == cap)
      return n;
    int idx = pos - 1;

    for (int i = n - 1; i >= idx; i--) {
      arr[i + 1] = arr[i];
    }

    arr[idx] = x;
    return n + 1;

  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    int x = 15;
    int n = 3;
    n = insert(arr, n, x, 5, 2);

    for (int i = 0; i < n; i++)
      System.out.println(arr[i]);

  }
}