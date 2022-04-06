package tamilnadu.bacic;

import java.util.Scanner;

public class ArrayDemo {

public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDemo ad = new ArrayDemo();
//ad.LearnArray();
//ad.LearnArray1();   // Array is group of similar Datatype values(99%)
//ad.LearnArray2();
//ad.LearnArray3();
//ad.LearnArray4();
ad.LearnArray5();
}

private void LearnArray5() {
	// TODO Auto-generated method stub
	int[] ar = new int[10];
	ar[0] = 90;
	ar[1] = 85;
	for(int i=0; i<ar.length;i++)
	{
	System.out.print(ar[i]+" ");
	}  // 90 85 0 0 0 0 0 0 0 0 Unused memory will be wasted
}

private void LearnArray4() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no.of Subjects");
	int count = sc.nextInt();
	int[] marks = new int[count];
	System.out.println(marks.length);
	int total=0;
	for(int i=0;i<marks.length; i++)
	{
	System.out.println("Enter mark");
	marks[i] = sc.nextInt();
	}
	System.out.println();
	
	for(int i=0;i<marks.length;i++)
	{total=total+marks[i];
	System.out.println(marks[i]);
	}
	System.out.println("Total Mark="+total);
}

private void LearnArray3() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no.of Subjects");
	int count = sc.nextInt();
	int[] marks = new int[count];
	
	int total=0;
	for(int i=0;i<5; i++)
	{
	System.out.println("Enter mark");
	marks[i] = sc.nextInt();
	}
	System.out.println();
	
	for(int i=0;i<5;i++)
	{total=total+marks[i];
	System.out.println(marks[i]);
	}
	System.out.println("Total Mark="+total);
}

private void LearnArray2() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no.of Subjects");
	int count = sc.nextInt();
	int[] marks = new int[count];
	
	int total=0;
	for(int i=0;i<5; i++)
	{
	System.out.println("Enter mark");
	marks[i] = sc.nextInt();
	}
	System.out.println();
	
	for(int i=0;i<5;i++)
	{total=total+marks[i];
	System.out.println(marks[i]);
	}
	System.out.println("Total Mark="+total);
}

private void LearnArray1() {
	// TODO Auto-generated method stub
	int[] marks = new int[5];
	Scanner sc = new Scanner(System.in);
	int total=0;
	for(int i=0;i<5; i++)
	{
	System.out.println("Enter mark");
	marks[i] = sc.nextInt();
	}
	System.out.println();
	for(int i=0;i<5;i++)
	{total=total+marks[i];
	System.out.println(marks[i]);
	}
	System.out.println("Total Mark="+total);
}

private void LearnArray() {
		// TODO Auto-generated method stub
int[] marks= {90,87,97,65,42};
		
int total=0;
for(int i=4;i>0;i--)
{
total=total+marks[i];
}
System.out.println(total);
System.out.println(total/5+"%");
}

}

