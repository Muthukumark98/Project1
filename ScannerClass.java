package tamilnadu.tenkasi;
import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner emp = new Scanner(System.in);
	System.out.println("Enter the Employee name : ");
	String NAME = emp.next();
	System.out.println("Enter the Employee ID number :");
	int ID = emp.nextInt();
	System.out.println("Enter the Emoployee experience of year :");
	float YEAR = emp.nextFloat();
	System.out.println("Enter the Employee Monthly Salary :");
	double MonthlySalary = emp.nextDouble();
	System.out.println("Enter the Employee per Annual Salary : ");
	long Annualsalary  = emp.nextLong();
	System.out.println("Enter the Employee present or not : ");
	boolean PN = emp.hasNext();
	System.out.println("Hi I'm MuthuKumar learning for java class ");
	}

	}


