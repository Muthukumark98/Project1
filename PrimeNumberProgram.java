package tamilnadu.chennai;

public class PrimeNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberProgram pnp = new PrimeNumberProgram();
		pnp.primenumber();
	}

	private void primenumber() {
		// TODO Auto-generated method stub
		int no = 291 ;
		int div = 2;
		boolean prime = true;
		while(div<no)
		{
		if(no%div==0) {
		System.out.println("Not prime");
		prime = false;
		break;
		}
		div++;
		}
		if(prime==true) {
			System.out.println("prime");
		}
	}

}

