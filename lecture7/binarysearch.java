package lecture7;

public class binarysearch {
    public static boolean helper(int speed,int dist,int time){
         return dist <= speed * time;
        }
    public static int binary(int dist,int high,int time){
        int low = 0;
        int ans = 0;
        
        while(low < high){
            int mid =  high - (high -low)/2;
            if(helper(mid,dist,time)){
            ans = mid;
            high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
       
        int Maxspeed = 200, dist = 100, time = 3;
        System.out.println(binary(dist,Maxspeed,time));
        
        
    }
    
}
