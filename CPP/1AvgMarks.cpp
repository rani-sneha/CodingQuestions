#include<bits/stdc++.h>
using namespace std;

int main()
{
	cout<<"Input your Marks of Physics Chemistry and Mathematics respectively"<<endl;
	float Phy, Chem, Math;
	cin>>Phy>>Chem>>Math;
	float avg= (Phy+ Chem + Math)/3;
	cout<<"Your average marks = "<<avg<<endl;
return 0;
}