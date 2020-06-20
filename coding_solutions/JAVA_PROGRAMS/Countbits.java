import java.util.*; 
  
class Countbits { 
      
    
    public static int countSetBits(int n) 
    { 
        int count = 0; 
        while (n != 0) { 
            count++; 
            n &=(n-1); 
        } 
        return count; 
    } 
  
    public static int FlippedCount(int a, int b) 
    { 
        
        return countSetBits(a ^ b); 
    } 
      
 
    public static void main(String[] args) 
    { Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values of A and B:");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        System.out.print(FlippedCount(a, b)); 
    } 
} 