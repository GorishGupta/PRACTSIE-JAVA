package hashMap;
import java.util.*;
public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"G");
        map.put(2,"O");
        map.put(3,"R");
        map.put(4,"I");
        map.put(5,"S");
        map.put(6,"H");
        System.out.println(map);
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
        


    }
    
}
