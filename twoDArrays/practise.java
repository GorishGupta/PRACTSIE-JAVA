package twoDArrays;
import java.util.*;
public class practise {
    public static void displayMatrix(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean binarySearch(int arr[][], int target){
        int low = 0;
        int high = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                while(low<=high){
                    int mid = (low + high)/2;
                    if(arr[mid][j]==target){
                        return true;
                    }
                    else if(mid)
                }
            }
        }
        return false;
    }
    public static boolean linearSearch(int arr[][],int target){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==target){
                    System.out.println("("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void SortingMatrix(int arr1[][]){
        int m = arr1.length;
        int n = arr1[0].length;
        int arr[] = new int [m*n];
       // int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[(n*i)+(j)]= arr1[i][j]; 
                //count++;
            }
        }
       
       // count = 0;
        Arrays.sort(arr);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = arr[(n*i)+(j)]; 
                //count++;
            }
        }
       displayMatrix(arr1);
    }
    
    
    public static void sortedMatrix(int arr1[][],int col ){
    
       Arrays.sort(arr1,(a,b)->Integer.compare(a[col],b[col]));
        displayMatrix(arr1);

    }
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        int arr1[][] = {{1,22,3,14},
                        {15,6,57,8},
                        {91,110,11,2}};
       
        
        
        int num = 1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               arr[i][j] = arr[i].length*i+(j+1);
                //arr[i][j] = num++;
            }
        }
      // displayMatrix(arr);
       // sortedMatrix(arr1,3);
       SortingMatrix(arr1);
       System.out.println(binarySearch(arr1, 8));
       
       //System.out.println(linearSearch(arr1, 6));
    }
}
