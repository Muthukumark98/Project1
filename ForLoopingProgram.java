package tamilnadu.chennai;

public class ForLoopingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoopingProgram fl = new ForLoopingProgram();
		//fl.forlooping();
		//fl.forlooping2();
		//fl.forlooping3();
		//fl.forlooping4();
		//fl.forlooping5();
		//fl.forlooping6();
		//fl.forlooping7();
		//fl.forlooping8();
		//fl.forlooping9();
		//fl.whilelooping();
		//fl.whilelooping2();
		//fl.whilelooping3();
	}

	private void whilelooping3() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5)
	    System.out.println(no);
		no++;
		
	}

	private void forlooping9() {
		// TODO Auto-generated method stub
		for(int no=1;no<=5;++no)
		{
		System.out.println(no);
		}
	}

	private void forlooping8() {
		// TODO Auto-generated method stub
		for (int no=1;no<=5;no++)
		{
		System.out.println(no); 
 		no++; // 1 3 5
		}
	}

	private void forlooping7() {
		// TODO Auto-generated method stub
		for(int no=1;no<=5;)
		{
			System.out.println(no);  // infinity for more then output
		}
	}

	private void forlooping6() {
		// TODO Auto-generated method stub
		/*for(int no=1;false;no++)
		{
			System.out.println(no);
		}*/
	}

	private void forlooping5() {
		// TODO Auto-generated method stub
	for(int no=1;true; no++)
	{
	System.out.println(no);
	}
	}

	private void forlooping4() {
		// TODO Auto-generated method stub
	for(int no=1;no<=5;no++)
	{
	System.out.println(no);
	}
	int no =1;
	while(true)
	{
	System.out.println(no);
	}
	}

	private void forlooping3() {
		// TODO Auto-generated method stub
		int no;
		for(no=1;no<=5;no++)
		{
			System.out.println(no);
		}
		System.out.println(no);
	}

	private void forlooping2() {
		// TODO Auto-generated method stub
		int no;
		for(no=1;no<=5;no++)
		{
			System.out.println(no);
		}
	}

	private void whilelooping2() {
		// TODO Auto-generated method stub
		int no =5;
		while(no>=1)
		{
		System.out.println(no);
		no--;
		}
		System.out.println(no);
	}

	private void whilelooping() {
		// TODO Auto-generated method stub
	int no=1;    
	while(no<=5)   // increment 
	{
	System.out.println(no);
	no++;
	}
	System.out.println(no);
	}

	private void forlooping() {
		// TODO Auto-generated method stub
		
		for(int no=1;no<=5;no++)
		{
		System.out.println(no);
		}
		//System.out.println(no);--->no cannot be resolved to a variable
	}

}

