import java.util.*;
public class LL1 {
    Node head;
    private int size;

    LL1(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }


    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }

    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }

    public void printlist(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.println("NUll");
    }

    public void deletefirst(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        head=head.next;
        size--;
    }

    public void deletelast(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        size--;
        if(head.next==null){
            head=null;
            return;

        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            secondlast=secondlast.next;
            lastnode=lastnode.next;
        }
        secondlast.next=null;

    }

    public int getsize(){
        return size;
    }

    public static void main(String[] args) {
        LL1 list=new LL1();
        list.addfirst("is");
        list.addfirst("This");
        list.addlast("a");
        list.addlast("Linked");
        list.printlist();
        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();
        int a=list.getsize();
        System.out.println(a);

    }
}
