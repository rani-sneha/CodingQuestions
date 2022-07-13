//print
public class StackLL
{
    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head=null;
    int size=0;
    Node top=head;
    public boolean isEmpty()
    {
        return(head==null);
    }
    public int size()
    {
        return size;
    }
    public void push(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty())
        {
            head=newNode;
            size=1;
            return;
        }
        Node curr=head;
        newNode.next=curr;
        head=newNode;
        size++;
    }
    public int pop()throws IllegalStateException
    {
        if(isEmpty())
        {
            throw new IllegalStateException("StackEmptyException");
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int peek()
    {
        if(isEmpty())
        {
        throw new IllegalStateException("Stack is Empty");
        }
        Node curr=head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        int val=curr.next.data;
        curr.next=null;
        return val;
    }
    public void print()
    {
        if(isEmpty())
        {
            System.out.println("No elements to print");
            return;
        }
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        StackLL s=new StackLL();
        s.push(1);
        s.push(2);
        s.push(3); 
        s.print(); 
        System.out.println();
        System.out.println(s.pop());
        System.out.println(s.pop()); 
        s.print();
    }

}

