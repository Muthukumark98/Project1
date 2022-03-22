package tamilnadu.tenkasi;
import java.util.Scanner;

	public class Traintickets {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Traintickets  tg = new Traintickets  ();
				 tg.ticketsoftrain();
			}

			private void ticketsoftrain() {
				// TODO Auto-generated method stub
				
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the velachery to mylapore trainticket amount ?");
			int ticket = sc.nextInt();
			System.out.println("Details of ticket rate:");
			int perdaytrip = ticket*2;
			System.out.println("tickets perday up & down ="+perdaytrip+" /-RS ");
			int OneMonth = perdaytrip*30;
			System.out.println("tickets perOnemonth total up&down ="+OneMonth+ " /-RS ");
			int threemonth =OneMonth*3;
			System.out.println("tickets three month total up&down ="+" "+threemonth+"/-RS");
			System.out.println("Special offer% Season ticket just 400 /-Rs only %");
			System.out.println("Enter the season ticket amount");
			int seasonTickets = sc.nextInt();
			int profit = threemonth-seasonTickets;
			System.out.println("you save the 3month profit amount  ="+profit+"/-RS");
			
			}
			}





