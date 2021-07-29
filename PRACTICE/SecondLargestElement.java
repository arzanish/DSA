public class SecondLargestElement {

  static int secondLargestElement(int[] arr) {
    int Largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;
    int flag = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > Largest) {
        flag++;
        secondLargest = Largest;
        Largest = arr[i];
      } else if (arr[i] < Largest && arr[i] > secondLargest) {
        secondLargest = arr[i];
      }
    }
    if (flag == 0) {
      secondLargest = Largest;
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    // int[] arr = { 2, 9, 11, 4, 4, 7, 5 };
    int[] arr = { 2, 2, 2, 2 };
    System.out.print(secondLargestElement(arr));
  }
}
