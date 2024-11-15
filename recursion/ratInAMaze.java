package recursion;

public class ratInAMaze {
    static int sol[][] = new int[100][100];
    public static void display(int m, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean RIAM(char maze[][],int i,int j, int m, int n){
        if(i==n-1 && j==m-1){
            sol[i][j]=1;
            display(n, m);
            return true;
        }
        if(i<n && j<m && j>=0 && i>=0 && maze[i][j] != 'X' && sol[i][j]==0){
            sol[i][j]=1;
            //right
            RIAM(maze, i, j+1, m, n);
            //down
            RIAM(maze, i+1, j, m, n);
            //left
            RIAM(maze, i, j-1, m, n);
            //up
            RIAM(maze, i-1, j, m, n);
            //backtracking
            sol[i][j]=0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze = {
            {'0', '0', '0', '0', 'X'},
            {'0', 'X', 'X', '0', 'X'},
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };
        RIAM(maze, 0, 0, 5, 5);
        
    }
    
}
