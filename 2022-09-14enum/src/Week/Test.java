package Week;

import Week.Scheduler.Day;

public class Test {

	public static void main(String[] args) {

		Scheduler scheduler = new Scheduler();
		scheduler.addTask(Day.SUNDAY, "study java");
		scheduler.addTask(Day.MONDAY, "smoke");
		scheduler.addTask(Day.MONDAY, "go");
		scheduler.addTask(Day.TUESDAY, "fd");
		scheduler.addTask(Day.TUESDAY, "dfsf");
		scheduler.addTask(Day.MONDAY, "fsaf");

		scheduler.displayWeek();
		System.out.println("=====");
		System.out.println(scheduler.getTasks(Day.SUNDAY));
		System.out.println(scheduler.getTasks(Day.MONDAY));
		scheduler.cencelTasks(Day.MONDAY);
		System.out.println(scheduler.getTasks(Day.MONDAY));
		
	}

}
