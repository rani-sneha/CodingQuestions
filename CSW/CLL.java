public class CLL 
{
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node tail;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(tail==null)
        {
            tail=newNode;
            newNode.next=tail;
            return;
        }
        newNode.next=tail;
        tail.next=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(tail==null)
        {
            tail=newNode;
            newNode.next=tail;
            return;
        }
        newNode.next=tail.next;
        tail.next=newNode;
    }
    public void print()
    {
        if(tail==null)
        {
            System.out.println("null");
            return;
        }
        Node curr=tail;
        do
        {
            System.out.print(curr.data+" --> ");
            curr=curr.next;
        }while(tail!=curr);
    }
    public static void main(String[] args) {
        CLL ob=new CLL();
        ob.addLast(3);
        ob.addLast(4);
        ob.addLast(5);
        ob.addLast(6);
        ob.addLast(8);
        ob.addLast(2);
        ob.print();
    }
}