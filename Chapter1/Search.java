import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        Search ob =new Search();
        Arrays.sort(A);
        System.out.println(ob.BinarySearch(A, n, k));

    }
    public int BinarySearch(int A[], int n, int k){
        int low=0, high=n-1, mid;
        while(low!=high){
            mid= (low+high)/2;
            if(k==A[mid])
                return mid+1;
                else if(k<A[mid])
                    high=mid-1;
                    else if(k>A[mid])
                    low=mid+1;
        }
        return -1;
        
    }
    
}

