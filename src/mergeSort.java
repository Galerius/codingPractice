import java.util.Arrays;

public class mergeSort {


    public static void main(String[] args){
        int[] numberList = new int[]{3,2,1,3,5,67,8655,11,2};
        System.out.println(Arrays.toString(mergeSort(numberList)));
    }

    
    public static int[] mergeSort(int[] numberList) {
        System.out.println(Arrays.toString(numberList));
        if (numberList.length == 1){
            return numberList;
        }

        else {
            
            int middleIndex = (numberList.length - 1) / 2;    
            int[] array1 = new int[middleIndex + 1];
            int[] array2 = new int[numberList.length - middleIndex - 1];
            for (int i = 0; i < numberList.length; i++){
                if (i <= middleIndex){
                    array1[i] = numberList[i];
                }
                
                else {
                    array2[i - middleIndex - 1] = numberList[i];
                }
            }
            
            int[] sortedArray1 = mergeSort(array1);
            int[] sortedArray2 = mergeSort(array2);
            return mergeArrays(sortedArray1, sortedArray2);
    
        }   

    }    
    public static int[] mergeArrays(int[] a, int[] b){
        int[] mergedArray = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int mergeIndex = 0;
        while (aIndex < a.length || bIndex < b.length){
            if (aIndex == a.length){
                mergedArray[mergeIndex] = b[bIndex];
                bIndex++;
            }

            else if(bIndex == b.length){
                mergedArray[mergeIndex] = a[aIndex];
                aIndex++;
            }
            else if (a[aIndex] < b[bIndex]){
                mergedArray[mergeIndex] = a[aIndex];
                aIndex++;
                
            }
            else {
                mergedArray[mergeIndex] = b[bIndex];
                bIndex++;
            }
            mergeIndex++;
        }
        return mergedArray;
    }
}


