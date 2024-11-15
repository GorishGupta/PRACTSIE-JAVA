package recursion;

public class practise {
    static int[][] Board;

    // display
    static void display(int [][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.println(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    // recursive Code
    static boolean nQueen(int [][] Board, int i, int n){
       if(i==n){
        //display when we go out  the board row
        display(Board);
        System.out.println();
        return true;
       }

       for(int j=0;j<n;j++){

       }
       
       
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        Board = new int [n][n];
        nQueen(Board, 0,n);
        
    }
    
}
