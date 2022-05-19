//how to print prime numbers?
// Using brute force
#include<bits/stdc++.h>
using namespace std;
int main()
{
	cout<<"Enter a number n"<<endl;
	int n, count =0;
	bool flag=false;
	cin>>n;
	int a[n];
	int i=3;
	while(count<n)
	{
		for(int j=2; j<=sqrt(i); j++)
		{
			if(i%j==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			a[count]=i;
			count++;
		}
		flag=false;
		i++;
	}
	for(int i=0; i<n; i++)
		cout<<a[i]<<" ";
	cout<<endl;
	return 0;
}