#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s="9451";
    int sum=0;
    for(int i=0; i<s.length(); i++)
    {
        sum=sum*10+(s[i]-'0');
    }
    cout<<sum+1<<endl;
    return 0;
}