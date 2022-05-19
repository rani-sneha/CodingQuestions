#include<bits/stdc++.h>
using namespace std;
int main()
{
	cout<<"Enter the base and radix"<<endl;
	int a, r, mult=1;
	cin>>a>>r;
	int k=r;
	while(r--)
		mult*=a;
	cout<<a<<" to the power "<<k<<" is "<<mult<<endl;
}