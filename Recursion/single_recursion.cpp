#include<bits/stdc++.h>
using namespace std;

//Print name N times
void rec1(string s, int n){
if(n==0)
return;
cout<<s<<"\n";
return rec1(s, n-1);
}
//Print from N to 1
//Method 1
void rec2(int n){
if(n==0)
return;
cout<<n<<"\n";
return rec2(n-1);
}
//Methid 2
void rec4(int i, int n){
    if(i<n)
    return;
    cout<<i<<"\n";
    return rec4(i-1, n);
}
//Print from 1 to N
//Method 1

void rec3(int i, int n){
if(i>n)
return;
cout<<i<<"\n";
return rec3(i+1, n);
}

//Method 2
void rec5(int n)
{
   if(n==0)
   return;
   rec5(n-1);
   cout<<n<<"\n";
}

//Sum of first N numbers
int recsumN(int n){
    if(n==0)
    return 0 ;
    return n+recsumN(n-1);

}
//Multiplication of first N numbers
int fact(int n){
    if(n<=1)
    return 1;
    return n*fact(n-1);
}

//Reverse an array

void revarray1(int l, int r, int a[])
{
    if(l>=r)
    return;
    swap(a[l], a[r]);
    revarray1(l+1, r-1, a);
}

void revarray2(int i, int n, int a[])
{
    if(i>=n/2)
    return;
    swap(a[i], a[n-i-1]);
    revarray2(i+1, n, a);
}

//Is it a Palindrome Array?
bool ispalindrome(int i, int n, int a[])
{
    if(i>=n/2)
    return true;
    return a[i]==a[n-i-1]?ispalindrome(i+1, n, a):false;
}
int main()
{
    string s="Sneha";
    int n=5;
    rec1(s, n);
    rec2(n);
    rec3(1, n);
    rec4(n,1);
    rec5(n);
    cout<<recsumN(n)<<"\n";
    cout<<fact(n)<<"\n";
    int arr[5]={2,4,3,7,1};
    revarray1(0,n-1,arr);
    revarray2(0,n,arr);
    for(int i =0; i<n; i++)
        cout<<arr[i]<<"\n";
    cout<<ispalindrome(0,n,arr)<<"\n";
    return 0;
}
