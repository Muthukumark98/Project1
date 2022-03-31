package tamilnadu.chennai;

public class ModulesProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ModulesProgram1 mp = new  ModulesProgram1 ();
		 mp.modules(123456);
		 mp.modules2(123456);
		 mp.modules3(123456);
		
	}

	

	private void modules3(int purse) {
		// TODO Auto-generated method stub
		while(purse>0)
		{
			System.out.print(purse%1000+" ");
			purse = purse/10;	
		}
		
	}

	private void modules2(int purse) {
		// TODO Auto-generated method stub
		while(purse>0)
		{
			System.out.println(purse%100);
			purse = purse/100;		
		}
		
	}

	private void modules(int purse) {
		// TODO Auto-generated method stub
		System.out.println(purse%100);//56
		purse = purse/100;//1234
		System.out.println(purse%100);//34
		purse = purse/100;//12
		System.out.println(purse%100);//12
	}

}

