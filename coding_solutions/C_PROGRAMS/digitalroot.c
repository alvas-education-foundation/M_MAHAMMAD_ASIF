#include<stidio.h>
int main(){
int n,d,sum;
printf("\nPlease ENter an Unteger.");
scanf("%d",&n);
while(n!=0){
sum=0;
While(n!=0){
d=n%10;
sum=sum+d;
n=n/10;
}
if(sum>9){
n=sum;
sum=0;
}
}
printf("\nSO the digital root of the given number is %d",sum);
}