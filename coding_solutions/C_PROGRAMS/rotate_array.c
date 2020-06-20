#include <stdio.h>    
     
int main()    
{    int n,i,arr[3];  
     printf("Enter elements of array: ");
    for(i=0; i<3; i++)
    {
        scanf("%d", &arr[i]);
    }     
     printf("Enter number of times to rotate: ");
   scanf("%d",&n); 
   
    int length = sizeof(arr)/sizeof(arr[0]);    
    printf("Original array: \n");    
    for (int i = 0; i < length; i++) {     
        printf("%d ", arr[i]);     
    }     
        
   for(int i = 0; i < n; i++){    
        int j, last;    
        
        last = arr[length-1];    
        
        for(j = length-1; j > 0; j--){    
            //Shift element of array by one    
            arr[j] = arr[j-1];    
        }    
       
        arr[0] = last;    
    }    
        
    printf("\n");    
        
    
    printf("Array after right rotation: \n");    
    for(int i = 0; i< length; i++){    
        printf("%d ", arr[i]);    
    }    
    return 0;    
}    