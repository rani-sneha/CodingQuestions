#include<bits/stdc++.h>
using namespace std;
int main()
{
	cout<<"Enter the number you want to find the sum of digits of"<<endl;
	int n, sum=0;
	cin>>n;
	while(n>0)
	{
		sum+=n%10;
		n/=10;
	}
	cout<<"The sum of digits of number is "<<sum<<endl;
	return 0;
}