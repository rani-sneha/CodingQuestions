#include<bits/stdc++.h>
using namespace std;
// void print(int *arr, int n)
// {
// 	for(int i=0; i<n; i++)
// 		cout<<arr[i]<<" ";
// 	cout<<endl;
// }
void printRange(int *arr, int i, int j)
{
	for(int k=i; k<=j; k++)
		cout<<arr[k]<<", ";
	cout<<endl;
}
void printSubarray(int *arr, int n)
{
	for(int i=0; i<n; i++)
	
		for(int j=i; j<n; j++)
			//cout<<"Print Subarray : "<<i<<", "<<j<<endl;
			printRange(arr, i, j);
}
 int main()
{
	int n;
	cin>>n;
	
	int arr[n];
	for(int i=0; i<n; i++)
		cin>>arr[i];
	printSubarray(arr, n);
	return 0;
}