import java.util.*;
public class lastdigit 
{ 
    
    static int power(long x, long y, long p) 
    { 
        long res = 1; // Initialize result 
       
        x = x % p; 
        
        while (y > 0) { 
       
             
            if ((y & 1) != 0) 
                res = (res * x) % p; 
	y = y >> 1; // y = y/2 
            x = (x * x) % p; 
        } 
        return (int) res; 
    } 
       
   
    static void printLastKDigits(int a, int b, int k) 
    { 
        System.out.print("Last " + k + " digits of " + a + "^"  +  b + " = "); 
           
        
        int temp = 1; 
        for (int i = 1; i <= k; i++) 
            temp *= 10; 
       
        
        temp = power(a, b, temp); 
       
       
        for (int i = 0; i < k - Integer.toString(temp).length() ; i++) 
            System.out.print(0); 
       
     
        if (temp != 0) 
            System.out.print(temp); 
    } 
      
    
    public static void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
	
        int a =sc.nextInt(); 
        int b =sc.nextInt(); 
        int k = 1; 
        printLastKDigits(a, b, k); 
    } 
} 