import java.util.*;
class FindSmallestInteger  
{ 
   
    int findSmallest(int arr[], int n)  
    { 
        int res = 1; 
  
       
        for (int i = 0; i < n && arr[i] <= res; i++) 
            res = res + arr[i]; 
  
        return res; 
    } 
  
   
    public static void main(String[] args)  
    { 
        FindSmallestInteger small = new FindSmallestInteger(); 
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter the array size:");
            int n1 =sc.nextInt();
            int arr1[]=new int[n1];
             System.out.println("Enter array elements:");
                for(int i=0;i<n1;i++)
                {
                        arr1[i]=sc.nextInt();
                }
        
        System.out.println(small.findSmallest(arr1, n1)); 
  
        
    } 
} 
 