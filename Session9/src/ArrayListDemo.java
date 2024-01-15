import java.util.*;

public class ArrayListDemo {
	public static void main(String args[])
	{
		int no=10;
		Integer i=new Integer(no);//boxing-primitive to wrapper
		int a=i.intValue();//unboxing-wrapper to primitive
		
		int b=100;
		Integer m=b;//Auto -boxing 
		int c=m;//Auto-unboxing
		
		List<Integer> l=new ArrayList<Integer>();//generic form //polymorphic reference 
		l.add(10);
		l.add(100);
		l.add(98);
		l.add(20);
		l.add(71);
		l.add(89);
//		l.add(null);
//		System.out.println(l);
//		l.add(2, 58);
//		System.out.println(l);
//		l.remove(1);
//		System.out.println(l);
//		System.out.println(l.contains(100));
//		List l1=Collections.synchronizedList(l);
		
		
		//Iterator
		Iterator<Integer> k=l.iterator();
		while(k.hasNext())
		{
			int n=k.next();
			if(n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				k.remove();
				//i.add()
				//i.replace()
				//i.set()
		}
		
		
		
	}
		System.out.println(l);

	}
}
