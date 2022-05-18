package ArrayExm;

import java.util.ArrayList;

public class ExAraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList lst = new ArrayList();
		
		System.out.println(lst.size());
		
		lst.add("Yajat");
		lst.add('a');
		lst.add(10);
			for (int i=0; i<lst.size();i++)
			{
				System.out.println(lst.get(i));
			} 
		
	}

}
