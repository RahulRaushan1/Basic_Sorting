package A10_BasicSorting;

public class A1_CheckIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr ={1,8,3,4,7,9};
        int n = arr.length;
        boolean flag = true;
        for(int i =0 ; i<n-1 ;i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }


        }
        if(flag) System.out.println("sorted");
        else  System.out.println("unsorted");

    }
}
