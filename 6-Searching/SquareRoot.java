public class SquareRoot {

  static int squareRootFloor(int x) {
    int low = 1;
    int high = x;
    int ans = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      int msqr = mid * mid;
      if (msqr == x)
        return mid;
      else if (msqr > x)
        high = mid - 1;
      else if (msqr < x) {
        ans = mid;
        low = mid + 1;
      }

    }
    return ans;
  }

  public static void main(String[] args) {
    int x = 64;
    System.out.println(squareRootFloor(x));
  }
}
