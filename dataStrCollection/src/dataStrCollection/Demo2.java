package dataStrCollection;
import java.util.*;
public class Demo2 {
	public static void main(String[]args)
	{
		LinkedList<String> li= new <String>LinkedList();
		li.add("Ram");
		li.add(" Sam");
		li.add("gobind");
		li.add("Raj");
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
