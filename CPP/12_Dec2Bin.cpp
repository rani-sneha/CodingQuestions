#include<bits/stdc++.h>
using namespace std;
int main()
{
	cout<<"Enter a decimal number to convert into binary"<<endl;
	int n;
	string ans="";
	cin>>n;
	while(n>0)
	{
		ans=n%2==0?("0"+ans):("1"+ans);
		n/=2;
	}
	cout<<"It's Binary equivalent is "<<ans<<endl;
	return 0;
}