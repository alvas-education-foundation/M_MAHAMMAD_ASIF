#include <stdio.h>

#define MAXSIZE 10

 

void main()

{

    int array[MAXSIZE];

    int i, j,c=0, num, temp;

 

    printf("Enter the value of num \n");

    scanf("%d", &num);

    printf("Enter the elements one by one \n");

    for (i = 0; i < num; i++)

    {

        scanf("%d", &array[i]);

    }

    printf("Input array is \n");

    for (i = 0; i < num; i++)

    {

        printf("%d\n", array[i]);

    }

    /*   Bubble sorting begins */

    for (i = 0; i < num; i++)

    {

        for (j = 0; j < (num - i - 1); j++)

        {

            if (array[j] > array[j + 1])

            {	c++;

                temp = array[j];

                array[j] = array[j + 1];

                array[j + 1] = temp;

            }

        }

    }

    printf("Sorted array is...\n");

    for (i = 0; i < num; i++)

    {

        printf("%d\t", array[i]);

    }    
	printf("\n");
        printf("Number of passes performed for sorting is: %d\n",c);

}
