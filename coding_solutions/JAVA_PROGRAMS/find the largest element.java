import java.util.*; 
  
class find_the_largest_element{ 

static void findMaximumBefore(int arr[],int n){ 
       
    
    for (int i = 0; i < n; i++) { 
   
        int currAns = -1; 
            
       
        for (int j = i - 1; j >= 0; j--) { 
            if (arr[j] > currAns && 
                   arr[j] < arr[i]) { 
                currAns = arr[j]; 
            } 
        } 
        System.out.print(currAns+ " "); 
    } 
} 
   

public static void main(String[] args) 
{ 
    
	 System.out.println("Enter the size of an array:");
	Scanner s=new Scanner(System.in);
	int n = s.nextInt(); 
	int arr[]=new int [n];
	System.out.println("Enter the Elements of an array:");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}	
    	findMaximumBefore(arr, n); 
} 
} 
