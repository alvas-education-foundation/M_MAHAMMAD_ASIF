 include<stdio.h>


int min(int x, int y, int z) {            
   if(x < y) {
      if(x < z)
         return x;
      else
         return z;
   }else {
      if(y < z)
         return y;
      else
         return z;
   }
}

int getUglyNum(int n) {
   int uglyNum[n];          
   int i2 = 0, i3 = 0, i5 = 0;

   

   int next2mul = 2;
   int next3mul = 3;
   int next5mul = 5;
   int next = 1;              

   uglyNum[0] = 1;

   for (int i=1; i<n; i++) {
      next = min(next2mul, next3mul, next5mul);       
      uglyNum[i] = next;

      if (next == next2mul) {
         i2++;           
         next2mul = uglyNum[i2]*2;
      }

      if (next == next3mul) {
         i3++;             
         next3mul = uglyNum[i3]*3;
      }

      if (next == next5mul) {
         i5++;              
         next5mul = uglyNum[i5]*5;
      }
   }
   return next;        

int main() {
   int n;
  printf( "Enter number "); scanf("%d",&n);
   printf("%dth Ugly number is: %d",n,getUglyNum(n));
}