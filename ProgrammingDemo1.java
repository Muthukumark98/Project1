package tamilnadu.chennai;

public class ProgrammingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProgrammingDemo1 pd =new ProgrammingDemo1();
pd.learn_if();

	}
	public void learn_if()
	{
		int no1 =55, no2=5;
		if(no1>no2)
		{
			System.out.println(no1);
		}
		else if(no2<no1)
		{
			System.out.println(no2);
		}
		else
		{
			System.out.println(no1+" "+ no2); // +" "+ operator is working with concatenation operator
		}
			
	}

}

