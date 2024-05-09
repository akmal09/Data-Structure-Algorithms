package SearchAlgorithm;

public class BinarySearch {

    public int[] array = {0,1,2,3,4,5,6,7,8};
    public String search(int target, int start, int end){
        if (start > end) {
            return "NOT FOUND";
        }
        int middle = (start+(end - start))/2;
        if(target == array[middle]){
            return Integer.toString(array[middle])+" at index "+Integer.toString(middle);
        }

        if(target > array[middle]){
            return search(target, middle+1, array.length);
        }

        return search(target, 0, middle-1);
    }
}
