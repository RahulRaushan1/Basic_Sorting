package A10_BasicSorting;

public class A4_OptimisedBubbleSort {
    public static void main(String[] args) {
        int []arr ={2,4,1,8,5};
        int n = arr.length;
        for(int x =0; x<n-1;x++){
            boolean flag = true;
            for(int i =0;i <n-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag)break;
        }
        for(int ele : arr)
            System.out.print(ele+" ");
    }
}
