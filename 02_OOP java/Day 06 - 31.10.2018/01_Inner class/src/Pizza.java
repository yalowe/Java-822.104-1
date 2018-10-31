
public class Pizza {
	
	private Addition addition=new Addition();
	
	public Addition getAddition() {
		return addition;
	}



	public void setAddition(Addition addition) {
		this.addition = addition;
	}



	public class Addition {
		public Addition(){
			
		}
		private String topName;

		public String getTopName() {
			return topName;
		}

		public void setTopName(String topName) {
			for(String top :new String[]{"Olive", "Onion", "Corn", "PineApple"}){
				if(topName.equals(top)){
					this.topName = topName;
				}			
			}
		}

	}
	
	
	
}
