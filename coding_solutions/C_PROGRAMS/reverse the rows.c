#include <stdio.h> 
#define M 3
#define N 3
void swap(int* , int* ); 
 
void main() 
{ 
   int arr[M][N];
   for (int i = 0; i < M; i++)
      { 
        for (int j = 0; j < N; j++) 
           { 
           scanf("%d",&arr[i][j]); 
           } 
       
      } 
    
    for (int i = 0; i < M; i++) 
    { 
        int start = 0; 
        int end = N - 1; 
  
        while (start < end)
       { 
        swap(&arr[i][start],&arr[i][end]); 
        start++; 
        end--; 
       } 
    } 
  
  for (int i = 0; i < M; i++)
      { 
        for (int j = 0; j < N; j++) 
           { 
            printf("%d\t",arr[i][j]); 
           } 
       printf("\n"); 
      }


}   

void swap(int* a, int* b) 
{ 
    int temp = *a; 
    *a = *b; 
    *b = temp; 
} 
  
 
