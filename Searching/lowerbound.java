package Searching;
public class lowerbound {
    public static int lowerbound(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid - 1; 
            }
            else if(arr[mid] < target){
                start  = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;

    } 
    static int upperBound(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                ans = mid+1;
                start  = mid + 1;
            }
            else if(arr[mid]<target){
                //ans = mid;
                start = mid + 1;
            }
            else{
                ans = mid;
                end= mid - 1;
            }
        }
        //System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {1,1,2,2,2,3,3,3,3,4};
        int target = 1;
       // lowerbound(arr, target);
        
        System.out.println(upperBound(arr, target));
    }
}
