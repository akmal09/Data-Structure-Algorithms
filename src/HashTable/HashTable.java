package HashTable;

public class HashTable<K, V> {
    public LinkedListHt<K, V>[] column;
    public int capacity;

    public HashTable(int capacity){
        this.capacity = capacity;
        this.column = new LinkedListHt[capacity];
        for(int i=0; i<capacity; i++){
            this.column[i] = new LinkedListHt();
        }
    }

    public void put(K key, V value){
        int index = hash(key);
        KeyValuePair keyValuePair = new KeyValuePair<>(key, value);
        NodeHt newNode = new NodeHt(keyValuePair);
        this.column[index].insertData(newNode);
    }

    public void printHashTable(){
        for(int i=0; i<this.capacity; i++){
            if(this.column[i].head == null){
                System.out.print("[]");
            }else{
                this.column[i].printLinkedList();
            }
            System.out.println();
        }
    }

    private int hash(K key){
        return Integer.parseInt(key.toString())%capacity;
    }
}
