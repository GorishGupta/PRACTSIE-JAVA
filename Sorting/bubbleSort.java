package Sorting;
import java.util.*;
public class bubbleSort {
    public static void bubble(int arr[]){
        int len = arr.length;
        for(int i=1;i<=len;i++){
            for(int j=0;j<len-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 8,1,5,4,7,2,3};
    bubble(arr);
    
    
    }
    
}
