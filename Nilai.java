public class Nilai
{
	public static void main(String [] args)
	{
		String Hm;
		int NA = Integer.parseInt(args[1]);
		if(NA >81 && NA <= 100)
		{
			Hm="A";
		}
		else if(NA >= 66 && NA < 81)
		{
			Hm="B";
		}
		else if(NA >= 56 && NA < 65)
		{
			Hm="C";
		}
		else if(NA >= 41 && NA < 55)
		{
			Hm="D";
		}
		else
		{
			Hm ="E";
		}
		System.out.println("Nama Anda =" +args[0]);
		System.out.println("Nilai Huruf ="+Hm);
	}
}