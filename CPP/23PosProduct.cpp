#include <bits/stdc++.h>
using namespace std;
int main()
{
	int n, m, c=0;
	cin>>n>>m; 
	int a[n][m];
	for(int i=0; i<n; i++)
		for(int j=0; j<n; j++)
		{
			cin>>a[i][j];
			if(a[i][j]<0)
				c++;
			if(a[i][j]==0)
			{
				c=2;
				break;
			}
		}
		if(c%2)
			cout<<0<<endl;
		else
			cout<<1<<endl;

}