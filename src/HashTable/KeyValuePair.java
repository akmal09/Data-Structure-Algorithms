package HashTable;

public class KeyValuePair<k, v> {
    private k key;
    private v value;

    public KeyValuePair(k key, v value){
        this.key = key;
        this.value = value;
    }

    public k getKey(){
        return key;
    }

    public v getValue(){
        return value;
    }
}
