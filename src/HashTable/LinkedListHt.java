package HashTable;

import LinkedList.Node;

public class LinkedListHt<K, V> {
    public NodeHt head;

    public void insertData(NodeHt data){
        NodeHt node = this.head;
        if(this.head == null){
            this.head = data;
        }else{
            while (node != null){
                if(node.next == null){
                    node.next = data;
                    break;
                }else{
                    node = node.next;
                }
            }
        }
    }

    public void printLinkedList(){
        NodeHt node = head;
        int i=0;
        while(node != null){
            if(i == 0){
                System.out.print("["+printNodeData(node.data)+"]");
                if(node.next != null){
                    System.out.print("->");
                }
                i++;
            }else{
                System.out.print(node.next!=null?printNodeData(node.data)+"->":printNodeData(node.data));
            }
            node = node.next;
        }
    }

    private String printNodeData(KeyValuePair node){
        return node.getKey().toString()+"||"+node.getValue().toString();
    }
}
