package tamilnadu.chennai;

public class ForNestedLopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForNestedLopping fnl = new ForNestedLopping();
		fnl.fornestedLoop_learn(); // 1 2 3 4 5
		fnl.fornestedLoop_learn2();
		fnl.fornestedLoop_learn3();
		fnl.fornestedLoop_learn4();
		fnl.fornestedLoop_learn5();
		fnl.fornestedLoop_learn6();
		fnl.fornestedLoop_learn7();
		fnl.fornestedLoop_learn8();
		fnl.fornestedLoop_learn9();
		fnl.fornestedLoop_learn10();
		
	}

	private void fornestedLoop_learn10() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
		for(int col=1;col<=row;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void fornestedLoop_learn9() {
		// TODO Auto-generated method stub
		for(int row=5;row>=3;row--)
		{
		for(int col=1;col<=row;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void fornestedLoop_learn8() {
		// TODO Auto-generated method stub
		 int row=5;
		 while(row>=3)
		 {
		 for(int col=1;col<=row;col++)
		 {
		 System.out.print(col+" ");
		 }
		 System.out.println();row--;
		 }
	}

	private void fornestedLoop_learn7() {
		// TODO Auto-generated method stub
		
		for(int col=1;col<=5;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		for(int col=1;col<=4;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		for(int col=1;col<=3;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
	}

	private void fornestedLoop_learn6() {
		// TODO Auto-generated method stub
		for(int row=3;row>=1;row--)
		{
		//System.out.println(row+" ");
		for(int col=5;col>=1;col--)
		{
		System.out.print(row+" ");
		}
		System.out.println();
		}
	}

	private void fornestedLoop_learn5() {
		// TODO Auto-generated method stub
		for(int row=3;row>=1;row--)
		{
		for(int col=5;col>=1;col--)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void fornestedLoop_learn4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++)
		{
		for(int col=1;col<=5;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void fornestedLoop_learn3() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		for(int col=1;col<=5;col++)
		{                                  // 100% same work in program
		System.out.print(col+" ");
		}
		System.out.println();
		for(int col=1;col<=5;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
	}

	private void fornestedLoop_learn2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=2;row++)
		{
		for(int col=1;col<=5;col++)
		{
			System.out.print(row+" ");   /// not work my idea
		}                                    //12345 12345
		System.out.println();
		}
	}

	private void fornestedLoop_learn() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++)
		{
			System.out.print(col+" ");// output: 1 2 3 4 5
		}
	}

}

