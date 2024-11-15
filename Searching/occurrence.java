package Searching;
import java.util.Arrays;
public class occurrence {
    public static int binarySearch(int arr[],int target) {
    
    int start = 0;
    int end = arr.length - 1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]  <  target){
            start = mid + 1;
        }
        else{
            end = mid-1;
        }
        
    }
    return 0;
    }
    public static void main(String[] args) {
        
    
    int arr[] = {4,2,1,4,2,3,3,1,5};
    int num = 3;
    Arrays.sort(arr);    
    binarySearch(arr,num);
    }
}
