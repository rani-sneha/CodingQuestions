#include<bits/stdc++.h>
using namespace std;

int main()
{
	char ch=cin.get();

	if((int)ch==32)
		cout<<"The character is space"<<endl;
	if((int)ch>47 && (int)ch<58)
		cout<<"The character is a number"<<endl;
	if((int)ch>64 && (int)ch<91)
		cout<<"The character is a Upper Case letter"<<endl;
	if((int)ch>96 && (int)ch<123)
		cout<<"The character is a Lower Case letter"<<endl;
	if((int)ch>32 && (int)ch<47 || (int)ch>57 && (int)ch<65 || (int)ch>90 && (int)ch<97 || (int)ch>122 && (int)ch<127)

		cout<<"The character is a Symbol"<<endl;

}