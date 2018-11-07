
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		//יצירת מערך דינמי - שניתן להוסיף לו תאים ככל שנרצה
		//כל תא חייב להיות מחרוזת
		ArrayList<String> names = new ArrayList<>();
		
	
		//------------הוספה של תא חדש למערך הדינמי-------------------
		names.add("aa");
		names.add("aa");
		names.add("cc");
		names.add("dd");
		//names.add(123); // Error - we can add only string as a new element
		names.add(123+"");  // 123+"" is "123"
		names.add(123+"");   
		
		
		//------------ גישה לתא מסויים במערך הדינמי-------------------
		System.out.println("item in index 3: " + names.get(3));  //--> dd
		
		
		//------------ גישה לאורך המערך הדינמי-------------------------
		System.out.println("Total Items: " + names.size());  //--> 5

		
		//------------ ריצה והצגת כל התאים במערך הדינמי-------------------
		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
		
		
		
		
		//----------הסרה של תא מסויים במערך הדינמי באמצעות האינדקס של התא שנרצה להסיר -------------------
		names.remove(3); // Removes item with index number 3
		
		
		
		System.out.println("item in index 3: " + names.get(3));  //-->123

		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
		
		
		
		System.out.println("Total Items: " + names.size());  //--> 4
		
		
		//----------הסרה של תא מסויים במערך הדינמי באמצעות התוכן של התא שנרצה להסיר -------------------
		//במקרה ויש כמה תאים עם תוכן זהה לתוכן המבוקש, יוסר התא הראשון
		// remove - returns true if this list contained the specified element	
		names.remove("123");
		
		
		//הסרה של כל התאים המכילים את הערך המבוקש - באמצעות לולאה
		while(names.remove("aa"));
		
		
		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
	}
}
