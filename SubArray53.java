public class SubArray53 {
    public static int maxsum(int arr[]) {
        //using 3 for loops
        int maxsum = 0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int tempSum = 0;
                for(int k=i;k<=j;k++){
                    tempSum += arr[k];
                    maxsum = Math.max(maxsum, tempSum);
            }
        }
    }
    return maxsum;
}
public static int max2sum(int arr[]) {
    //using 2 for loops
    int maxsum = 0;
    int len = arr.length;
    for(int i=0;i<len;i++){
        int tempSum = 0;
        for(int j=i;j<len;j++){
            
                tempSum += arr[j];
                maxsum = Math.max(maxsum, tempSum);
        }
    }

return maxsum;
}

public static int kadane(int arr[]){
    int maxsum = 0;
    int sum = 0;
    int len = arr.length;
    for(int i=0;i<len;i++){
        sum  += arr[i];
        if(maxsum < sum){
            maxsum = sum;
        }
        if(sum < 0){
            sum = 0;
        }
    }
    return maxsum;
}
    public static void SubArray(int arr[]) {
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(k+" ");
                }
                System.out.println();               
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        //SubArray(arr);
        System.out.println(maxsum(arr));
        System.out.println(max2sum(arr));
        System.out.println(kadane(arr));
    }
    
}
