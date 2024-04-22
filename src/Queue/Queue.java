package Queue;

public class Queue {
    public Node front;
    public Node rear;

    p

    public void enueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }
}
