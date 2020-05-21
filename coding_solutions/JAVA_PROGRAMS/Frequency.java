import java.util.Scanner;

public class Frequency {
	
	    public static void main(String[] args) 
      {  
	        String str = "Hello friend";  
	        int c=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7= 0,c8=0,c9=0;  
          
	        for (int i=0; i<=str.length()-1; i++) 
          {  
	            if(str.charAt(i) == 'H') {  
	                c++; 
	            }  
	            if(str.charAt(i) == 'e') {  
	                c1++;  
	            }
	            if(str.charAt(i) == 'l') {  
	                c2++;  
	            }
	            if(str.charAt(i) == 'o') {  
	                c3++;  
	            }
	            if(str.charAt(i) == 'f') {  
	                c4++;  
	            }
	            if(str.charAt(i) == 'r') {  
	                c5++;  
	            }
	            if(str.charAt(i) == 'i') {  
	                c6++;  
	            }
	            if(str.charAt(i) == 'n') {  
	                c7++;  
	            }
	            if(str.charAt(i) == 'd') {  
	                c8++;  
	             }
	            if(str.charAt(i) ==' ') {  
	                c9++;  
	            }
	            
	        }  
	        System.out.println("Frequency of H is: "+c); 
	        System.out.println("Frequency of E is: "+c1); 
	        System.out.println("Frequency of L is: "+c2); 
	        System.out.println("Frequency of 0 is: "+c3); 
	        System.out.println("Frequency of F is: "+c4); 
	        System.out.println("Frequency of R is: "+c5); 
	        System.out.println("Frequency of I is: "+c6); 
	        System.out.println("Frequency of N is: "+c7); 
	        System.out.println("Frequency of D is: "+c8); 
	        System.out.println("Frequency of - is: "+c9); 
	}  
	  

}
