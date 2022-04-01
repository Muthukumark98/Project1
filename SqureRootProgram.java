package tamilnadu.chennai;

public class SqureRootProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqureRootProgram sr = new SqureRootProgram();
		sr.squreroot_learning();
	}

	private void squreroot_learning() {
		// TODO Auto-generated method stub
		int no = 25;
		int sqr = 1;
		while(sqr<25)
		{
		if(no/sqr==sqr)
		{
		System.out.println(sqr);
		break;
		}
		sqr++;
		}
	}

}

