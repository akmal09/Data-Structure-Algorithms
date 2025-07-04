import DataStructure.HashTable.HashTable;
import DataStructure.LinkedList.RunALinkedList;
import DataStructure.Queue.Queue;
import DataStructure.Stack.Stack;
import SearchAlgorithm.BinarySearch;
import SortingAlgorithm.*;
import TreeDataStructure.BinaryTree;
import TreeDataStructure.Dijkstra.GraphDijkstra;
import TreeDataStructure.Graph.Graph;
import TreeDataStructure.Graph.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args)throws Exception {

//        System.out.println(Double.valueOf(null));
//        int[][] matrix = {
//                {5, 7, 1},
//                {4, 8, 2},
//                {3, 9, 0}
//        };
//
//        int[][] mod = reverseArray(matrix);
//
//        System.out.println(printArray(mod));

//        linkedList();
//        stack();
//        queue();
//        hashTable();
//        selectionSort();
//        bubbleSort();
//        insertionSort();
//        mergeSort();
//        quickSort();
//        binarySearch();
    //    binaryTree();
//        graph();
//        dijkstra();
        LeetCodeHackerRank start = new LeetCodeHackerRank();
        start.main();
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
//        bubbleSort.sortArrayDescending();
        bubbleSort.trySort();
    }

    public static void insertionSort(){
        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.sortAscending();
        insertionSort.sortDescending();
    }

    public static void quickSort(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(3);
        integerList.add(1);
        integerList.add(4);

        MergeSort mergeSort = new MergeSort();
        System.out.println("before sorted->"+printArray(integerList));

        System.out.println("after sorted->"+mergeSort.sort(integerList));

    }
    public static void mergeSort(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(1);
        integerList.add(4);

        QuickSort quickSort = new QuickSort();
        System.out.println("before sorted->"+printArray(integerList));

        System.out.println("after sorted->"+quickSort.sort(integerList));
    }

    private static void binarySearch(){
        BinarySearch binarySearch = new BinarySearch();
        int findValue = 1;
        System.out.println("this is the array ->"+printArray(binarySearch.array));
        System.out.println("find "+Integer.toString(findValue)+" !!");
        System.out.println(binarySearch.search(findValue, 0, binarySearch.array.length));
    }

    private static String printArray(List<Integer> arr) {
        String output = "";
        for (Integer num : arr) {
            output = output+" "+Integer.toString(num);
        }
        return output;
    }

    private static void binaryTree()throws Exception{
        BinaryTree binaryTree = new BinaryTree(64);
        binaryTree.insertTree(51, binaryTree.root);
        binaryTree.insertTree(89, binaryTree.root);
        binaryTree.insertTree(20, binaryTree.root);
        binaryTree.insertTree(62, binaryTree.root);
        binaryTree.insertTree(63, binaryTree.root);
        binaryTree.insertTree(58, binaryTree.root);
        binaryTree.insertTree(77, binaryTree.root);
        binaryTree.insertTree(92, binaryTree.root);
        binaryTree.insertTree(95, binaryTree.root);

        System.out.print("inorder traversal ->[");
        binaryTree.inorderTraversalTree(binaryTree.root);
        System.out.println("]");

        System.out.print("preorder traversal ->[");
        binaryTree.preorderTraversal(binaryTree.root);
        System.out.println("]");

        System.out.print("postorder traversal ->[");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("]");

        System.out.println();

        // binaryTree.root = binaryTree.deleteNodeGpt(51, binaryTree.root);
        binaryTree.root = binaryTree.deleteNode(51, binaryTree.root);
        System.out.print("inorder traversal after delete ->[");
        binaryTree.inorderTraversalTree(binaryTree.root);
        System.out.println("]");
    }


    private static void graph(){

        Graph graph = new Graph();
        System.out.println("UNDIRECTED GRAPH:");
        graph.runUndirectedGraph();

        System.out.println();
        System.out.println();

        System.out.println("DIRECTED GRAPH");
        graph.runDirectedGraph();

        System.out.println();
        System.out.println();
        System.out.println("Depth First Search Traversal:");
        graph.nodeInitiationAndChooseRoot();
        Node choosedNode = graph.chooseNodeStarter("a");

        graph.runDfs(choosedNode);
        System.out.println();
        System.out.println();

        System.out.println("Breadth First Search Traversal:");
        graph.runBfs(choosedNode);
        System.out.println();
    }

    private static void dijkstra(){
        GraphDijkstra graphDijkstra = new GraphDijkstra(4);
//        graphDijkstra.addEdge(0, 1, 2);
//        graphDijkstra.addEdge(0, 3, 1);
//        graphDijkstra.addEdge(1, 2, 3);
//        graphDijkstra.addEdge(1, 3, 2);
//        graphDijkstra.addEdge(1, 4, 1);
//        graphDijkstra.addEdge(2, 4, 5);
//        graphDijkstra.addEdge(3, 4, 3);


        graphDijkstra.addEdge(0, 1, 1);
        graphDijkstra.addEdge(0, 2, 4);
        graphDijkstra.addEdge(1, 2, 3);
        graphDijkstra.addEdge(1, 3, 2);
        graphDijkstra.addEdge(1, 0, 1);
        graphDijkstra.addEdge(2, 0, 4);
        graphDijkstra.addEdge(2, 1, 3);
        graphDijkstra.addEdge(2, 3, 2);
        graphDijkstra.addEdge(3, 1, 2);
        graphDijkstra.addEdge(3, 2, 2);
//        graphDijkstra.printGraph();
//        graphDijkstra.dijkstra(0);

        System.out.println();
        graphDijkstra.dijkstraByMe(0);
        System.out.println("tes");
    }

    private static int[][] reverseArray(int[][] matrix){
        int row = matrix[0].length;
        int column = matrix.length;
        int[][] revArr = new int[row][column];


        int rowNew = 0;
        for(int i=0; i<matrix[0].length; i++){
            int colNew = 0;
            for(int j=matrix.length-1; j>-1; j--){
                revArr[rowNew][colNew] = matrix[j][i];
                colNew++;
            }
            rowNew++;
        }

        return revArr;
    }

    private static String printArray(int[][] arr) {
        String output="";
        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                output = output+Integer.toString(arr[i][j])+" ";
            }
            output = output + "\n";
        }
        return output;
    }

    private static void selectionSort(){
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.start();
    }

    private static String printArray(int[] arr) {
        String output = "";
        for (int i=0; i<arr.length; i++) {
            output = output+" "+Integer.toString(arr[i]);
        }
        return output;
    }
}