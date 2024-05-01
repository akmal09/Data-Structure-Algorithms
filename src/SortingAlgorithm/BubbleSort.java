package SortingAlgorithm;

public class BubbleSort {
    private int[] arrayDefault = {5,4,3,2,1};
    public void sortArrayAscending(){
        System.out.println("before sorted = "+printArray(arrayDefault));
        for(int i=0; i<arrayDefault.length; i++){
            System.out.println("Looping untuk index "+Integer.toString(i)+" mulai");
            System.out.println("value= "+Integer.toString(arrayDefault[i])+"->"+printArray(arrayDefault));
            boolean swapped = false;
//            konsep looping j ini adalah nilai i semakin besar dan batas nilai j semakin kecil
            for(int j=0; j<arrayDefault.length-1-i; j++){
                if(arrayDefault[j]>arrayDefault[j+1]){
                    int temp = arrayDefault[j];
                    arrayDefault[j] = arrayDefault[j+1];
                    arrayDefault[j+1] = temp;
                    swapped = true;
                    System.out.println(printArray(arrayDefault));
                }
            }
            System.out.println("Looping untuk index "+Integer.toString(i)+" selesai"+"\n");
            if(!swapped){
                break;
            }
        }
        System.out.println("after sorted = "+printArray(arrayDefault));
    }

    public void sortArrayDescending(){
        
    }

    private String printArray(int[] arrayData){
        String array = "";
        for(int i=0; i<arrayData.length; i++){
            array = i!=arrayData.length-1 ? array+Integer.toString(arrayData[i])+", ": array+Integer.toString(arrayData[i]);
        }
        return "["+array+"]";
    }
}
