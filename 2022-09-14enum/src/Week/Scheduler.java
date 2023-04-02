package Week;

public class Scheduler {

	
	
	public enum Day {

		
		SUNDAY, MONDAY , TUESDAY, WEDNESDAY, TTURSDAY, FRIDAY;
		
		
		public String tasks;
	}
	
	public void addTask(Day day, String tasks) {
		if (day.tasks==null) {
					day.tasks=tasks;
		}else {
			day.tasks+= "\n"+ "  *" + tasks;
		}
		
	}
	
	public String getTasks(Day day) {
		String msg = day + ": ";
		if(day.tasks!=null) {
			msg+=day.tasks;
		}else {
			msg+= "\n" + "   no tasks today";
		}
		return msg;
	}
	
	public void cencelTasks(Day day) {
		day.tasks=null;
		System.out.println("all tasks for" + day + " deleted");
	}
	
	public void displayWeek() {
		System.out.println("====all tasks=====");
		
		for (Day day: Day.values()) {
			System.out.println(getTasks(day));
}
			
		}
	
}
