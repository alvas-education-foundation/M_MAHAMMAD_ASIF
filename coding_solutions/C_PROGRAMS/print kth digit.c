#include<stdio.h>
void main()
{	int p=1,a,b,k;
	scanf("%d%d%d",&a,&b,&k);
	for(int i=1;i<=b;i++)
	{
		p*=a;
	}
	
	int count = 0; 
        while (p > 0 && count < k) 
	{ 
        int rem = p % 10; 
        count++; 
         if (count == k) 
        printf("%d",rem); 
  
        p = p / 10; 
        } 
  
   
}