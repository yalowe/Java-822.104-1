import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class App {

	public static void addClientToQueue(Hashtable<String, Queue<String>> postOfficeOueues, String name, int choice){
		switch(choice){
			case 1: (postOfficeOueues.get("Change")).add(name); break;
			case 2: (postOfficeOueues.get("Post service")).add(name); break;
			case 3: (postOfficeOueues.get("Money Transfer")).add(name); break;
		}
	
	}
	
	
	public static String getClientFromQueue(Hashtable<String, Queue<String>> postOfficeOueues, String queueName){
			//return the name of the first client in the wanted queue
			return (postOfficeOueues.get(queueName)).remove();
	}
	
	
	public static void callNextClient(Hashtable<String, Queue<String>> postOfficeOueues, int choice){
		
		String queueName="";
		
		switch(choice){
		case 1: queueName="Change"; break;
		case 2: queueName="Post service"; break;
		case 3: queueName="Money Transfer"; break;
	}
		
		String currentClient=getClientFromQueue(postOfficeOueues,queueName);
		System.out.println("Now is: "+currentClient+", for turn: " + queueName);
	}
	
	public static void main(String[] args) {
		Hashtable<String, Queue<String>> postOfficeOueues = new Hashtable<>();
		
		postOfficeOueues.put("Change", new LinkedList<>());
		postOfficeOueues.put("Post service", new LinkedList<>());
		postOfficeOueues.put("Money Transfer", new LinkedList<>());
		
		
		addClientToQueue(postOfficeOueues,"A1",1);
		addClientToQueue(postOfficeOueues,"A2",1);
		addClientToQueue(postOfficeOueues,"A3",1);
		
		addClientToQueue(postOfficeOueues,"B1",2);
		addClientToQueue(postOfficeOueues,"B2",2);
		addClientToQueue(postOfficeOueues,"B3",2);
				
		addClientToQueue(postOfficeOueues,"C1",3);
		addClientToQueue(postOfficeOueues,"C2",3);
		addClientToQueue(postOfficeOueues,"C3",3);
		
		
		callNextClient(postOfficeOueues,2);
		
		callNextClient(postOfficeOueues,1);
		callNextClient(postOfficeOueues,1);
		
		callNextClient(postOfficeOueues,3);
		
		callNextClient(postOfficeOueues,2);
		

	}

}
