package tamilnadu.chennai;

public class Forloop_learning {   //nested looping

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forloop_learning fl = new Forloop_learning();
		//fl.forloop_learning();
		//fl.forloop_learning2();     ///nested loop
		//fl.forloop_learning3();
		//fl.forloop_learning4();
		fl.forloop_learning5();
		fl.forloop_learning6();
		
	}

	private void forloop_learning6() {
		// TODO Auto-generated method stub
		for(int no=1;no<=3;no++)
		{
		for(int count=1;count<=4;count++)
		{
	    System.out.print(no+" ");
		}
		System.out.println();
		}
	}

	private void forloop_learning5() {
		// TODO Auto-generated method stub
		for(int no=1;no<=4;no++)
		{
		for(int count=1;count<=5;count++)
		{
	    System.out.print(no+" ");
		}
		System.out.println();
		}
	}

	private void forloop_learning4() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=3)
		{
		for(int count=1;count<=5;count++)
		{
		System.out.print(no+" ");
		}
		System.out.println();no++;
		}
	}

	private void forloop_learning3() {
		// TODO Auto-generated method stub
		for(int no=1;no<=3;no++)
		{
		for(int count=1;count<=5;count++)
		{
		System.out.print(no+" ");
		}
		System.out.println();
		}
	}

	private void forloop_learning2() {
		// TODO Auto-generated method stub
		int no=1;
		for(int count=1;count<=5;count++)
		{
		System.out.print(no+" ");
		}
		System.out.println();no++;
		for(int count=1;count<=5;count++)
		{
		System.out.print(no+" ");
		}
		System.out.println();no++;
		for(int count=1;count<=5;count++)
		{
		System.out.print(no+" ");
		}
		System.out.println();
	}

	private void forloop_learning() {
		// TODO Auto-generated method stub
		for(int count=1;count<=5;count++)
		{
		System.out.print(1+" ");
		}
		System.out.println();
		for(int count=1;count<=5;count++)
		{
		System.out.print(2+" ");
		}
		System.out.println();
		for(int count=1;count<=5;count++)
		{
		System.out.print(3+" ");
		}
		System.out.println();
		
	}

}

