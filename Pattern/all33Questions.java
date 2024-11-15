public class all33Questions {
    public static void value5(int n) {    
//ques1
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques2
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques3
        for(int i=1;i<=n;i++){

            for(int j=i;j<=n;j++){
                System.out.print(" * ");
            }
            
            System.out.println();
        }
//ques4
        for(int i=1;i<=n;i++){

            for(int j=i;j<=n;j++){
                System.out.print("   ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques5
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("   ");
            }

            for(int j=i;j<=n;j++){
                System.out.print(" * ");
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.println();

//ques6
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("    ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques7
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1|| j==1||i==n||j==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
    
            }
        System.out.println();
        System.out.println();
//ques8
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j == n+1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques9
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques10
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques11
        for(int i=1;i<=n;i++){
            
            for(int j=n;j>i;j--){
                System.out.print("   ");
            }
            for(int j=1 ;j<=(2*i-1);j++){
                if(j%2==0){
                System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques12
        for(int i=1;i<=n;i++){
            
            for(int j=n;j>i;j--){
                System.out.print("   ");
            }
            for(int j=1 ;j<=(2*i-1);j++){
                if(j%2==0){
                System.out.print(" ! ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();


        }
            System.out.println();
            System.out.println();
//ques13
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        

//ques14
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(int j=n;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques15

        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("      ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*  ");
            }
            
            System.out.println();
           }

           for(int i=n-1;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("      ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*  ");
            }
            
            System.out.println();
           }
           System.out.println();
           System.out.println();

//ques16
           for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("    ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*  ");
            }
            
            
            System.out.println();
           }
           for(int i=n-1;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print("    ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*  ");
            }
            
            
            System.out.println();
           }
           System.out.println();
            System.out.println();

}
        public static void value7(int n) {

//ques 17
        int n2 = (n/2)+1;
        for(int i=1;i<=n2;i++){

            // spaces
            for(int j=n2-i;j>=1;j--){
                
                System.out.print(" * ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("   ");
            }
            for(int j=n2-i;j>=1;j--){
                System.out.print(" * ");
            }

            
            System.out.println();
        }
        for(int i=n2-1;i>=1;i--){

            // spaces
            for(int j=n2-i;j>=1;j--){
                System.out.print(" * ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("   ");
            }
            for(int j=n2-i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//ques18
        
        for(int i=1;i<=n2;i++){
            for(int j=n2-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
            for(int i=n2-1;i>=1;i--){
            for(int j=n2-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//ques 19
        
        for(int i=1;i<=n2;i++){

            // spaces
            for(int j=n2-i;j>=1;j--){
                
                System.out.print(" * ");
            }
            for(int j=1;j<=2*i-2;j++){
                System.out.print("   ");
            }
            for(int j=n2-i;j>=1;j--){
                System.out.print(" * ");
            }

            
            System.out.println();
        }
        for(int i=n2-1;i>=1;i--){

            // spaces
            for(int j=n2-i;j>=1;j--){
                System.out.print(" * ");
            }
            for(int j=1;j<=(2*i-2);j++){
                System.out.print("   ");
            }
            for(int j=n2-i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


//ques20        
        int n1 =(n/2)+1;

        for(int i=1;i<=n1;i++){
            for(int j=n1;j>=i;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=n1;j++){
                if(i+j==5){
                    System.out.print(" * ");
                }
            }
            for(int j=1;j<=2*i-3;j++){
                System.out.print("   ");
            }
            
                if(i!=1 ){
                    System.out.print(" * ");
            }
            
            
            System.out.println();
        }
        for(int i=n1-1;i>=1;i--){
            for(int j=n1;j>=i;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=n1;j++){
                if(i+j==5){
                    System.out.print(" * ");
                }
            }
            for(int j=1;j<=2*i-3;j++){
                System.out.print("   ");
            }
            if(i!=1){
                System.out.print(" * ");
        }
            System.out.println();
        }
        System.out.println();
        System.out.println();
}

        public static void valueFive(int n) {
//ques21
             //uppre half
        for(int i=1;i<=n;i++){
            //right facing traingle
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            // spaces
            for(int j=2*(n-i)+1;j>1;j--){
                System.out.print("   ");
            }
            // left facing traingle
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//ques22
         //uppre half
         for(int i=n;i>=1;i--){
            //right facing traingle
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            // spaces
            for(int j=2*(n-i)+1;j>1;j--){
                System.out.print("   ");
            }
            // left facing traingle
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//ques23
             for(int i=1;i<=n;i++){

            // spaces
            for(int j=n-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" 1 ");
            }
            
            
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques24
        for(int i=1;i<=n;i++){

            // spaces
            for(int j=n-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+i+" ");
            }
            
            
            System.out.println();
        }
        System.out.println();
        System.out.println();

//ques 25
        int num = 1;
                for(int i=1;i<=n;i++){
           
            // spaces
            
            for(int j=i;j<n;j++){
                System.out.print("   ");
                            }
            for(int j=1;j<=2*i-1;j++){
                if(num<9){
                System.out.print(num+++"  ");
                }
                else{
            System.out.print(num+++" ");   
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();

//ques 26

        for(int i=1;i<=n;i++){
            // spaces
            for(int j=n-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=0;j<2*i-1;j++){
                if(i<=25){
                System.out.print(" "+(j+1)+" ");}
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
 //ques27
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques 28
        for(int i=1;i<=n;i++){
            //new
            int num1 = i;
            for(int j=i;j<n;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+num1+++" ");
    
            }
            //new
            num1 -= 2; 
            for(int j=1;j<=i-1;j++){
                System.out.print(" "+num1--+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
//ques 29
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=2;j<=2*i-2;j++){
                System.out.print("0");
            }
            if(i!=1){
            System.out.print(i);
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
//ques 30
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print(" "+j+" ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
//ques 31
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                if(j!=1){
                System.out.print(" "+j+" ");
                }
            }
            System.out.print(" * ");
            for(int j=i-1;j>=1;j--){
                System.out.print(" "+j+" ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
// ques 32
        for(int i=1;i<=n;i++){
            //int num = i;
            for(int j=1;j<=i;j++){
                System.out.print(" "+i+" ");
                if( j < i ){
                System.out.print(" * ");
                                   
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" "+i+" ");
                if(j < i ){
               System.out.print(" * ");
               }
            }
            System.out.println();
        }
System.out.println();
System.out.println();

}
public static void main(String[] args) {
    
    value5(5);
    value7(7);
    valueFive(5);

    int n = 10; 
    for (int i = 0; i < n; i++) {
        
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print("  ");
        }
        
       
        for (int j = n - i; j <= n-1; j++) {
            System.out.print(j + " ");
        }
        System.out.print("0 ");
        
       
        for (int j = n - 1; j >= n- i; j--) {
            System.out.print(j + " ");
        }
        
        System.out.println();
    }
    }
    
}
