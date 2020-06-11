import java.util.*;
class SegregateOddEven
{ 
    static void segregateEvenOdd(int arr[]) 
    { 
        
        int left = 0, right = arr.length - 1; 
        while (left < right) 
        { 
            
            while (arr[left]%2 == 0 && left < right) 
                left++; 
  

            while (arr[right]%2 == 1 && left < right) 
                right--; 
  
            if (left < right) 
            { 
                int temp = arr[left]; 
                arr[left] = arr[right]; 
                arr[right] = temp; 
                left++; 
                right--; 
            } 
        } 
    } 
  
    
    public static void main (String[] args) 
    { Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array:");	
	int n=sc.nextInt();
        int arr[] =new int [n];
	System.out.println("Enter array elements:");
  	for(int i=0;i<n;i++)
	{arr[i]=sc.nextInt();
	}
        segregateEvenOdd(arr); 
  
        System.out.print("Array after segregation "); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i]+" "); 
    } 
} 