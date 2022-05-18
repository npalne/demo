package ArrayExm;

public class exmple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x = {1,2,3,4,5};
		System.out.println(x[0]);
		System.out.println(x[4]);
		System.out.println(x.length);
		System.out.println("&&&&&&&&&&&&&");
		for (int i=0; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("&&&&&&&&&&&&&");
		
		
		int[] y=new int [4];
		y[0]=10;
		y[1]=20;
		y[2]=30;
		y[3]=40;
		for (int i=0; i<y.length;i++)
		{
			System.out.println(y[i]);
		}
		
		
		//------------------------
		
		int [] [] val = {{11,12,13,14},{15,16,17},{18,19,20,21}};
	}

}
