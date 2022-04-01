package tamilnadu.chennai;

public class AdditionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionProgram ap = new AdditionProgram();
		ap.additionProgram(125);
	}

	private void additionProgram(int purse) {
		// TODO Auto-generated method stub
	int addition =0;
	while(purse>0)
	{
		int rem = purse%10;
		addition = (addition*10)+rem;
		purse = purse/10;
		}
	System.out.println(addition);
	}

}

