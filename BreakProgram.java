package tamilnadu.chennai;

public class BreakProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakProgram bp = new BreakProgram();
		bp.breakProgram();
	}

	private void breakProgram() {
		// TODO Auto-generated method stub
		int no1= 1;
		while(no1<=10)
		{
		System.out.println(no1);
		if(no1==5)
		{
		break;
		}
		no1++;
		}
	}

}

