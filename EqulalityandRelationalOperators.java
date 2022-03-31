package tamilnadu.chennai;

public class EqulalityandRelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EqulalityandRelationalOperators er = new EqulalityandRelationalOperators();
		er.erOperator();
		er.erOperator2();
		}
	private void erOperator() {
		// TODO Auto-generated method stub
		System.out.println((5>2)==(3<5));//true
		System.out.println((5>=5)==(5<=5));// true
		System.out.println((5>2)!=(3<5)); 
		System.out.println("---------------");
	}
	private void erOperator2() {
		// TODO Auto-generated method stub
		 System.out.println(5==5);
		   System.out.println(5==5.0);
		   System.out.println(5==6.0);
		   System.out.println(10/2==5.0);  // 10/2 =5
		   System.out.println(true==true);
		   System.out.println(false==false);
		   System.out.println(false==true);
		   
		   System.out.println(5>=5);//true
		   System.out.println(5>=6); //false
		   System.out.println(5>5); // false
		   System.out.println(5>3); //true
		   System.out.println(5<5); //false
		   System.out.println(5<3); // false
		   System.out.println(5<6); //true
		   System.out.println(5<=3); // false
		   System.out.println(5<=5); //true
		   System.out.println(5!=5); // false
		   
	}

}

