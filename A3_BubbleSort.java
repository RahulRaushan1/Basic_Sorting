package A10_BasicSorting;

public class A3_BubbleSort {
    public static void print(int[] arr){
        for(int ele : arr)
            System.out.print(ele+" ");

    }
    public static void main(String[] args) {
        int []arr = {3,1,2,5,4};
        int n = arr.length;
        print(arr);
        //BubbleSort 1
//        for(int j=1;j<=n-1;j++){ // n-1 passes
//        for(int i=0;i<n-1;i++){
//            if(arr[i]>arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//
//        }}
        //BubbleSort 2

//        for(int j=0;j<n-1;j++){ // n-1 passes
//            for(int i=0;i<n-1-j;i++){
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//
//            }}
        //Optimised BubbleSort
        for(int j=0;j<n-1;j++){ // n-1 passes
            for(int i=0;i<n-1-j;i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            // check if this pass has sorted or not
            boolean flag = true;
            for(int i=0;i<n-1;i++){
                    if (arr[i] > arr[i + 1]) {
                        flag = false;
                        break;
                    }
                }
            if(flag==true) break;


            }

        System.out.println();
        print(arr);

    }
}
