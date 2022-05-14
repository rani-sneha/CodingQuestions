#include<bits/stdc++.h>
using namespace std;
int factorial(int n)
{
	int fact=1;
	for(int i=1; i<=n; i++)
		fact*=i;
	return fact;
}
int NCR(int n , int r){
	return factorial(n)/(factorial(n-r)*factorial(r));
}
int main()
{
	int n, r;
	cin>>n>>r;
	cout<<"NCR is: "<<NCR(n, r);
	return 0;
}
