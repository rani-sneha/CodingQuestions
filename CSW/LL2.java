class LL2
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
    static Node head;
    int size=0;
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        // Node curr=head;
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
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
public void insertSorted(int data)
{
    Node newNode=new Node(data);
    if(head==null || head.data>data)
    {
    newNode.next=head;
    head=newNode;
    size++;
        return;
    }
    Node curr=head;
    while(curr.next!=null && curr.next.data<data)
    {
        curr=curr.next;
    }
    newNode.next=curr.next;
    curr.next=newNode;
    size++;
}
public boolean search(int data)
{
    if(head==null)
    {
        return false;
    }
    Node curr=head;
    while(curr.next!=null)
    {
        if(curr.data==data)
        {
            return true;
        }
        curr=curr.next;
    }
    return false;
}
public void deleteFirst()
{
    if(head==null)
    {
        System.out.println("There is no node present to delete");
        return;
    }
    head=head.next;
    size--;
}
public void deleteLast()
{
    if(head==null)
    {
        System.out.println("No nodes present to delete");
        return;
    }
    if(head.next==null)
    {
        head.next=null;
        size--;
        return;
    }
    Node curr=head;
    while(curr.next.next!=null)
    {
        curr=curr.next;
    }
    size--;
    curr.next=null;
}
public void deleteAllOccurance(int data)
{
    if(head==null)
    {
        return;
    }
    Node curr=head;
    while(curr!=null && curr.data==data)
    {
        size--;
        head=curr.next;
        curr=head;
    }
    Node nex;
    while(curr.next!=null)
    {
        nex=curr.next;
        if(nex!=null && nex.data==data)
        {
            size--;
            curr.next=nex.next;
        }
        else
        {
            curr=curr.next;
        }
    }
}
public void deleteList()
{
    head=null;
    size=0;
}
public void reverse()
{
    if(head==null || head.next==null)
    {
        return;
    }
    if(head.next.next==null)
    {
        Node curr=head;
        curr=head.next;
        curr.next=head;
        head=curr;
        return;
    }
    Node curr=head;
    Node prev=null;
    Node nxt=null;
    while(curr!=null)
    {
        nxt=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nxt;
    }
    head=prev;
}
    public static void main(String[] args) 
    {
        LL2 ob=new LL2();
        ob.addLast(5);
        ob.addLast(2);
        ob.addLast(5);
        ob.addLast(1);
        ob.addLast(5);
        ob.addLast(8);
        ob.addLast(7);
        ob.addLast(6);
        ob.addLast(5);
        ob.addLast(5);
        ob.print();
        // ob.deleteAllOccurance(5);
        ob.print();
        System.out.println(ob.size);

        System.out.println(ob.search(72));
        ob.reverse();
        ob.print();
        System.out.println(ob.size);
    }
}

