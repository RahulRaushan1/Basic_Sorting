package A10_BasicSorting;

public class A7_InsertionSort {
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;
    }
    public static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int []arr = {10,-4,20,7,-6,8};
        int n = arr.length;
        print(arr);
        // Insertion Sort 1
//        for(int i=1;i<n;i++){ // n-1 passes
//            for(int j=i;j>=1;j--){
//                if(arr[j]<arr[j-1])
//                    swap(arr,j,j-1);
//                else break;
//            }
//        }

        // Insertion Sort 2
//        for(int i=1;i<n;i++){
//            int j=i;
//            while(j>=1 && arr[j]<arr[j-1]){
//                swap(arr,j,j-1);
//                j--;
//            }
//        }

        // Insertion Sort 3
        for(int i=1;i<n;i++){
            for(int j=i;j>=1 && arr[j]<arr[j-1];j--){
                swap(arr,j,j-1);
            }
        }
        System.out.println();
        print(arr);
        }
    }

