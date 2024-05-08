package SortingAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    int[] arrDef = {2,5,3,4};
    public List<Integer> sort(List<Integer> listData){
        if(listData.size()==1){
            return listData;
        }

        int p = (0+(listData.size()-1))/2;
        int l = 0;
        int r = listData.size()-1;

        while(l<=r){
            while (listData.get(l)<listData.get(p)){
                l++;
            }
            while (listData.get(r)>listData.get(p)){
                r--;
            }
            if(l<=r){
                listData.remove(l);
                listData.add(l, listData.get(r));

                listData.remove(r);
                listData.add(r, listData.get(l));
            }
        }

        List<Integer> leftArray = sort(listData.subList(0,p));
        List<Integer> rightArray = sort(listData.subList(p, listData.size()));


        return merge(leftArray, rightArray);
    }

    private List<Integer> merge(List<Integer> leftArray, List<Integer> rightArray){
        List<Integer> array = new ArrayList<>();

        for(Integer value:leftArray){
            array.add(value);
        }

        for (Integer value: rightArray){
            array.add(value);
        }

        return array;
    }
}