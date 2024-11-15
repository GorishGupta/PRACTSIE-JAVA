public class presum {
    public static void presum(int arr[]){
        int n = arr.length;
        int presum[] = new int[n+1];
        for(int i=1;i<n+1;i++){
            presum[i] = arr[i-1] + presum[i-1];
        }
        for(int i=1;i<presum.length;i++){
            System.out.print(presum[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {};
        presum(arr);
        
    }
    
}
