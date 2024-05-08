package SortingAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public List<Integer> sort(List<Integer> arrayData){
        if(arrayData.size() == 1){
            return arrayData;
        }

        int pivot = arrayData.size()/2;

        List<Integer> arrayLeft = splitArrayLeft(arrayData, pivot);
        List<Integer> arrayRight = splitArrayRight(arrayData, pivot);

        List<Integer> splitLeft = sort(arrayLeft);
        List<Integer> splitRight = sort(arrayRight);

        System.out.println();

        System.out.println(printArray(splitLeft)+" ||| "+printArray(splitRight));
        return merge(splitLeft, splitRight);

    }

    private List<Integer> merge(List<Integer> arrayLeft, List<Integer> arrayRight){
        List<Integer> sortedArray = new ArrayList<>();
        while (!arrayLeft.isEmpty() && !arrayRight.isEmpty()){
            if(arrayLeft.get(0)>arrayRight.get(0)){
                sortedArray.add(arrayRight.get(0));
                arrayRight.remove(0);
            }else{
                sortedArray.add(arrayLeft.get(0));
                arrayLeft.remove(0);
            }
        }

        while(!arrayLeft.isEmpty()){
            sortedArray.add(arrayLeft.get(0));
            arrayLeft.remove(0);
        }

        while(!arrayRight.isEmpty()){
            sortedArray.add(arrayRight.get(0));
            arrayRight.remove(0);
        }

        return sortedArray;
    }

    public List<Integer> splitArrayLeft(List<Integer> arrayList, int pivot){
        List<Integer> splittedArray = new ArrayList<>();
        for(int i=0; i<pivot; i++){
            splittedArray.add(arrayList.get(i));
        }
        return splittedArray;
    }

    public List<Integer> splitArrayRight(List<Integer> arrayList, int pivot){
        List<Integer> splittedArray = new ArrayList<>();
        for(int i=pivot; i<arrayList.size(); i++){
            splittedArray.add(arrayList.get(i));
        }
        return splittedArray;
    }

    private static String printArray(List<Integer> arr) {
        String output = "";
        for (Integer num : arr) {
            output = output+" "+Integer.toString(num);
        }
        return "["+output+"]";
    }
}
