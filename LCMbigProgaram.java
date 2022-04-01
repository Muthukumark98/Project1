package tamilnadu.chennai;

public class LCMbigProgaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCMbigProgaram big = new LCMbigProgaram();
		//big.lcm_learn();
		big.lcm_learn2();
	}

	private void lcm_learn2() {
		// TODO Auto-generated method stub
		int no1=54, no2 =20;
		int big = no1>no2?no1:no2;
		while(true)
		{
		if(big%no1==0 && big%no2==0)
		{
		System.out.println("lcm number is "+big);
		break;
		}
		big++;
		}
	}

	private void lcm_learn() {
		// TODO Auto-generated method stub
		int no1= 3, no2 = 2;
		int big = no1>no2?no1:no2;
		while(true) 
		{
		if(big%no1==0 && big%no2==0)
		{
		System.out.println("lcm number is"+big);
		break;
		}
		big++;
		}
	} 

}

