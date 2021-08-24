package Queue_linkedList;

public class Test {
  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(10);
    q.enqueue(20);
    q.dequeue();
    q.dequeue();
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.dequeue();
    System.out.println("Queue Front : " + q.front.data);
    System.out.println("Queue Rear : " + q.rear.data);
  }
}

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Queue {
  Node front, rear;
  int size;

  public Queue() {
    this.front = this.rear = null;
    size = 0;
  }

  void enqueue(int data) {
    Node temp = new Node(data);
    size++;

    if (this.front == null) {
      this.front = this.rear = temp;
      return;
    }
    this.rear.next = temp;
    this.rear = temp;
  }

  void dequeue() {
    if (this.front == null)
      return;
    Node temp = this.front;
    size--;
    this.front = this.front.next;

    if (this.front == null)
      this.rear = null;

  }

  int getSize() {
    return size;
  }

}
