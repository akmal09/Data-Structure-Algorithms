import LinkedList.RunALinkedList;
import Stack.Stack;

public class Main {
    public static void main(String[] args) {
//        linkedList();
        stack();
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
}