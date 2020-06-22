import java.util.*;
import java.lang.Math;
class Modular_Exponentiation{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values of x,y and p seperated by space");
	double x=sc.nextInt();
	double y=sc.nextInt();
	int p=sc.nextInt();
	double r=Math.pow(x,y);
	double result=r%p;
	System.out.println(result);
	}
}
