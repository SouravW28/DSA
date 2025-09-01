public class LL {
    Node head;
    private int size;

    LL(){
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
    //addfirst
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }
    //addlast
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

    //Print
    public void printlist(){
        if(head==null){
            System.out.println("LIST IS EMPTY.");
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.println("NULL");

    }
    //deletefirst
    public void deletefirst(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        head=head.next;
        size--;
    }
    //deletelast
    public void deletelast(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        size--;

        if(head.next==null){
            head=null;
            return;
        }

        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }

    public int getsize(){
        return size;
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addfirst("a");
        list.printlist();

    }
}
