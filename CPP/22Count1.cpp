#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n, c0=0, c1=0;
	cin>>n; 
	int a[n];
	for(int i=0; i<n; i++)
	{
		cin>>a[i];
		if(a[i]==1)
			c1++;
		if(a[i]==0)
			c0++;
	}
	
	cout<<"Count of Zeroes : "<<c0<<endl;
	cout<<"Count of Ones : "<<c1<<endl;

}