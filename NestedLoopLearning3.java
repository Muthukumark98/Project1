package tamilnadu.chennai;

public class NestedLoopLearning3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedLoopLearning3 nl = new NestedLoopLearning3();
		//nl.learn_looping();
		//nl.learn_looping2();
		nl.learn_looping3();
	}

private void learn_looping3() {
		// TODO Auto-generated method stub
	int row=5;
	while(row>=1)
	{
	for(int col=1;col<=row;col++)
	{
	System.out.print(row*col);
	}
	System.out.println();
	row--;
	}
	
	}

private void learn_looping() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++)
		{
		System.out.print(5);
		}
		System.out.println();
		for(int col=1;col<=4;col++)
		{
		System.out.print(4);
		}
		System.out.println();
		for(int col=1;col<=3;col++)
		{
		System.out.print(3);
		}
		System.out.println();
		for(int col=1;col<=2;col++)
		{
		System.out.print(2);
		}
		System.out.println();
		for(int col=1;col<=1;col++)
		{
		System.out.print(1);
		}
		System.out.println();
		}
private void learn_looping2() {
	// TODO Auto-generated method stub
	for(int row=5;row>=1;row--)
	{
	for(int col=1;col<=row;col++)
	{
	System.out.print(row);
	}
	System.out.println();
}
	
}
}



