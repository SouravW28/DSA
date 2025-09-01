import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();

        //Add Element
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);

        //get element
        int i=list.get(1);
        System.out.println(i);

        //Add Element in betw.
        list.add(2,2);
        System.out.println(list);

        //Set Element
        list.set(0,5);
        System.out.println(list);

        //Delete Element
        list.remove(3);
        System.out.println(list);

        //Size
        int b=list.size();
        System.out.println(b);

        //Loops
        for(int x=0 ;x<list.size() ;x++){
            System.out.print(list.get(x)+" ");
        }
        System.out.println();

        //Sort
        Collections.sort(list);
        System.out.println(list);


    }


}
