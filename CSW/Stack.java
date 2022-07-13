public class Stack
{
    int capacity=1000;
    int[] data;
    int top=-1;
    public Stack()
    {
        data=new int[capacity];
    }
    public Stack(int size)
    {
        data=new int[size];
        capacity=size;
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public int size()
    {
        return top+1;
    }
    public void print()
    {
        for(int i=top; i>-1; i--)
        {
        System.out.print(" "+data[i]+" ");
        }
    }
    public void push(int value)
    {
        if(size()==data.length)
        {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        data[top]=value;
    }
    public int pop()throws IllegalStateException 
    {
        if(isEmpty())
        {
            throw new IllegalStateException("StackEmptyException");
        }
        int tp=data[top];
        top--;
        return tp;
    }
    public int top()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("StackEmptyException");
        }
        return data[top];
    }
    public static void main(String[] args) 
    {
        Stack s = new Stack(); 
        s.push(1); 
        s.push(2);
        s.push(3);
        s.print();
        System.out.print(" "+s.pop()+" ");
        System.out.print(s.pop()); 
        s.print(); 
    }
}
