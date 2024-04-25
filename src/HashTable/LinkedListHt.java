package HashTable;

public class LinkedListHt<K, V> {
    private NodeHt head;

    public void insertData(NodeHt data){
        NodeHt node = this.head;
        while (node != null){
            if(node.next == null){
                node.next = data;
            }else{
                node = node.next;
            }
        }
    }
}
