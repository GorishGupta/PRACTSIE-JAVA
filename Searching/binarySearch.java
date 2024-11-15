package Searching;
import java.util.Arrays;

public class binarySearch {
    public static void displayArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,8,2,7,9,4,5};
        Arrays.sort(arr);
        displayArrays(arr);

    }
    
}
