import java.util.*;

class Car 
{ 
    int no; 
    Car(int no) { this.no = no; } 
} 
  

class Callbyref 
{ 
    // To swap c1 and c2 
    public static void swap(Car c1, Car c2) 
    { 
        int temp = c1.no; 
        c1.no = c2.no; 
        c2.no = temp; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number:");
	int a=sc.nextInt();
	System.out.println("Enter 2nd number:");
	int b=sc.nextInt();
        Car c1 = new Car(a); 
        Car c2 = new Car(b); 
        swap(c1, c2);
	 
        System.out.println("After Swapping 1st number = " + c1.no); 
        System.out.println("After Swapping Second number = " + c2.no); 
    } 
} 