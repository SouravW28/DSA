import java.util.*;

public class DLL {
    private DoublyNode head;
    private DoublyNode tail;

    private static class DoublyNode {
        int data;
        DoublyNode prev;
        DoublyNode next;

        DoublyNode(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public void addfirst(int data){
        DoublyNode newnode=new DoublyNode(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }

    }

    public void print(){
        if(head==null){
            System.out.println("LIST ID EMPTY");
            return;
        }
        DoublyNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<=>");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public void addlast(int data){
        DoublyNode newnode=new DoublyNode(data);
        if(tail==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }

    public void deletefirst(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        if(head.next==null){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }

    public void deletelast(){
        DoublyNode temp=tail;
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        if(head.next==null){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.addfirst(1);
        list.addfirst(2);
        list.addlast(0);
        list.deletelast();
        list.deletefirst();
        list.print();
    }
}
