public class interview {
    public static void main(String[] args) {
        int n=5;
        char c = 'A'- 1;
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<=i;j++){
                System.out.print("-");
            }
            for(int j=1;j<=n-i;j++){
                char ch = (char)(c+j);
                System.out.print(ch);
            }
            for(int j=1;j<=n-i-1;j++){
                char ch = (char)(c+j);
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            //spaces
            for(int j=0;j<i+1;j++){
                System.out.print("-");
            }
            for(int j=1;j<=n-i;j++){
                char ch = (char)(c+j);
                System.out.print(ch);
            }
            for(int j=1;j<=n-i;j++){
                char ch = (char)(c+j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
