#include<bits/stdc++.h>
using namespace std;

int main()
{
	int x=10;
	int *xptr=&x;
	int **xxptr=&xptr;
	cout<<x<<endl; //10
	cout<<*xptr<<endl; //10
	cout<<**xxptr<<endl; //10
	cout<<&x<<endl; //addx
	cout<<xptr<<endl; //addx
	cout<<*xxptr<<endl; //xptr value
	cout<<&xptr<<endl; //xptr add
	cout<<xxptr<<endl; //xptr add
	cout<<&xxptr<<endl; //xxptr add
	int *p=0;
	bool b=(bool)NULL;
	cout<<b;
	return 0;
}