public class MinimumCoinsToMakeAValue {

  static int minCoins(int[] coins, int value) {
    int n = coins.length;
    int[] dp = new int[value + 1];
    dp[0] = 0;
    for (int i = 1; i <= value; i++)
      dp[i] = Integer.MAX_VALUE;

    for (int i = 1; i <= value; i++) {
      for (int j = 0; j < n; j++) {
        int subres = Integer.MAX_VALUE;
        if (coins[j] <= i)
          subres = dp[i - coins[j]];
        if (subres != Integer.MAX_VALUE)
          dp[i] = Math.min(dp[i], subres + 1);
      }
    }
    return dp[value];
  }

  public static void main(String[] args) {
    int arr[] = { 3, 4, 1 }, val = 5, n = 3;

    System.out.println(minCoins(arr, val));
  }
}
