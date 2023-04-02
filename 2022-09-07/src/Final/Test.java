package Final;

public class Test {

	public static void main(String[] args) {

Superman superman = Superman.getInstance();
superman.setAltitude(100);
//ברגע שיצרנו אוביקט אחד ו אין אפשרות ליצור אוביקט נוסף ולכן כל הסופרמנים כאן שייכים לאותו סופרמן וכל שינוי נעשה הוא שינוי לרפרס ולא לאוביקט
Superman superman2 =Superman.getInstance();
superman.setAltitude(150);
System.out.println(superman);


	}

}
