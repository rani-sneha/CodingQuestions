#include<bits/stdc++.h>
using namespace std;

int main()
{
	int n,k, m;
	cin>>k>>n; 
	int a[n];
	for(int i=0; i<n; i++)
	{
		cin>>a[i];
	}
	sort(a, a+n);
	cout<<"Kth smallest number is "<<a[k-1]<<endl;
	if(n%2!=0)
		m=a[n/2];
	else
		m=(a[(n/2)-1]+a[(n)/2])/2;
	cout<<"Median : "<<m<<endl;

}