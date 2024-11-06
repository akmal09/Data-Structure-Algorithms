package SortingAlgorithm;

public class BubbleSort {
    private int[] arrayDefault = {5,4,3,1,2};
    public void sortArrayAscending(){
        System.out.println("before sorted = "+printArray(arrayDefault));
        for(int i=0; i<arrayDefault.length; i++){
            System.out.println("Looping untuk index "+Integer.toString(i)+" mulai");
            System.out.println("value= "+Integer.toString(arrayDefault[i])+"->"+printArray(arrayDefault));
            boolean swapped = false;
//            konsep looping j ini adalah nilai i semakin besar dan batas nilai j semakin kecil
            System.out.println("Batas j->"+Integer.toString(arrayDefault.length-1-i));
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
        for(int i=0; i<arrayDefault.length; i++){
            System.out.println("Looping untuk index "+Integer.toString(i)+" mulai");
            System.out.println("value= "+Integer.toString(arrayDefault[i])+"->"+printArray(arrayDefault));
            boolean swap = false;
            System.out.println("Batas j->"+Integer.toString(arrayDefault.length-1-i));
            for(int j=0; j<arrayDefault.length-1-i; j++){
                if(arrayDefault[j]<arrayDefault[j+1]){
                    int temp = arrayDefault[j+1];
                    arrayDefault[j+1] = arrayDefault[j];
                    arrayDefault[j] = temp;
                    swap = true;
                    System.out.println(printArray(arrayDefault));
                }
            }
            System.out.println("Looping untuk index "+Integer.toString(i)+" selesai"+"\n");
            if(!swap){
                break;
            }
        }
        System.out.println("array descending sorting ->"+printArray(arrayDefault));
    }

    private String printArray(int[] arrayData){
        String array = "";
        for(int i=0; i<arrayData.length; i++){
            array = i!=arrayData.length-1 ? array+Integer.toString(arrayData[i])+", ": array+Integer.toString(arrayData[i]);
        }
        return "["+array+"]";
    }

    public void trySort(){
        System.out.println("before sort"+printArray(arrayDefault));
        boolean swap;
        do {
            swap = false;
            for(int i=0; i<arrayDefault.length; i++){
                if(i != arrayDefault.length-1){
                    if(arrayDefault[i]>arrayDefault[i+1]){
                        int temp = arrayDefault[i];
                        arrayDefault[i] = arrayDefault[i+1];
                        arrayDefault[i+1] = temp;
                        swap = true;
                    }
                }
            }
        }while (swap);
        System.out.println("after sort"+printArray(arrayDefault));
    }
}
