import java.util.Iterator;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
	 TreeSet<String> t=new TreeSet<String>();
	            t.add("A");
				t.add("B");
				t.add("Z");
				t.add("M");
				System.out.println(t);
				
				Iterator<String> itr=t.iterator();
				  while(itr.hasNext()){
				   System.out.println(itr.next());
				  }

}
}
