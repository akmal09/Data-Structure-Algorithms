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
    }
}
