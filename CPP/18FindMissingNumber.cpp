#include<bits/stdc++.h>
using namespace std;


 int main()
{
	cout<<"Enter the array length and then array"<<endl;
	int n;
	cin>>n;
	int arr[n];
	int b[n+2]={0};
	
	for(int i=0; i<n; i++)
	{
		cin>>arr[i];
		b[arr[i]]=1;
	}
	for(int i=1; i<n+2; i++)
		if(b[i]==0)
		{
			cout<<"The missing number is "<<i<<endl;
			break;
		}
	return 0;
}