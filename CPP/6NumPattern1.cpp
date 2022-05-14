#include<bits/stdc++.h>
using namespace std;
 int main()
 {
 	/*     1
 	      232
 	     34543
 	    4567654
 	*/
 	int t, k;
 	cout<<"Enter a desired number"<<endl;
 	cin>>t;
 	for(int i=1; i<=t; i++)
 	{
 	    k=i;
 	    //cout<<"1"<<endl;
 		for (int sp=t-i+1; sp>0; sp--)
 			cout<<" ";
 		for(int j=1; j<=2*i-1; j++)
 			if(j<i)
 			 	cout<<k++;
 			
 			else 
 				cout<<k--;
 		cout<<endl;
 	}
 	return 0;
 }