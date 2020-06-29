#include<iostream.h>
void main()
{
	
	int a,b,*p,*q,sum=0;
	cout<<"Enter the values of a and b\n";
	cin>>a>>b;
	p= &a;
	q=&b;
	sum= *p + *q;
	cout<<"Sum of two numbers="<< sum;

}

