import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		Hashtable<String,Queue<Task>> hashtable=new Hashtable();
		
		Queue<Task> bobList=new LinkedList();
		
		bobList.add(new Task<String>("Buy food",20));
		bobList.add(new Task<String[]>(new String[]{"Clean room", "Clean garden"},50));
		
		hashtable.put("Bob", bobList);
		
		
		Queue<Task> aliceList=new LinkedList();
				
		aliceList.add(new Task<String>("Cook food",20));
		aliceList.add(new Task<String[][]>(new String[][]{new String[] {"Buy drink","Buy food"} , new String[] {"Pay to post", "Pay to bank"}},120));
		
		hashtable.put("Alice", aliceList);
		
		
		
		
		for(String key: hashtable.keySet()){
			System.out.println("--------------------------------");
			int totalSum=0;
			
			System.out.println("Person name: "+key);
			
			Queue<Task> valueForKey = hashtable.get(key);
			
			
			for(Task t:valueForKey){
				totalSum+=t.getTaskDuration();
				
				System.out.println(t);
			}
			
			
			System.out.println("Total time for all tasks: "+totalSum);
			
		}

	}

}
