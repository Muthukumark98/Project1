package tamilnadu.chennai;

public class ModulesUsingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModulesUsingProgram mup = new ModulesUsingProgram();
		mup.ModulesUsing(1234);
		mup.ModulesUsing2(1234);
		mup.ModulesUsing3(1234);
	}

	private void ModulesUsing3(int no1) {
		// TODO Auto-generated method stub
		while(no1>0)
		{
		System.out.println(no1%10); //4
		no1 = no1/10; // 123
		}
	}

	private void ModulesUsing2(int no1) {
		// TODO Auto-generated method stub
		System.out.println(no1%10);
		no1 = no1/10;
		System.out.println(no1%10);
		no1 = no1/10;
		System.out.println(no1%10);
		no1= no1/10;
		System.out.println(no1%10);
		// go to looping
				
	}

	private void ModulesUsing(int no1) {
		// TODO Auto-generated method stub
		System.out.println(no1%10); //4
		int no2 = no1/10;//123
		System.out.println(no2%10);//3
		int no3 = no2/10;//12
		System.out.println(no3%10);//2
		int no4 = no3/10;//1
		System.out.println(no4%10);//1
		//mistake for repeated task, same variable repeated
	}

}

