package LinkedList;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }
    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node node = head;
        Integer i = 0;
        while(node != null){
            if(i.equals(0)){
                System.out.print("["+node.val + "]->");
            }else{
                if(node.next != null) {
                    System.out.print(node.val + "->");
                }else{
                    System.out.print(node.val);
                }
            }
            node = node.next;
            i++;
        }
        System.out.println();
    }
}
