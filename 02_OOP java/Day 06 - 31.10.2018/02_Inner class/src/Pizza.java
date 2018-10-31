public class Pizza extends Food {

	Addition addition=new Addition();

	public Food.Addition getAddition() {
		return addition;
	}

	public void setAddition(Food.Addition addition) {
		this.addition=(Addition)addition;	
	}
	


	public class Addition extends Food.Addition {
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

		@Override
		public String getAdditionInfo() {
			return "Pizza addition: "+topName;
		}

	}
	
	
	
}
