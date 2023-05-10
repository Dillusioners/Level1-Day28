/**
 * Author - Debag 101
 * Purpose - University Course Simulator
 * Date - 10-05-2023
 * */

import java.io.*;
import java.util.*;

public class EducationalCourses {
	static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	static boolean isSignedUp = false;
	static boolean CSC = false, DSA = false, CABC = false, GEN = false,CS50 = false;
	static String Courses[] = {"Classical Sciences", "Data Analysis","Calculus ABC","Genetics","CS-50"};
	public static void displayCourses() {
		System.out.println("#############################");
		System.out.println("   DILLUSIONERS UNIVERSITY	   ");
		System.out.println("#############################");
		System.out.println("The courses available are => " + Arrays.toString(Courses));
		System.out.println("Enter your choice => ");
	}
	public static void SignUp()throws IOException {
		String name;
		int age;
		System.out.println("Enter your name => ");
		name = rd.readLine();
		while(true) {
			System.out.println("Enter your age => ");
			try {
				age = Integer.parseInt(rd.readLine());
				if(age < 18 || age > 26) {
					System.out.println("Age not suitable !");
				}
				else {
					isSignedUp = true;
					break;
				}
			}catch(Exception e) {
				System.err.println("Please enter valid credentials !");
			}
		}
	}

	public static void CSc()throws IOException {
		System.out.println("Welcome to Classical Sciences !");

		while(true) {
			System.out.println("1.Sign Up\n2.Buy Course\n3.Exit\nEnter your choice =>");

			int userC = Integer.parseInt(rd.readLine());
			if(userC == 1) {
				if(!isSignedUp) {
					SignUp();
				}else {
					System.out.println("You are already signed up !");
				}	
			}
			else if(userC == 2) {
				if(!CSC) {
					if(!isSignedUp) {
						System.out.println("You are not signed up ");
						SignUp();
					}
					else {
						System.out.println("Are you sure ?\nEnter 1 for Yes and 2 for No => ");
						if(Integer.parseInt(rd.readLine()) == 1) {
							System.out.println("Successfully bought the course !");
							CSC = true;
						}else {
							System.out.println("Cancelling Transaction !");
						}
					}
				}else {
					System.out.println("Course is aleady bought !");
				}
			}
			else {
				System.out.println("Thank you for checking out our course !");
				break;
			}
		}
	}

	public static void DSA() throws IOException{
		System.out.println("Welcome to Data Analytics !");

		while(true) {
			System.out.println("1.Sign Up\n2.Buy Course\n3.Exit\nEnter your choice =>");

			int userC = Integer.parseInt(rd.readLine());
			if(userC == 1) {
				if(!isSignedUp) {
					SignUp();
				}else {
					System.out.println("You are already signed up !");
				}	
			}
			else if(userC == 2) {
				if(!CSC) {
					if(!isSignedUp) {
						System.out.println("You are not signed up ");
						SignUp();
					}
					else {
						System.out.println("Are you sure ?\nEnter 1 for Yes and 2 for No => ");
						if(Integer.parseInt(rd.readLine()) == 1) {
							System.out.println("Successfully bought the course !");
							CSC = true;
						}else {
							System.out.println("Cancelling Transaction !");
						}
					}
				}else {
					System.out.println("Course is aleady bought !");
				}
			}
			else {
				System.out.println("Thank you for checking out our course !");
				break;
			}
		}
	}

	public static void CAbc() throws IOException{
		System.out.println("Welcome to Cal ABC !");

		while(true) {
			System.out.println("1.Sign Up\n2.Buy Course\n3.Exit\nEnter your choice =>");

			int userC = Integer.parseInt(rd.readLine());
			if(userC == 1) {
				if(!isSignedUp) {
					SignUp();
				}else {
					System.out.println("You are already signed up !");
				}	
			}
			else if(userC == 2) {
				if(!CSC) {
					if(!isSignedUp) {
						System.out.println("You are not signed up ");
						SignUp();
					}
					else {
						System.out.println("Are you sure ?\nEnter 1 for Yes and 2 for No => ");
						if(Integer.parseInt(rd.readLine()) == 1) {
							System.out.println("Successfully bought the course !");
							CSC = true;
						}else {
							System.out.println("Cancelling Transaction !");
						}
					}
				}else {
					System.out.println("Course is aleady bought !");
				}
			}
			else {
				System.out.println("Thank you for checking out our course !");
				break;
			}
		}
	}

	public static void Gen()throws IOException {
		System.out.println("Welcome to Genetics !");

		while(true) {
			System.out.println("1.Sign Up\n2.Buy Course\n3.Exit\nEnter your choice =>");

			int userC = Integer.parseInt(rd.readLine());
			if(userC == 1) {
				if(!isSignedUp) {
					SignUp();
				}else {
					System.out.println("You are already signed up !");
				}	
			}
			else if(userC == 2) {
				if(!CSC) {
					if(!isSignedUp) {
						System.out.println("You are not signed up ");
						SignUp();
					}
					else {
						System.out.println("Are you sure ?\nEnter 1 for Yes and 2 for No => ");
						if(Integer.parseInt(rd.readLine()) == 1) {
							System.out.println("Successfully bought the course !");
							CSC = true;
						}else {
							System.out.println("Cancelling Transaction !");
						}
					}
				}else {
					System.out.println("Course is aleady bought !");
				}
			}
			else {
				System.out.println("Thank you for checking out our course !");
				break;
			}
		}
	}

	public static void Cs() throws IOException{
		System.out.println("Welcome to Computer Science 50 !");

		while(true) {
			System.out.println("1.Sign Up\n2.Buy Course\n3.Exit\nEnter your choice =>");

			int userC = Integer.parseInt(rd.readLine());
			if(userC == 1) {
				if(!isSignedUp) {
					SignUp();
				}else {
					System.out.println("You are already signed up !");
				}	
			}
			else if(userC == 2) {
				if(!CSC) {
					if(!isSignedUp) {
						System.out.println("You are not signed up ");
						SignUp();
					}
					else {
						System.out.println("Are you sure ?\nEnter 1 for Yes and 2 for No => ");
						if(Integer.parseInt(rd.readLine()) == 1) {
							System.out.println("Successfully bought the course !");
							CSC = true;
						}else {
							System.out.println("Cancelling Transaction !");
						}
					}
				}else {
					System.out.println("Course is aleady bought !");
				}
			}
			else {
				System.out.println("Thank you for checking out our course !");
				break;
			}
		}
	}

	public static void main(String[] args)throws IOException {
		int UserInput;
		displayCourses();
		UserInput = Integer.parseInt(rd.readLine());
		if(UserInput == 1) {
			CSc();
		}
		else if(UserInput == 2) {
			DSA();
		}else if(UserInput == 3) {
			CAbc();
		}else if(UserInput == 4) {
			Gen();
		}else if(UserInput == 5) {
			Cs();
		}else {
			System.out.println("Course N/A");
		}
	}
}