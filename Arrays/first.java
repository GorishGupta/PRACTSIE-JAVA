package Arrays;
import java.util.*;
public class first {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] = new int[11];
    int a=-1;
    for(int i=1;i<arr.length;i++){
    arr[i]=n*i;
    System.out.println( n +" X "+ i +" = "+arr[i]);
    if(arr[i]==10){
        a=i;
    }
    }
    if(a==-1){
        System.out.println("value not found ");
    }
    else{
    System.out.println("Found value 10 at index : " + a);   
    }
    }   
}
