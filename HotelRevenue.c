/**
 * Author -> Debag101
 * Purpose -> Hotel Revenue collector
 * Date -> 11/05/2023
*/

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

//Just a fancy way to print out a tabular form of room number : price
void displayRoomsToPrice(int roomArr[], float priceArr[], int size) {
    for(int i = 0; i < size; i++) {
        printf("\nRoom Number -> %d :: Price -> $%0.2f ",roomArr[i],priceArr[i]);
    }
}
//main method starts
int main(int argc, char const *argv[])
{
    int rooms;
    float totalPrice = 0.00;
    //Getting the number of rooms we are dealing with
    printf("How many rooms do you have ? => ");
    scanf("%d",&rooms);
    
    //Declaring int array roomNumbers to store the number of the room
    int roomNumbers[rooms];
    //Declaring float array roomPrices to store the price of each room
    float roomPrices[rooms];
    
    //Asking user for room number and price number
    //Sample -> 101 78.98
    for(int i=0; i < rooms; i++) {
        printf("\nEnter the number of room at index %d and its price seperated with space \" \" => ",i);
        scanf("%d" "%f", &roomNumbers[i], &roomPrices[i]);
        //Adding prices to totalPrice one by one
        totalPrice += roomPrices[i];
    }
    //Displaying the tabular list
    displayRoomsToPrice(roomNumbers, roomPrices, rooms);
    //Display the total revenue
    printf("\nAccumulated revenue = $%0.2f",totalPrice);

    //Exit code functionality
    printf("\nEnter any key to exit........");
    getch();
    system("cls");
    return 0;
}
