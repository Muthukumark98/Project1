package tamilnadu.chennai;

public class PrintVariablePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintVariablePass pv = new PrintVariablePass();
		pv.printNumbersWhile(1234);
		pv.printNumbers1(1234);
		pv.printNumbers2(1234);
		pv.printNumbers3(1234);
		//pv.printNumbers4(1234);
		pv.printNumbers();
		}
     private void printNumbers4(int no1) {
		// TODO Auto-generated method stub
    	while(no1>0) 
  		{
  		System.out.println(no1);
  		no1 = no1%10;
  		}
	}
	private void printNumbers3(int no1) {
		// TODO Auto-generated method stub
    	 while(no1>0) 
 		{
 		no1 = no1/10;
 		System.out.println(no1);
 		}
	}
	private void printNumbersWhile(int no1) {
		// TODO Auto-generated method stub
		while(no1>0) 
		{
		System.out.println(no1);
		no1 = no1/10;
		}
	}

	private void printNumbers2(int no1) {
		// TODO Auto-generated method stub
		System.out.println(no1);
		no1 = no1/10;
		System.out.println(no1);
		no1 = no1/10;
		System.out.println(no1);
		no1 = no1/10;
		System.out.println(no1);
		
	}

	private void printNumbers1(int no1) {
		// TODO Auto-generated method stub
		System.out.println(no1);
		int no2 = no1/10;
		System.out.println(no2);
		int no3 = no2/10;
		System.out.println(no3);
		int no4 = no3/10;
		System.out.println(no4);
	}

	private void printNumbers() {
		// TODO Auto-generated method stub
		int no1 =1234;
		System.out.println(no1);
		int no2 = no1/10;
		System.out.println(no2);
		int no3 = no2/10;
		System.out.println(no3);
		int no4 = no3/10;
		System.out.println(no4);
	}

}

