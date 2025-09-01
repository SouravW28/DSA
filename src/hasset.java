import java.util.HashSet;
import java.util.Iterator;
public class hasset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(9);
        set.add(7);
        System.out.println(set);

        boolean a=set.contains(7);
        System.out.println(a);

        set.remove(9);
        System.out.println(set);

        int b=set.size();
        System.out.println(b);

        Iterator it=set.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());

        }

    }

}
