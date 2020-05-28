import java.util.*;
public class cntArr { 
  public static void cntArray(int A[], int N) 
    {  
        int result = 0; 
  
        for (int i = 0; i < N; i++) { 
            result++; 
            int current_value = A[i]; 
  
            for (int j = i + 1; j < N; j++) { 
  
                // Check if A[j] = A[i] 
                // increase result by 1 
                if (A[j] == current_value) { 
                    result++; 
                } 
            } 
        } 
  
       
        System.out.println(result); 
    } 
  
   
    public static void main(String[] args) 
    { 
         System.out.println("Enter the size of an array:");
	Scanner s=new Scanner(System.in);
	int N = s.nextInt(); 
	int arr[]=new int [N];
	System.out.println("Enter the Elements of an array:");
	for(int i=0;i<N;i++)
	{
		arr[i]=s.nextInt();
	}	
        cntArray(arr, N); 
    } 
} 