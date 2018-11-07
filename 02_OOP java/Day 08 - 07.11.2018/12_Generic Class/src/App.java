import java.util.ArrayList;
import java.util.Hashtable;
public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> temp=new ArrayList<Integer>();
		temp.add(1);
		temp.add(2);
		
		
		
		Counter<Integer> c1=new Counter<>(100,"c1");
		
		
		Counter<ArrayList<Integer>> c2=new Counter<>(new ArrayList<Integer>(),"c2");
		c2.myProp.add(1);
		c2.myProp.add(2);
		
		
		Counter<ArrayList<Integer>> c3=new Counter<>(temp,"c3");
		
		
		
		Hashtable<Counter,Object> list=new Hashtable<>();
		list.put(c1, 100);
		list.put(c2,temp );
		list.put(c3, temp);
		
		
		for(Counter key:list.keySet()){
			Object valueToCompare=list.get(key);
			boolean res=key.compareValues(valueToCompare);
			
			System.out.println("Name: "+ key.name+", Value 1: " + key.myProp + ", Value 2: "+valueToCompare+ " isEqual: "+res);
		}
		
	}

}
