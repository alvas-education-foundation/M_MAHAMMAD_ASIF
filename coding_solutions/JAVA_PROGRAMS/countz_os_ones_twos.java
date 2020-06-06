import java.util.*;
class countz_os_ones_twos{ 
  static void sort012(int a[], int arr_size) 
    { 
        int lo = 0; 
        int hi = arr_size - 1; 
        int mid = 0, temp = 0; 
        while (mid <= hi) { 
            switch (a[mid]) { 
            case 0: { 
                temp = a[lo]; 
                a[lo] = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        } 
    } 
  
    
    static void printArray(int arr[], int arr_size) 
    { 
        int i; 
        for (i = 0; i < arr_size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
  
  
    public static void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
         System.out.println("Enter array size");
	int n=sc.nextInt();
        int arr[]=new int[n];
	System.out.println("Enter sequence of 0s,1s,2s");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	} 
        sort012(arr, n); 
        System.out.println("Array after seggregation "); 
        printArray(arr, n); 
    } 
} 