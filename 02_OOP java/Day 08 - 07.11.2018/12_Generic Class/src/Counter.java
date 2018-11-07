
public class Counter <T>{
	
		public T myProp;
		public String name;
		
		public Counter(T myProp,String name){
			this.myProp=myProp;
			this.name=name;
		}
		
		
		public boolean compareValues(T value){
			return myProp==value;
		}
}
