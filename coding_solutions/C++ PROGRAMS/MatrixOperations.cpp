#include <iostream>
using namespace std;

int main()
{
	int Rsum=0,Csum=0,Dsum=0,SDsum=0,a[3][3]={ {1,2,3},
		      {4,5,6},
		      {7,8,9},
		    };
	cout<<"The matrix is"<<endl;
	
	//for displaying the matrix
    for (int i = 0; i < 3; i++)
	{ 
       		for (int j = 0; j < 3; j++)
		{ 
  			cout << a[i][j] <<"\t";
		}
	cout<<"\n";
	}
   cout<<endl;
    
    
    //finding sum of each row.
	for (int i = 0; i < 3; i++)
	{ 
       		for (int j = 0; j < 3; j++)
		{ 
  			Rsum+=a[i][j];
		}
	cout<<"Sum of "<<i+1<<" row is: "<<Rsum<<"\n";
	    Rsum=0;
	}
	
	cout<<endl;
	
	 //finding sum of each column.
	for (int i = 0; i < 3; i++)
	{ 
       		for (int j = 0; j < 3; j++)
		{ 
  			Csum+=a[j][i];
		}
	cout<<"Sum of "<<i+1<<" column is: "<<Csum<<"\n";
	    Csum=0;
	}
    	cout<<endl;
    	
    //finding sum of main diagonal elements 
	for (int i = 0; i < 3; i++) 
         {
   		 for (int j = 0; j < 3; j++) 
   		 {
     		if (i == j)
    		Dsum+=a[i][j];
   		 }
   	}
 
   cout<<"Sum of main Diagonal Elements is: "<<Dsum;


    //finding sum of secondary diagonal elements.
    for (int i = 2; i >= 0; i--) 
         {
   		 for (int j = 2;j>=0; j--) 
   		 {
     		if (i == j)
    		SDsum+=a[i][j];
   		 }
   	}
   	    cout<<"\nSum of Secondary Diagonal Elements is: "<<SDsum;
		return 0;
}