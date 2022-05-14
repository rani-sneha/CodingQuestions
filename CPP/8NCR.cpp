#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n, r;
	double mult=1;
	cout<<"Enter the N and R respectively"<<endl;
	cin>>n>>r;
	for(int i=r; i>0; i--)
	{
		mult*=(double)n/i;
		n--;
	}
	cout<<"The NCR is : "<<mult<<endl;
	return 0;
}