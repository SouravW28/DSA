import java.util.HashMap;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(001,"sourav");
        map.put(002,"manthan");
        System.out.println(map);

        if(map.containsKey(001)){
            System.out.println("Key is present");
        }

        String a=map.get(001);
        System.out.println(a);

        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
    }
}
