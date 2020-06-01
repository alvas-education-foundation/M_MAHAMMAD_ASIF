import java.util.*;
class DIST_btw_TL  
{ 
    
static double distance(int x1, int y1, int x2, int y2) 
{ 
    
    return Math.sqrt(Math.pow(x2 - x1, 2) +  
                Math.pow(y2 - y1, 2) * 1.0); 
} 
  
    public static void main (String[] args) 
    { System.out.println("ENTER VALUE OF TWO POINTS");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int j=sc.nextInt();
        System.out.println(Math.round(distance(i, j, j, i)*100000.0)/100000.0); 
    } 
} 