#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n, fact=1;
	cout<<"Enter the no you want to get factorial of: "<<endl;
	cin>>n;
	for(int i=1; i<=n; i++)
		fact*=i;
	cout<<"Factorial of the given number is "<<fact<<endl;
	return 0;
}