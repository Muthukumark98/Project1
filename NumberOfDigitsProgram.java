package tamilnadu.chennai;

public class NumberOfDigitsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfDigitsProgram nd = new NumberOfDigitsProgram();
		nd.numberOfDigits(123456);
		nd.numberOfDigit2(123456);
		 nd.numberOfDigit3(123456);// output:456 345 234 123
	}
		private void numberOfDigit3(int purse) {
		// TODO Auto-generated method stub
		int count = 0;
		//int addition = 0;
		while(purse>0)
		{
			
		System.out.print(purse%1000+" ");
		//addition = addition+ purse%10;
		purse= purse/10;
		count++;
		}
		System.out.println("Number Of Count is = "+count);
		//System.out.println("No,of Digits"+addition);
	}
		private void numberOfDigit2(int box) {
		// TODO Auto-generated method stub
		int count =0;
		while(box>0) {
			System.out.print(box%100+" ");
			box = box/100;
			count++;
		}
		System.out.println("Number of Count is = "+ count);
	}
		private void numberOfDigits(int purse) {
			// TODO Auto-generated method stub
			int count = 0;
			while(purse>0)
			{
				System.out.print(purse%10+" ");
				purse=purse/10;
				count++;
			}
			System.out.println("number of count is ="+ count);
		}
	}



