#include<stdio.h>
void main()
{	int val=1;		
	printf("Enter units value\n");
	int u;
	scanf("%d",&u);

	if(u>0)
	{
		if(u> 0 && u<101)
		{
			val=u*10;
		}
		if(u> 100 && u<201)
		{
			val=1000+(u-100)*15;
		}
		if(u>200 && u<301)
		{
			val=2500+(u-200)*20;
		}
		else
		{
			val=4500+(u-300)*25;
			printf("The value is : %d",val);
		}
	}
	
	
}