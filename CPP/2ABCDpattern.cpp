#include<bits/stdc++.h>
using namespace std;

int main()
{
	int N, t=65;
	cin>>N;
	string s="", srev="";
	for(int i=1; i<=N; i++)
	{
    	s+=(char)t;
    	srev=char(t)+srev;
    	t++;
	}
	cout<<(s+srev)<<endl;
	for(int i=1; i<=N; i++)
	{
		s=s.substr(0, s.size()-1);
		srev=srev.substr(1, srev.size());
		cout<<(s+srev)<<endl;
	}
	return 0;
}