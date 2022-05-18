package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> value = new HashSet<>();
		value.add("Selenium");
		value.add("10");
		value.add("@");
		value.add("Yajat");
		System.out.println("HashSet Size is " +value.size());
		
		Iterator<String> vl = value.iterator();
		
		while(vl.hasNext())
		{
			String var = vl.next();
			if(var.equals("Yajat"))
			{
			System.out.println(var);
			}
		}
		
		
	}

}
