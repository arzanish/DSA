public class MaxLengthEvenOddSubArr {
  public static int maxLengthEvenOddSubArr(int[] arr, int n) {
    int flag;
    int count = 1;
    int i = 0;
    if (arr[0] % 2 == 0) {
      flag = 1;
      while (flag == 1 || flag == 0 && i < n) {

        i++;
        if (arr[i] % 2 == 0)
          flag++;
        else
          flag--;
        if (flag == 0 || flag == 1)
          count++;

      }
    } else {
      flag = -1;
      while (flag == 1 || flag == 0 && i < n) {
        i++;
        if (arr[i] % 2 == 0)
          flag++;
        else
          flag--;
        if (flag == 0 || flag == 1)
          count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 12, 14, 7, 8 };
    System.out.print(maxLengthEvenOddSubArr(arr, arr.length));

  }
}
