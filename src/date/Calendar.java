package date;

public class Calendar {
	private Calendar() {
		
	}

	private static Calendar instance = new Calendar();
	
	public static Calendar getInstance() {
		return instance;
	}
}
