#include <iostream>
using namespace std;
 
class student
{
    //by default class members are private in nature.

        char  name[30],section[10];
        int   rollNo;
        float perc;
    public:
            //member function to get student's details
            void getinfo();
            //member function to print student's details
            void printinfo();
};
 
//member function definition, outside of the class

void student::getinfo(void)
{
    cout << "Enter name of the student: " ;
    cin >> name;
    cout << "Enter roll number of student: ";
    cin >> rollNo;
    cout << "Enter Section of the student: ";
    cin >> section;
     
}
 
//member function definition, outside of the class

    void student::printinfo(void)
{  
    cout << "Name:"<< name << "\nRoll Number:" << rollNo << "\nSection:" << section<<"\n\n" ;
  
}
 
int main()
{
    student std[10];       //array of objects creation
    int n,i;
     
    cout << "Enter total number of students: ";
    cin >> n;
     
    for(i=0;i< n; i++){
        cout << "Enter details of student " << i+1 << ":\n";
        std[i].getinfo();
        cout<<"\n";
    }
     cout << endl;
     
    for(i=0;i< n; i++){
       
        cout << "Details of student " << i+1 << " is:\n";
        std[i].printinfo();
         
    }
     
    return 0;
}