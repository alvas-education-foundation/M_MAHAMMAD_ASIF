
#include<stdio.h>
void main()
{
char str[20];
int i,c1=0,c2=0,c3=0,c4=0;
printf("Enter a String");
scanf("%s",str);
for(i=0;str[i]!='\0';i++)
{
	if(str[i]>=65 && str[i]<=90)
		c1++;
	else if(str[i]>=97 && str[i]<=122)
		c2++;
	else if(str[i]>=48 && str[i]<=57)
		c3++;
	else
	c4++;
}
printf("\nUpper Case =%d",c1);
printf("\nLower Case =%d",c2);
printf("\nDigit =%d",c3);
printf("\nSpecial Symbol =%d",c4);
}
