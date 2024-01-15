import java.util.Comparator;

public class MyComperator implements Comparator<String>{

	@Override
	public int compare(String k1, String k2) {
		
		return -k1.compareTo(k2);
	}

//	@Override
//	public int compare(Integer i1, Integer i2) {
//		// TODO Auto-generated method stub
//		if(i1<i2)
//		{
//			return +1;
//		}
//		else if(i1>i2)
//		{
//			return -1;
//		}
//		else
//		{return 0;
//		}
	
	
		
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}


