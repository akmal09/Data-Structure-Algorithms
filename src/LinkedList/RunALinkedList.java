package LinkedList;

public class RunALinkedList {
    public static void run(){
        LinkedList list = new LinkedList();

        list.insertAtBeginning(2);
        list.printList();
        list.insertAtBeginning(3);
        list.printList();
        list.insertAtBeginning(10);
        list.printList();

        System.out.println("out lala");
        list.insertAfter(3,5);
        list.printList();

        list.insertAfter(5,7);
        list.printList();

        list.insertAtEnd(212);
        list.printList();

        list.insertAtEnd(33);
        list.printList();
    }
}
