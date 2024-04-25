package HashTable;

import java.nio.file.Path;

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
//        column[index].insertData();
    }

    private int hash(K key){
        return Math.abs(key.hashCode())%capacity;
    }
}
