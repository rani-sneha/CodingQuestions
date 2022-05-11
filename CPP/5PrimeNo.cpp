#include<bits/stdc++.h>
using namespace std;

int main()
{
	int n;
	bool flag=1;
	cout<<"Enter a Number to check if it is a prime number or not"<<endl;
	cin>>n;
	for(int i=2; i<n; i++)
	{
		if(n%i==0)
		{
			cout<<"The no. "<<n<<" is a prime number"<<endl;
			flag=0;
			break;
		}
	}
		if(flag)
		cout<<"The no. "<<n<<" is not a prime number"<<endl;
}