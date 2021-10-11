import java.util.Arrays;

public class MinimumCoins {
  static int minCoins(int[] coins, int amount) {
    int numberOfCoins = 0;
    Arrays.sort(coins);
    for (int i = coins.length - 1; i >= 0; i--) {
      if (amount >= coins[i]) {
        int c = (int) Math.floor(amount / coins[i]);
        numberOfCoins += c;
        amount -= c * coins[i];
      }
      if (amount == 0)
        break;
    }
    return numberOfCoins;

  }

  public static void main(String[] args) {
    int[] coins = { 5, 10, 2, 1 };
    int amount = 51;
    System.out.println(minCoins(coins, amount) + " COINS");
  }
}
