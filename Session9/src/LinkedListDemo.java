import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedListDemo {
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.add("Nikita");
		l.add(10);
		l.add(null);
		l.add(40);
		l.add(10);
		l.add(1, 40);
		System.out.println(l);
		
		l.set(0,10);
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst("Nikita");
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		
	}

}
