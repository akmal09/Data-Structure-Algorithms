import DataStructure.HashTable.HashTable;
import DataStructure.LinkedList.RunALinkedList;
import DataStructure.Queue.Queue;
import DataStructure.Stack.Stack;
import SortingAlgorithm.BubbleSort;
import SortingAlgorithm.InsertionSort;
import SortingAlgorithm.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        linkedList();
//        stack();
//        queue();
//        hashTable();
//        bubbleSort();
//        insertionSort();
        mergeSort();
    }

    public static void linkedList(){
        RunALinkedList runALinkedList = new RunALinkedList();
        runALinkedList.run();
    }

    public static void stack(){
        Stack stack = new Stack();
        stack.push(2);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.printStack();
        System.out.println();
        stack.pop();
        stack.pop();
        System.out.println("AFTER POPPING");
        stack.printStack();
        System.out.println();
    }

    public static void queue(){
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.printQueue(queue.front);
        System.out.println();

        queue.enqueue(3);
        queue.printQueue(queue.front);
        System.out.println();

        queue.enqueue(2);
        queue.printQueue(queue.front);
        System.out.println();

        queue.enqueue(1);
        queue.printQueue(queue.front);
        System.out.println();

        queue.dequeue();
        queue.printQueue(queue.front);
        System.out.println();

        queue.dequeue();
        queue.printQueue(queue.front);
        System.out.println();

        queue.dequeue();
        queue.printQueue(queue.front);
        System.out.println();
    }

    public static void hashTable(){
        int capacity = 10;
        HashTable<Object, Object> hashTable = new HashTable<>(capacity);

        hashTable.put(60, "John");
        hashTable.put(20, "Lala");
        hashTable.put(10, "Lina");
        hashTable.put(30, "kita");
        hashTable.put(20, "aluca");
        hashTable.put(62, "eko");
        hashTable.put(12, "ika");
        hashTable.put(83, "deo");
        hashTable.put(83, "ara");
        hashTable.put(74, "ina");
        hashTable.put(64, "ida");
        hashTable.put(25, "eki");
        hashTable.put(65, "iva");
        hashTable.put(56, "ali");
        hashTable.put(78, "ivan");
        hashTable.put(48, "lea");
        hashTable.put(38, "agus");
        hashTable.put(38, "ira");
        hashTable.put(59, "eri");
        hashTable.put(89, "dani");
        hashTable.printHashTable();

        System.out.println();
        System.out.println(hashTable.searchData(89, "dani"));
        System.out.println(hashTable.searchData(50, "ika"));


        System.out.println();
        hashTable.removeData(89, "dani");
        hashTable.removeData(48, "lea");
        hashTable.removeData(62, "eko");
        hashTable.removeData(12, "ika");

        hashTable.printHashTable();

    }

    public static void bubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sortArrayAscending();
        bubbleSort.sortArrayDescending();
    }

    public static void insertionSort(){
        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.sortAscending();
        insertionSort.sortDescending();
    }

    public static void mergeSort(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(8);
        integerList.add(5);
        integerList.add(1);
        integerList.add(4);
        integerList.add(2);

        MergeSort mergeSort = new MergeSort();
        System.out.println("before sorted->"+printArray(integerList));

        System.out.println("after sorted->"+mergeSort.sort(integerList));

    }

    private static String printArray(List<Integer> arr) {
        String output = "";
        for (Integer num : arr) {
            output = output+" "+Integer.toString(num);
        }
        return output;
    }
}