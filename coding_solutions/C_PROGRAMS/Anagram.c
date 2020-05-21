#include<stdio.h>
#include<string.h>
int main()
{
	char a[100],b[100];
	int p,q,i;					          //for finding lengths of each string
	int f=0;				          //flag veriable
	int ca[26],cb[26];		  	//for counting of each variable in each string

	printf("Enter two strings\n");
	scanf("%s%s",&a,&b);
	p=strlen(a);
	q=strlen(b);
	if(p==q)
	{
		for(i=0;i<26;i++)
		{
		ca[i]=cb[i]=0;				
		}
		for(i=0;i<p;i++)
		{
		ca[a[i]-97]++;
		cb[b[i]-97]++;
		}
		for(i=0;i<26;i++)
		{
			if(ca[i]!=cb[i])
			{
			f++;
			break;
			}
		}
		if(f==0)
		{
			printf("Two Strings Are anagram\n");
		}
		else
		{
			printf("Strings are not anagram\n");
		}


	}

	else
	{
		printf("Strings are not anagram\n");
	}
}
