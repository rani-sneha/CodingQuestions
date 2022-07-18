import java.util.*;
class MaxSubArray
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=new int[N+1];
		for(int i=0; i<N; i++)
			A[i]=sc.nextInt();
	    MaxSubArray ob =new MaxSubArray();
	    System.out.println(ob.maxSubArray(A, n));
	}
	int[] maxSubArray(int a[], int n)
	{
		int maxsofar=-1, maxendinghere=-1;
		for(int i=0; i<n; i++)
		{
			maxendinghere+=A[i];
			if(maxendinghere<0)
				maxendinghere=0;
			if(maxsofar<maxendinghere)
				maxsofar=maxendinghere;
		}
		a[n]=maxsofar;
		
	}
}