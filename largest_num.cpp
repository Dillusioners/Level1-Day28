# include <iostream>


// execution starts from here
int main(int argc, char** argv){
	// variable declaration
	int count, input, largest = 0;
	
	// asking user for total integers to find
	std::cout << "How many integers you want to find?: ";
	std::cin >> count;
	
	// looping for the given count
	for(int i = 1; i <= count; i++){
		std::cout << "Enter integer no." << i << ": ";
		std::cin >> input;
		largest = std::max(input, largest);	
	}
	
	// printing the largest number
	std::cout << "\nThe largest number is " << largest;
	return 0;
}
