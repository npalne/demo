	package PracticePKG;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=30, j=90, k=25, l=10;
		
		if (i>j && i>k && i>l )
		{
			System.out.println("i is greater");
		}
		else if (j>k && j>l)
		{
			System.out.println("j is greater");
		}
		else if (k>l)
		{
			System.out.println("k");			
		}		
		else
		{
			System.out.println("l");
		}
	}

}
