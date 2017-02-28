import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args){
        int[] numList = new int[]{3,2,5,6,234,677,843,1,22,5,11};
        quicksort(numList,0,numList.length - 1);
        System.out.println(Arrays.toString(numList));
    }
    
    public static void quicksort(int[] numList, int firstIndex, int lastIndex){
        if (firstIndex < lastIndex){
            int partitionIndex = partition(numList, firstIndex, lastIndex);
            
            quicksort(numList, firstIndex, partitionIndex - 1);
            quicksort(numList, partitionIndex + 1, lastIndex);    
        }
        
    }
    
    public static int partition(int[] numList, int firstIndex, int lastIndex){
        //System.out.println(Arrays.toString(numList));
        //System.out.println(lastIndex);
        int pivot = numList[lastIndex];
        int i = firstIndex;
        //int j = lastIndex - 1;
        for(int k = firstIndex; k < lastIndex; k++){
            //System.out.println(k);
            if (numList[k] <= pivot) {
                int elementI = numList[i];
                int elementK = numList[k];
                numList[i] = elementK;
                numList[k] = elementI;
                i++;
            }
        }
        int elementI = numList[i];
        numList[i] = pivot;
        numList[lastIndex] = elementI;
        return i;
    }
}

