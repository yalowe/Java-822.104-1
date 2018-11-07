
public class App {

	public static void main(String[] args) {
		String s1="1";
		String s2="3";
		
		//בחיבור של מחרוזת יתבצע שירשור
		System.out.println(s1+s2);  //--> 13
		
		
		//שירשור למחרוזת תמיד יתן מחרוזת - גם אם הפרמטר אותו משרשרים למחרוזת הוא לא מטיפוס מחרוזת
		System.out.println(s1+4);   //--> 14
		
		int num1=1;
		int num2=3;
		
		
		System.out.println(num1+num2);  //--> 4
		System.out.println(num1+4);     //--> 5
		
		
	}

}
