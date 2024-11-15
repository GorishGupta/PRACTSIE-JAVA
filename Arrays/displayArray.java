package Arrays;
import java.util.*;
public class displayArray {
    public static void printArray(int arr[],int x,int y){
        for(int k=x;k<=y;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void swapArray(int arr[],int i,int j){
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    //return arr;
    }
    public static void swaping(int arr[]){
        int i=0,j=arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        //printArray(arr);
        
    }
    public static void reverseArraysimple(int arr[],int x,int y){
        for(int i=y;i>=x;i--){
       System.out.print(arr[i]+" ");}
       System.out.println();
    }

    public static void reverseArray(int arr[],int x,int y){
        int temp[] = new int[arr.length];

        for(int i=x,i){

            //swapArray(arr, x, y);
    }
    printArray(arr, x ,y);
       
       System.out.println();
    }
    public static void sum(int arr[],int x,int y){
        int sum=0;
        for(int i=x;i<=y;i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    int arr[] = {12,45,78,98,23};
    int x=1;
    int y= 3;
    for(int i=x;i<=y;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   /* System.out.println();
    int temp[] = new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
       temp[i]=arr[i];
       System.out.print(temp[i]+" ");}
       System.out.println();
       */

       //swaping(arr);
       //int i=1, j=4;
      // sum(arr, x, y);
       reverseArray(arr, x, y);
     //  printArray(arr);
       
    
   // swapArray(arr, i, j);
    
   





}
}
