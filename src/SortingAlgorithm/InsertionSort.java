package SortingAlgorithm;

public class InsertionSort {
    int[] arr = {1,2,3,4,5};

    public void sortAscending(){

        System.out.println(printArray(arr));
        for(int i=0; i<arr.length; i++){
            int key = i - 1;
            System.out.println("index ->"+Integer.toString(i));
            int tagIndex = i;
            if(key>=0){
                for(int j=key; j>=0; j--){
                    if(arr[tagIndex]<arr[j]){
                        int temp = arr[tagIndex];
                        arr[tagIndex] = arr[j];
                        arr[j] = temp;
//                        System.out.println(printArray(arr));
                        tagIndex = j;
                    }else{
                        tagIndex = i;
                    }
                }
            }
            System.out.println();
        }

        System.out.println(printArray(arr));
    }

    public void sortDescending(){
        System.out.println(printArray(arr));
        for(int i=0; i<arr.length; i++){
            int key = i - 1;
            System.out.println("index ->"+Integer.toString(i));
            int tagIndex = i;
            if(key>=0){
                for(int j=key; j>=0; j--){
                    if(arr[tagIndex]>arr[j]){
                        int temp = arr[tagIndex];
                        arr[tagIndex] = arr[j];
                        arr[j] = temp;
//                        System.out.println(printArray(arr));
                        tagIndex = j;
                    }else{
                        tagIndex = i;
                    }
                }
            }
            System.out.println();
        }

        System.out.println(printArray(arr));
    }

    private String printArray(int[] arr) {
        String output = "";
        for (int num : arr) {
            output = output+" "+Integer.toString(num);
        }
        return output;
    }
}
