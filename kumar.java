public class kumar extends Parent3
{
int no;
public kumar(int no)
{
this.no = no;
System.out.println("CC" + no);
}
public kumar()
{
System.out.println("Child Constructor");
System.out.println("Parent Constructor");
}
	public static void main(String[] args)
	{
		kumar ch = new kumar();
		kumar c2 = new kumar(1);
	}
}
