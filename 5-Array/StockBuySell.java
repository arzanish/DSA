public class StockBuySell {

  public static int maxprofit(int[] price, int n) {
    int profit = 0;
    for (int i = 1; i < n; i++)
      if (price[i] > price[i - 1])
        profit += price[i] - price[i - 1];

    return profit;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 5, 3, 8, 12 };
    System.out.print(maxprofit(arr, arr.length));
  }
}
