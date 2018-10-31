public class Chips extends Food {

	Addition addition=new Addition();

	public Food.Addition getAddition() {
		return addition;
	}

	public void setAddition(Food.Addition addition) {
		this.addition=(Addition)addition;	
	}
	
	public class Addition extends Food.Addition{
		private boolean isExtraFried;
		
		public boolean getExtraFried() {
			return isExtraFried;
		}

		public void setExtraFried(boolean isExtraFried) {
			this.isExtraFried = isExtraFried;
		}

		public String getAdditionInfo() {
			return "Chips addition: "+isExtraFried;
		}
		
	}


	


	
}
