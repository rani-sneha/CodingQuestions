#include<bits/stdc++.h>
using namespace std;

int main()
{
	int n;
	cin>>n;
	string s="";
	while(n>0)
	{
		cout<<(n%10);
		n/=10;
	}
	cout<<endl;
}