package HashTable;

public class NodeHt {
    KeyValuePair data;
    public NodeHt next;

    public NodeHt(KeyValuePair pairNode){
        this.data = pairNode;
        this.next = null;
    }
}
