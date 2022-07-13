public class DLL
{
    class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
            this.data=data;
            prev=null;
            next=null;
        }
    }

    Node head;
    Node tail;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null && tail==null)
        {
            head=tail=newNode;
            return;
        }
        if(head==tail)
        {
            head=newNode;
            head.next=tail;
            tail.prev=head;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("No nodes available to print");
            return;
        }
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+ " --> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void printrev()
    {
        if(head==null)
        {
            System.out.println("No nodes available to print");
            return;
        }
        Node curr=tail;
        while(curr!=null)
        {
            System.out.print(curr.data+ " --> ");
            curr=curr.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DLL ob=new DLL();
        ob.addFirst(3);
        ob.addFirst(9);
        ob.addFirst(7);
        ob.addFirst(2);
        ob.addFirst(4);
        ob.addFirst(5);
        ob.print();
        ob.printrev();
    }
}
