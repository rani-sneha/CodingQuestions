#include<bits/stdc++.h>
using namespace std;
int main()
{
	cout<<"Enter a decimal number to convert into binary"<<endl;
	int n, ans=0, tp=1;
	cin>>n;
	while(n>0)
	{
		ans=(n%2*tp)+ans;
		n/=2;
		tp*=10;
	}
	cout<<"It's Binary equivalent is "<<ans<<endl;
	return 0;
}