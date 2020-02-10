package epam.hometask3;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int n1=0,n2=0;
		Operations calculator = new Operations();
		System.out.println("Calculator Operations");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		System.out.println("Exit");
		while(true) {
			Scanner sc = new Scanner(System.in);
			try {
				
			int choice = sc.nextInt();
			System.out.println("Enter your choice option");
			switch(choice) {
			case 1:
				System.out.println("Enter the number one");
				n1 = sc.nextInt();
				System.out.println("Enter the number two");
				n2 = sc.nextInt();
				System.out.println("Addition of two numbers is = " + calculator.Addition(n1,n2));
				break;
			case 2:
				System.out.println("Enter the number one");
				n1 = sc.nextInt();
				System.out.println("Enter the number two");
				n2 = sc.nextInt();
				System.out.println("Subtraction of two numbers is = " + calculator.Subtraction(n1,n2));
				break;
		case 3:
			System.out.println("Enter the number one");
			n1 = sc.nextInt();
			System.out.println("Enter the number two");
			n2 = sc.nextInt();
			System.out.println("Multiplication of two numbers is = " + calculator.Multiplication(n1,n2));
			break;
	case 4:
		System.out.println("Enter the number one");
		n1 = sc.nextInt();
		System.out.println("Enter the number two");
		n2 = sc.nextInt();
		System.out.println("Division of two numbers is = " + calculator.Division(n1,n2));
		break;
	default:
			System.out.println("The number choosen is out of range");
			break;
	}
			}catch(Exception e) {
				System.out.println("Option is Invalid");
				
			}
		}

	}
}
