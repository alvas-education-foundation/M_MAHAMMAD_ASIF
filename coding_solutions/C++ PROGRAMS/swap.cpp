#include<iostream.h>

clas fri
{
 int x, y, q;
 public:
	 void input() 
	{
	 cout << "Enter Two Numbers :";
	 cin >> x>>y;
	}
	friend void swap(fri &t);
	void display() 
	{
	 cout << "After Swap x is :" << x;
	 cout << "After Swap y is :" << y;
	}
};
	void swap(fri &t) 
	{
	    t.q = t.x;
	    t.x = t.y;
 	   t.y = t.q;
	}
int main() 
{
    fri t1;
    t1.input();
    swap(t1);
    t1.display();
    return 0;
}
