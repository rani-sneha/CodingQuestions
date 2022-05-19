#include<bits/stdc++.h>
using namespace std;
int main()
{
	cout<<"Enter the number 1 and number 2 you want to find gcd of: "<<endl;
	int a, b, rem=-1;
	cin>>a>>b;
	if(a>b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
	}
	while(rem!=0)
	{
		rem=b%a;
		b=a;
		a=rem;
	}
	cout<<"GCD of above numbers is "<<b<<endl;
}