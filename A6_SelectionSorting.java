package A10_BasicSorting;

public class A6_SelectionSorting {

    public static void print(int []arr){
        for(int ele : arr)
            System.out.print(ele+" ");
    }
    public static void swap(int[]arr,int i,int mindx){
        int temp = arr[i];
        arr[i]= arr[mindx];
        arr[mindx] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        print(arr);
        // Selection Sort
        for(int i= 0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j =i;j<n;j++){
                if(arr[j]<min){
                    min= arr[j];
                    mindx = j;
                }
            }
           swap(arr,i,mindx);
        }
        System.out.println();
        print(arr);
    }
}
