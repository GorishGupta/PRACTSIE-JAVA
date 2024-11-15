public class shortestPath {
    public static float displacement(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            switch (str.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                case 'S':
                    y--;
                    break;
                
                default:
                x--;
                    break;
            }/*
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else //(str.charAt(i)=='W')
            {
                x--;
            }*/
        }
        int x2= x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "NNEESSNEWSWNESEWNSNWEENSNEW";
        System.out.println(displacement(str));
    }
    
}
