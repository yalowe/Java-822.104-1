public class Chips {

	Addition addition=new Addition();

	public Addition getAddition() {
		return addition;
	}



	public void setAddition(Addition addition) {
		this.addition = addition;
	}

	
	public class Addition{
		private boolean isExtraFried;
		
		public boolean getExtraFried() {
			return isExtraFried;
		}

		public void setExtraFried(boolean isExtraFried) {
			this.isExtraFried = isExtraFried;
		}
		
	}
}
