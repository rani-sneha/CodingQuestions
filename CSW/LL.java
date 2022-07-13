public class LL
{
    private  int size;

    LL()
    {
        this.size=0;
    }
    class Node
    {
        private int value;
        Node next;
        Node(int value)
        {
            this.value=value;
            this.next=null;
            size++;
        }   
    }

    Node head;
            // Printing Node
    public void print(){
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.value +" --> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
            // Add node to first
    public void addFirst(int value)
    {
        Node curr=head;
        Node newNode=new Node(value);
        newNode.next=null;
        if(head==null)
        {
            head=newNode;
            return;
        } 
        head=newNode;
        newNode.next=curr;
    }
        // Add node to last
    public void addLast(int value)
    {
        Node newNode=new Node(value);
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
            head=newNode;
    }
    //Insert nodes in sorted order
    
    public void sortedInsert(int value)
    {
        Node newNode=new Node(value);
        Node curr=head;
        if(curr==null || curr.value>value)
        {
            newNode.next = head;
            head=newNode;
            return;
        }
        if(curr.next==null)
        {
            curr.next=newNode;
            return;
        }
        while(curr.next!=null && curr.next.value<value)
        {
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    
    //Delete Node from first
    public int deleteFirst()
    {
        if(head==null)
        {
            System.out.println("There is no node present.");
            return -1;
        }
        int value=head.value;
        head=head.next;
        size--;
        return value;
    }
    //Delete Last Node
    public int deleteLast()
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("There is no node present.");
            return -1;   
        }
        if(head.next==null)
        {
            int value=head.value;
            head=null;
            size--;
            return value;
        }
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        int value=curr.next.value;
        curr.next=null;
        size--;
        return value;
    }
    // Delete a perticular value from linked list
    public void deleteNode(int value)
    {
        Node curr=head;
        if(head==null)
        {
            return;
        }
        if (value == head.value) {
            head = head.next;
            size--;
                return;
            }
        while(curr.next!=null)
        {
            if(curr.next.value==value)
            {
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;
            size--;
        }
    }
    //Delete all the occurrence of particular value in linked list.
public void deleteNodes(int value)
{
    if(head==null)
    {
        return;
    }
    if(head.value==value)
    {
        head=head.next;
    }
    Node curr=head;
    while(curr.next!=null)
    {
        if(curr.next.value==value)
        {
            curr.next=curr.next.next;
            size--;
        }
        else
        {
            curr=curr.next;
        }
    }
}
//Delete a single linked list
public void deleteList()
{
    head=null;
    size=0;
}
    // Search a perticular value in list
    public boolean searchList(int value)
    {   
        Node curr=head;
        if(head==null){
            return false;
        }
        if(curr.value==value)
        {
            return true;
        }
        while(curr.next!=null)
        {
            if(curr.value==value)
            {
                return true;
            }
            curr=curr.next;
        }
        if(curr.next==null)
        {
            return true;
        }
        return false;
    }
    //Reversing a Linked List
    public void reverseList()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        // head.next=null;
        head=prev;
    }
    //Copy List
    public LL copyList()
    {
        Node curr=head;
        Node tn=null;
        Node tn2=null;
        while(curr!=null)
        {
            tn=new Node(curr.value);
            curr=curr.next;
            tn.next=tn2;
            tn2=tn;
        }
        LL lst3=new LL();
        lst3.head=tn;
        return lst3;
    }
    //Copy List Reversed
    public LL copyReverseList()
    {
        Node tn=null;
        Node tn2=null;
        Node curr=head;
        while(curr!=null)
        {
            tn2 =new Node(curr.value);
            curr=curr.next;
            tn2.next=tn;
            tn=tn2;
        }
        LL lst2=new LL();
        lst2.head=tn2;
        return lst2;
    }
    //Compare List 
    public static boolean compareList(LL lst, LL lst2)
    {
        return compareList(lst.head, lst2.head);
    }
    public static boolean compareList(Node h1, Node h2)
    {
        if(h1==null && h2==null)
        {
            return true;
        }
        if(h1==null || h2==null || h1.value!=h2.value)
        {
            return false;
        }
        return compareList(h1.next, h2.next);
    }
    public static void main(String[] args) 
    {
        LL lst=new LL();
        lst.addFirst(7);
        lst.addFirst(45);
        lst.addFirst(3);
        lst.addFirst(2);
        lst.addFirst(42);
        lst.addFirst(9);
        lst.addFirst(43);
        lst.addFirst(10);
        lst.addFirst(4);
        // System.out.println(lst.searchList(7));
        lst.print();
        // lst.deleteNodes(4);
        // System.out.println(lst.deleteFirst());
        // System.out.println(lst.deleteLast());
        lst.reverseList();
        lst.print();
        LL lst2=new LL();
        lst2=lst.copyReverseList();
        lst2.print();
        LL lst3=new LL();
        lst3=lst.copyList();
        lst3.print();
        System.out.println(lst2.size);
        //compareList(lst, lst3)
    }
}