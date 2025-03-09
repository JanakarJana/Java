package SeleniumScript;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachAndIterator {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add("java");
		al1.add(10);
		al1.add(13.3);
		al1.add(true);
		System.out.println(al1);
		
		for(Object o:al1) {			//for non-generic
			System.out.println(o);
		}
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("selenium");
		al2.add("manual");
		System.out.println(al2);
		
		for(String s: al2) {			// for generic
			System.out.println(s);
		}
		Iterator itr = al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
