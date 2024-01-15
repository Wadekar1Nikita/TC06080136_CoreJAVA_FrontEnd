import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
    public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add("A");
		h.add(2);
		h.add(10.2f);
//		h.add(null);
//		System.out.println(h.add(2));
		System.out.println(h);
		
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
//insertion order is not preserved
//dublicates are not allowed