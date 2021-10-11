import java.util.Arrays;

public class FractionalKnapsack {

  static double fractionalKnapsack(Item arr[], int W) {
    double res = 0.0;
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].weight <= W) {
        W -= arr[i].weight;
        res += arr[i].value;
      } else {
        res += arr[i].value * ((double) W / arr[i].weight);
        break;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Item arr[] = { new Item(10, 60), new Item(40, 40), new Item(20, 100), new Item(30, 120) };

    int n = 4, W = 50;

    System.out.println(fractionalKnapsack(arr, W));

  }

}

class Item implements Comparable<Item> {
  int value, weight;

  Item(int w, int v) {
    value = v;
    weight = w;
  }

  public int compareTo(Item i) {
    return weight * i.value - value * i.weight;
  }
}
