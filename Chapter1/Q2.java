import java.util.*;
class Q2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		Q2 ob=new Q2();
		ob.reverse(a, 0, n-1);
		ob.reverse(a, 0, k-1);
		ob.reverse(a, k, n-1);
		for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
	}

    public int[] reverse(int a[], int start, int end)
    {
    	int temp;
    	for(int i=start, j=end; i<j; i++, j--)
    	{
    			temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    	}
    	return a;
   
    }
}
