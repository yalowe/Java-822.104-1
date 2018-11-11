
public class Task <T> {

	//----------Properties--------------------
	private T taskContent; 
	private int taskDuration;
	
	
	//----------Getters + Setters ------------
	public T getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(T taskContent) {
		this.taskContent = taskContent;
	}
	
	public int getTaskDuration() {
		return taskDuration;
	}
	public void setTaskDuration(int taskDuration) {
		this.taskDuration = taskDuration;
	}

	//----------Constructor---------------------
	public Task( T taskContent,int taskDuration){
		setTaskContent(taskContent);
		setTaskDuration(taskDuration);
	}
	
	//----------Methods-------------------------
	@Override
	public String toString(){
		
		
		String res="Task duration: "+taskDuration+"\n";
		
		
		//here we check if <T> is string matrix
		if(taskContent instanceof String[][]){
			
			for(String[] matrixElement: ((String[][])taskContent)){
				for(String arrElement:matrixElement){
					res+="-"+arrElement+"\n";				
				}
			}
			
		}
		
		//here we check if <T> is string array
		else if(taskContent instanceof String[]){	
			for(String arrElement:((String[])taskContent)){
				res+="-"+arrElement+"\n";				
			}
		}
		
		
		else{
			res+=taskContent.toString();
		}
		
		return res;
	}
}
