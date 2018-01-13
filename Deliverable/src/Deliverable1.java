import java.util.Scanner;

public class Deliverable1 {
	public static void main(String[] args) {
	
	Scanner scnr = new Scanner(System.in);
	int userNum1;
	int userNum2;
	//get first number
	System.out.print("Please enter a number in the hundreds: ");
	userNum1 = scnr.nextInt();
	//separate each digit
	int first1  =  userNum1 % 10;
	int second1 =  ( userNum1 - first1 ) % 100 / 10;
	int third1 =  ( userNum1 - first1 - second1 ) % 1000 / 100;
	
	//get second number
	System.out.print("Please enter another number in the hundreds: ");
	userNum2 = scnr.nextInt();
	//separate each digit
	int first2  =  userNum2 % 10;
	int second2 =  ( userNum2 - first2 ) % 100 / 10;
	int third2  =  ( userNum2 - first2 - second2 ) % 1000 / 100;
	
	//add digits together
	int firstAdd = first1 + first2;
	int secondAdd = second1 + second2;
	int thirdAdd = third1 + third2;
	
	if (firstAdd == secondAdd && secondAdd == thirdAdd) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	
	
	
	
	
	
	
	
	
	}
}
