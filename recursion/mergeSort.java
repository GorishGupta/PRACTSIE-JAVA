package recursion;
public class mergeSort {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int arr[], int si, int ei){
        int mid = (si + ei ) / 2;
        merge(arr, si, mid);
        merge(arr, mid+1, ei);
        sortMerge(arr, si, mid, ei);

    }

    public static void sortMerge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j= mid +1;
        int k=0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[j];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,6,5,2,1,3,4};

    }
}
