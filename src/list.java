import java.util.ArrayList;
import java.util.Collections;
public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(1,4);
        System.out.println(list);

        list.set(1,0);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        int a=list.get(2);
        System.out.println(a);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        list.add(67);
        list.add(50);

        Collections.sort(list);
        System.out.println(list);
    }
}