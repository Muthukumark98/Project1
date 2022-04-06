package tamilnadu.bacic;

public class ArrayLearnProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLearnProgram al = new ArrayLearnProgram();
	    // al.array_learning();
		// al.array_learning2();
		// al.array_learning3();
		// al.array_learning4();
		// al.array_learning5();
		// al.array_learning6();
		// al.array_learning7();
		 al.array_learning8();
		// al.array_learning1();
	}

	private void array_learning8() {
		// TODO Auto-generated method stub
		int [] marks = {90,80,90,87,67};
	     //             0  1  2  3   4
	//i--> index
	for(int i=4;i>=0;i--)
	{//
	if(marks[i]%2!=0)
	System.out.print(marks[i]+" ");
	}  
	System.out.println();
	}

	private void array_learning7() {
		// TODO Auto-generated method stub
	int [] marks = {90,80,90,87,67};
	     //             0  1  2  3   4
	//i--> index
	for(int i=4;i>=0;i--)
	{// Even
	if(marks[i]%2==0)
	System.out.print(marks[i]+" ");
	}  // 67 87 90 80 90
	System.out.println();
	}

	private void array_learning6() {
		// TODO Auto-generated method stub
	int [] marks = {90,80,90,87,67};
	     //             0  1  2  3   4
	//i--> index
	for(int i=4;i>=0;i--)
	{// odd
		if(marks[i]%2!=0)
	System.out.print(marks[i]+" ");
	}  // 67 87 90 80 90
	System.out.println();
	}

	private void array_learning5() {
		// TODO Auto-generated method stub
		int [] marks = {90,80,90,87,67};
		     //         0  1  2  3   4
		//i--> index
		for(int i=4;i>=0;i--)
		{
		System.out.print(marks[i]+" ");
		}  // 67 87 90 80 90
		System.out.println();
	}

	private void array_learning4() {
		// TODO Auto-generated method stub
		int [] marks = {90,80,90,87,67};
		//i--> index
		for(int i=1;i<5;i+=2)
		{
		System.out.print(marks[i]+" ");
		}
		System.out.println();
	}

	private void array_learning3() {
		// TODO Auto-generated method stub
		int [] marks = {90,80,90,87,67};
		int i=0;
		while(i<5)
		{
		System.out.println(marks[i]+" ");
		i+=2;
		}
	}

	private void array_learning2() {
		// TODO Auto-generated method stub
		int [] marks = {90,80,90,87,67};
		//i--> index
		for(int i=0;i<5;i+=2)
		{
		System.out.print(marks[i]+" ");
		}
		System.out.println();
	}

	private void array_learning1() {
		// TODO Auto-generated method stub
		int [] marks = {90,80,90,87,67};
		{
			System.out.print(marks[0]+" ");
			System.out.print(marks[1]+" ");
			System.out.print(marks[2]+" ");
			System.out.print(marks[3]+" ");
			System.out.print(marks[4]+" ");
		}
		System.out.println();
	}

	private void array_learning() {
		// TODO Auto-generated method stub
		
		int [] marks = {90,80,90,87,67};
		//i--> index
		for(int i=0;i<5;i++)
		{
		System.out.print(marks[i]+" ");
		}
		System.out.println();
		
	}

}

