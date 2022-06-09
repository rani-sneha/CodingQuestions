#include <bits/stdc++.h>
using namespace std;
int main()
{
	int n, m;
	cin>>n>>m; 
	int a[n][m];
	for(int i=0; i<n; i++)
		for(int j=0; j<n; j++)
			cin>>a[i][j];
	int j=0, c=1;
	for(int i=0; i<n; i++)
	{
		while(j>=0 && j<m)
		{
			cout<<a[j][i]<<" "; //1 3 5 7
			if(c%2)
				j++;
			else
				j--;
		}
		cout<<endl;
		c++;
		if(c%2)
			j++;
		else
			j--;
	}

}