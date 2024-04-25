import LinkedList.RunALinkedList;
import Queue.Queue;
import Stack.Stack;

public class Main {
    public static void main(String[] args) {
//        linkedList();
//        stack();
        queue();
    }

    public static void linkedList(){
        RunALinkedList runALinkedList = new RunALinkedList();
        runALinkedList.run();
    }

    public static void stack(){
        Stack stack = new Stack();
        stack.push(2);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.printStack();
        System.out.println();
        stack.pop();
        stack.pop();
        System.out.println("AFTER POPPING");
        stack.printStack();
        System.out.println();
    }

    public static void queue(){
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.printQueue(queue.front);
        System.out.println();

        queue.enqueue(3);
        queue.printQueue(queue.front);
        System.out.println();

        queue.enqueue(2);
        queue.printQueue(queue.front);
        System.out.println();

        queue.enqueue(1);
        queue.printQueue(queue.front);
        System.out.println();

        queue.dequeue();
        queue.printQueue(queue.front);
        System.out.println();

        queue.dequeue();
        queue.printQueue(queue.front);
        System.out.println();

        queue.dequeue();
        queue.printQueue(queue.front);
        System.out.println();
    }
}