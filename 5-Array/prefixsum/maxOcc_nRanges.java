package prefixsum;

public class maxOcc_nRanges {

  static int maxOcc(int l[], int r[], int n) {
    int[] arr = new int[1000];
    int i;
    int res = 0;
    for (i = 0; i < n; i++) {
      arr[l[i]]++;
      arr[r[i] + 1]--;
    }
    int maxm = arr[0];
    for (i = 1; i < 1000; i++) {
      arr[i] += arr[i - 1];
      if (maxm < arr[i]) {
        maxm = arr[i];
        res = i;
      }
    }
    return arr[res];
  }

  public static void main(String[] args) {
    int L[] = { 1, 2, 3 }, R[] = { 3, 5, 7 }, n = 3;
    System.out.println(maxOcc(L, R, n));
  }

}
