package DataStructure.LinkedList;

public class RunALinkedList {
    public static void run(){
        LinkedList list = new LinkedList();

        list.insertAtBeginning(2);
        list.printList();
        list.insertAtBeginning(3);
        list.printList();
        list.insertAtBeginning(10);
        list.printList();

        System.out.println("tes");
        list.insertAfter(3,5);
        list.printList();

        list.insertAfter(5,7);
        list.printList();

        list.insertAtEnd(212);
        list.printList();

        list.insertAtEnd(33);
        list.printList();

        list.removeCurrentHead();
        list.printList();

        list.removeCurrentHead();
        list.printList();

        list.removeNode(2);
        list.printList();

        list.removeNode(212);
        list.printList();

        list.removeTail();
        list.printList();

        list.removeTail();
        list.printList();
    }
}
