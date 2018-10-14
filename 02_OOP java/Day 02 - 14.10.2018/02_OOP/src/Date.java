
public class Date {

	private int year;
	private int month;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = (year>2017 && year<2050)? year: 2018;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = (month>0 && month<13)? month: 1;
	}
	
	
	@Override 
	public String toString() {
		return super.toString()+"\n"+ month+"\\"+year;
	}
	
}
