package SortingAlgorithm;

import java.util.HashSet;
import java.util.Set;

public class SelectionSort {
    private int[] arrayDefault = {10,29,14,37,15};

    public void start(){
        System.out.println("before sorted = "+printArray(arrayDefault));
        for(int i=0; i<arrayDefault.length; i++){
            boolean swap = false;
            int current = arrayDefault[i];
            int swapIndex = i;
            for(int j=i+1; j<arrayDefault.length; j++){
                if(current > arrayDefault[j]){
                    current = arrayDefault[j];
                    swapIndex = j;
                    swap = true;
                }
            }
            if(swap){
                int temp = arrayDefault[i];
                arrayDefault[i] = arrayDefault[swapIndex];
                arrayDefault[swapIndex] = temp;
            }
        }

        System.out.println("after sorted = "+printArray(arrayDefault));
    }

    private String printArray(int[] arrayData){
        String array = "";
        for(int i=0; i<arrayData.length; i++){
            array = i!=arrayData.length-1 ? array+Integer.toString(arrayData[i])+", ": array+Integer.toString(arrayData[i]);
        }
        return "["+array+"]";
    }
}
