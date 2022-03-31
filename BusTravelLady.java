package tamilnadu.chennai;

import java.util.Scanner;

public class BusTravelLady {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusTravelLady og = new BusTravelLady();
		og.officeguindy();
			}

			private void officeguindy() {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the place of office");
				String office = sc.next();
				System.out.println(" Enter the chengalpatu to Tambaram amount ");
				int CtoT = sc.nextInt();
				System.out.println("Enter the Tambaram to Chengalpatu amount ");
				int TtoC = sc.nextInt();
				System.out.println(" Enter the Tambaram to Guindy amount ");
				int TtoG = sc.nextInt();
				System.out.println("Enter the Guindy to Tambaram amount ");
				int GtoT = sc.nextInt();
				System.out.println(" 1.chengalpatu to Tambaram and Tambaram to Chengalpatu");
				int MofussilBus = CtoT+TtoC;
				System.out.println("up&down  mofussil bus total amount is ="+ MofussilBus+ "/-RS");
				
				System.out.println(" 2.Tambaram to Guindy & Guindy to Tambaram");
				int Citybus = TtoG+GtoT ;
				System.out.println("up&down CityBus total amount is ="+ Citybus+ "/-RS");
				
				System.out.println(" 3.Total amount up&down travel One day per");
				int Onedaytotal = MofussilBus+Citybus;
				System.out.println("Totalamount="+Onedaytotal+"/-RS");
				
				int permonth = Onedaytotal*22;
				System.out.println("permonth total amount is ="+ permonth + "/-RS" );
				
			    System.out.println("4.Goverment free for 30 Rs in ladies");
			    int Govtfree = Onedaytotal-30;
			    System.out.println("Govt free amount perday total ="+Govtfree+"/-RS");
			    
			    int Govtfreemonth = Govtfree*22;
			    System.out.println("Govt free permonth total ="+Govtfreemonth+"/-RS");
			    
			    System.out.println(" 5.Profit of amount in Govt.permonth");
			    int Profit = permonth-Govtfreemonth;
			    int Profitper =(Profit*100)/Govtfreemonth;
			    System.out.println("profit of Govtfreemonth offer using ="+Profit+"/-RS");
			    System.out.println("Profit percentage is ="+ Profitper+"%");
	}

}

