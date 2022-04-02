package tamilnadu.chennai;

public class WhileDowhileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileDowhileProgram dw = new WhileDowhileProgram();
		//dw.while_learning();
		//dw.while_learning2();
		//dw.while_learning3();
		//dw.while_learning4();
		//dw.while_learning5();
		//dw.while_learning6();
		dw.while_learning7();
	    //dw.Dowhile_learning();
	}
	private void while_learning7() {
		// TODO Auto-generated method stub
		int no =5 ;  // decrement the value --
 		while(no>=1)
 		{
 		System.out.println(no);
 		no--;
 		}
 		//System.out.println(no);
    }
	private void while_learning6() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5)
		{
		no++;       // 5+1= 6
		}
		System.out.println(no); // output value is 6
	}
	private void while_learning5() {
		// TODO Auto-generated method stub
		int no= 1;
		while(true)
		{
		System.out.println(no);
		
		no++;
		}
	}
	private void while_learning4() {
		// TODO Auto-generated method stub
		/*int no =1;
		while(false)
		{
		System.out.println(no);    // unreachable code
		}*/
		
	}

	private void while_learning3() {
		// TODO Auto-generated method stub
		int no =1;
		while(true)
		{
		System.out.println(no);
		}
		
	}

	private void while_learning2() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5)
		{
		System.out.println(no);
		//no++;	    // infinity more then time reason for no++ not using.
		}
		
	}

	private void Dowhile_learning() {
		// TODO Auto-generated method stub
		int no = 10;
		do 
		{
		System.out.println(no);
		no++;
		}while(no<=5);//exit criteria loop
	}

	private void while_learning() {
		// TODO Auto-generated method stub
		int no = 1;
		while(no<=5)
		{
		System.out.println(no);//entry criteria loop
		no++;
		}
		//System.out.println(no);
		
	}

}

