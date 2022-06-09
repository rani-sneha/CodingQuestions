#include<bits/stdc++.h>
using namespace std;

int main()
{
	int n, mx=-99999999, mn=999999999;
	cin>>n;
	int a[n];
	for(int i=0; i<n; i++)
	{
		cin>>a[i];
		mx=max(mx, a[i]);
		mn=min(mn, a[i]);
	}
	cout<<"Max = "<<mx<<endl;
	cout<<"Min = "<<mn<<endl;

}