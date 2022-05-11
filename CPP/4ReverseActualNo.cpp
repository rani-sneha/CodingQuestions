#include<bits/stdc++.h>
using namespace std;

int main()
{
	int n,no=0;
	cin>>n;
	while(n>0)
	{
		no=no*10+(n%10);
		n/=10;
	}
	cout<<no<<endl;
}