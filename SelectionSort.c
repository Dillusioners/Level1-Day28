/**
 * Author - Debag101
 * Purpose - Helping alice to sort arrays
 * Date - 11/05/2023
*/

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
//Sorting function implementing selection sort
void SelSort(float array[], int size) {
    for (int outer = 0; outer < size - 1; outer++) {
        //Setting pointer at elemet of array at index outer
        int pointer = outer;
        //Starting loop from element after pointer indexed element
        for (int inner = outer + 1; inner < size; inner++) {
            if(array[inner] < array[pointer]) {
                //Getting the least number in the subarray
                pointer = inner;
            }
        }
        //Swapping places of the values
        float temporary = array[pointer];
        array[pointer] = array[outer];
        array[outer] = temporary;
    }
}
//Simple function to just print an array
void displayArray(float arr[], int size) {
    printf("[ ");
    for(int i=0; i < size; i++) {
        printf("%0.2f ",arr[i]);
        if(i == size - 1)
            printf("]");
        else 
            printf(",");
    }
}
//Main method starts
int main(int argc, char const *argv[]) {
    //Getting the size of the array
    int size;
    printf("\nEnter the size of the array alice => ");
    scanf("%d", &size);
    //Creating the numArray of length size
    float numArray[size];
    //Getting element at each index of array from 0 to size - 1
    for (int i = 0; i < size; ++i) {
        printf("\n>> Enter the element at index %d Alice => ", i);
        scanf("%f", &numArray[i]);
    }
    //Printing Unsorted array
    printf("\nUnsorted array is => ");
    displayArray(numArray, size);

    //Sorting array
    SelSort(numArray, size);

    //Printing sorted array
    printf("\nSorted array is => ");
    displayArray(numArray,size);

    //Simple exit code functionality
    printf("\nEnter any key to exit.......");
    getch();
    system("cls");
    return 0;
}