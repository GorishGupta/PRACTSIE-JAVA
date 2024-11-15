package leacture03;

public class bubbleSort {
    public static void displayArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubble(int arr[]) {
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                while(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 

                }
                
            }
        }
        displayArray(arr);
    }
 public static void main(String[] args) {
    int[] arr= {2,4,5,7,3,1,9,6};
    bubble(arr);
 }   
}
