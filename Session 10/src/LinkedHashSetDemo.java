import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add(10);
		h.add("A");
		h.add(2);
		h.add(10.2f);
		h.add(null);
		System.out.println(h.add(2));
		System.out.println(h);
		
	}

}
//insertion order is preserved
//linked list+hash table