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

    public void insertAfter(int prevNode, int val){
        Node node = head;
        while(node != null){
            if(node.val== prevNode){
                Node newNode = new Node(val);
                Node tempNode = node;
                newNode.next = node.next;
                tempNode.next = newNode;
                return;
            }else{
                node = node.next;
            }
        }

    }

    public void insertAtEnd(int val){
        Node node = head;
        while(node != null){
            if(node.next == null){
                Node newNode = new Node(val);
                node.next = newNode;
                return;
            }else{
                node = node.next;
            }
        }
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
