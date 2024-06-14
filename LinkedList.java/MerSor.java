public class MerSor{
    public static int rotatedsortedsearch(int[] array , int target , int si ,int ei){
        // base case
          if(si>ei){
            return -1;
          }
        //   middle value 
          int mid=si+(ei-si)/2;
        if(array[mid]==target){
            return mid;
        }
        //   l1 line
        if(array[si]<=array[mid]){
        //   case a
        if(array[si]<=target&& target <=array[mid]){
            return rotatedsortedsearch(array, target, si, mid-1);
        }
        else{
            return rotatedsortedsearch(array, target, mid+1, ei);
        }
        }
        else{
            if(array[mid]<=target && target <=array[ei]){
                return rotatedsortedsearch(array, target, mid+1, ei);
            }
            else{
                return rotatedsortedsearch(array, target, si, mid-1);
            }
        }
    }
    public static void quickSort(int[] array,int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(array,si,ei);
        quickSort(array, si, pIdx-1);
        quickSort(array, pIdx+1, ei);
    }
    public static int partition(int[]array,int si,int ei){
        int pivot=array[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(array[j]<pivot){
                i++;
                // swap
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        array[ei]=array[i];
        array[i]=temp;
        return i;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
    public static void mergeSort(int[] array , int si , int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(array, si, mid);
        mergeSort(array, mid+1, ei);
        merge(array,si,mid,ei);
        
    }
    public static void merge(int[] array, int si,int mid,int ei){
        int[] temp=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(array[i]<array[j]){
                temp[k]=array[i];
                i++;
            }
            else{
                temp[k]=array[j];
                j++;
            }
            k++;
        }

        // leftover element
        while(i<=mid){
            temp[k]=array[i];
            i++;k++;
        }
        // rightover element
        while(j<=ei){
           temp[k]=array[j];
           j++;
           k++;
        }

        //  copy one element to another original array
        for(int K=0,I=si;K<temp.length;K++,I++){
            array[I]=temp[K];

        }
    }
    
    public static void main(String[] args) {
        int[] array={6,3,9,5,0,2,8};
        // int found=rotatedsortedsearch(array, 5, 0, array.length-1);
        // System.out.println(found);

        mergeSort(array,0,array.length-1);
        // quickSort(array, 0, array.length-1);
        printArray(array);
    }
}