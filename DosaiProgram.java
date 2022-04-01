package tamilnadu.chennai;

public class DosaiProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DosaiProgram dp = new DosaiProgram();
		dp.dosai();
	}

	private void dosai() {
		// TODO Auto-generated method stub
		int lastDosai = 8;
		System.out.println("last value of Dosai ="+lastDosai);
		int thirdPerson = 8/2;
		System.out.println("thirdPerson Eating Dosai ="+thirdPerson);
		int balance3 = lastDosai+thirdPerson;
	    System.out.println("total Count third="+balance3);
	    
	    int SecondPerson = balance3/2;
	    System.out.println("Second Person Eatind Dosai ="+SecondPerson);
	    int balance2 = SecondPerson+balance3;
	    System.out.println("total Count for second="+balance2);
	    
	    int firstPerson = balance2/2;
	    System.out.println("First Person Eating Dosai ="+firstPerson);
	    int balance1 = firstPerson+balance2;
	    System.out.println("total count for First="+balance1);
	}

}

