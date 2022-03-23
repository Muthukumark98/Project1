package tamilnadu.chennai;
import java.util.Scanner;
public class Distance_vendor {
public static void main(String[] args) {
	    // TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	System.out.println("What is the distance between Chennai and Madurai" + " in Km");
	int distance=sc.nextInt();
	System.out.println("What is your driving speed" + " in Km");
	int speed=sc.nextInt();
	System.out.println("You will reach Madurai in ");
	System.out.println((distance/speed)+" Hours");

	System.out.println("ஐயா இந்த வண்டியில் தினமும் வியாபாரம் செய்வீா்களா?");
	String s =sc.next();
	System.out.println("காலையும் மாலையும் சோ்த்து பயணச்சீட்டிற்கு எவ்வளவு தொகை செலுத்துகிறீா்கள்?");
	int ticket=sc.nextInt();
	System.out.println("மாதம் முழுவதும் பயணம் செய்வீா்களா?");
	String s1=sc.next();
	System.out.println("ஒரு மாதத்திற்கு நீங்கள் பயணச்சீட்டிற்க்காக செலவிடும் தொகை எவ்வளவு?");
	int mticket=sc.nextInt();
	System.out.println("மூன்று மாதத்திற்கு நீங்கள் பயணச்சீட்டிற்க்காக செலவிடும் தொகை எவ்வளவு?");
	int threemticket=sc.nextInt();
	System.out.println("அப்படியானால் நீங்கள் சீசன் டிக்கட் எடுத்துவிட்டீா்களா?");
	String s2=sc.next();
	System.out.println("சீசன் டிக்கட்டின் விலை எவ்வளவு?");
	int value=sc.nextInt();
	System.out.println("அது எவ்வளவு நாளைக்கு செல்லுபடியாகும்");
	int validity=sc.nextInt();
	System.out.println("நீங்கள் சீசன் டிக்கட் வாங்குவதன் மூலம் உங்களால் எவ்வளவு மிச்சப்படுத்த முடியும்");
	if(value<=threemticket)
	System.out.println("சீசன் டிக்கட் மூலம் எனக்கு " +(threemticket-value)+  " ரூபாய் மிச்சமாகிறது " );
	else 
	  System.out.println("அப்படி இல்லை என்றால் எனக்கு பொிய தொகை நட்டமாகும்");
	}
	  }


