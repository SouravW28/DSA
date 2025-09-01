import java.util.*;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        int x=list.size();
        for(int i=0 ;i<x ;i++){
            System.out.print(list.get(i));
        }
    }
}
