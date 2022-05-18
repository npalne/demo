package ArrayExm;

import java.util.Iterator;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] val1 = new int[4];
		
		val1[0]=10;
		val1[1]=20;
		val1[2]=30;
		val1[3]=40;
		
		/*
		for(int a=0;a<val1.length;a++)
		{
			System.out.println(val1[a]);			
		}
		*/
		
		for (Object var:val1)
		{
			System.out.println(var);
		}
		//Iterator itr =	val1.iterator();
	}

}
