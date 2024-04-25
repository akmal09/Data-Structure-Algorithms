package HashTable;

public class NodeHt<k, v> {
    KeyValuePair<k, v> keyValuePair;
    public NodeHt next;

    public NodeHt(KeyValuePair<k, v> pairNode){
        this.keyValuePair = pairNode;
        this.next = null;
    }
}
