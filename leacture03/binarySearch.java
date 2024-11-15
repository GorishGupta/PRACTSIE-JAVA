package leacture03;
import java.util.*;

public class binarySearch {
    public static int binary(int arr[] , int target){
    Arrays.sort(arr);
    int start = 0;
    int end = arr.length-1;
    while (start<=end){
    int mid = (start+end)/2;
    if(arr[mid]==target){
        return mid;
    }
    else if(arr[mid]>target){
        end = mid - 1;
    }
    else{
        start = mid+1;
    }}
    return -1;
    }
    public static void main(String[] args) {
        
    
    int arr [ ] = {9,8,7,6,5,4,3,2,1};
    int target = 3;
    System.out.println(binary(arr, target));
    
    }
}
