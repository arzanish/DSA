public class TwoStacksInArray {

  public static void main(String[] args) {
    TwoStacks ts = new TwoStacks(5);
    ts.push1(5);
    ts.push2(10);
    ts.push2(15);
    ts.push1(11);
    ts.push2(7);
    System.out.println("Popped element from stack1 is: " + ts.pop1());
    ts.push2(40);
    System.out.println("Popped element from stack2 is: " + ts.pop2());
  }
}

class TwoStacks {
  int cap;
  int top1;
  int top2;
  int arr[];

  TwoStacks(int c) {
    cap = c;
    arr = new int[c];
    top1 = -1;
    top2 = c;
  }

  void push1(int x) {
    if (top1 < top2 - 1) {
      arr[++top1] = x;
    } else {
      System.out.println("Overflow !!!");
      System.exit(1);
    }
  }

  void push2(int x) {
    if (top1 < top2 - 1) {
      arr[--top2] = x;
    } else {
      System.out.println("Overflow !!!");
      System.exit(1);
    }
  }

  int pop1() {
    if (top1 > -1) {
      return arr[top1--];
    } else {
      System.out.println("Stack Underflow");
      return -1;
    }
  }

  int pop2() {
    if (top2 < cap) {
      return arr[top2++];
    } else {
      System.out.println("Stack Underflow");
      return -1;
    }
  }
}