#include<bits/stdc++.h>
using namespace std;
int bin2dec(int n){
	int p=1, i=0, sum=0;
	while(n>0)
	{
		if((n%10)==1)
			sum=sum+ p;
		i++;
		n/=10;
		p*=2;
    }
    return sum;
}
int main()
{
	cout<<"Enter the binary number in form of 0s and 1s"<<endl;
		int n;
	cin>>n;
	cout<<"The Decimal Output of "<<n <<" binary number is "<<bin2dec(n);
	return 0;
}
