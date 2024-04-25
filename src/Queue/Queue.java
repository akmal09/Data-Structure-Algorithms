package Queue;

public class Queue {
    public Node front;
    public Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue(){

        if(front == rear){
            front = rear = null;
        }else{
            front = front.next;
        }
    }

    public void printQueue(Node node){
        if(node != null){
            System.out.print(node.data+" ");
            printQueue(node.next);
        }else{
            System.out.print("");
        }
    }
}
