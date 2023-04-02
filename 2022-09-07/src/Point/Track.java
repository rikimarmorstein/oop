package Point;

import java.util.Arrays;

public class Track {

	
	private String name;
	private Point[] points = new Point[10];
	private int ind;
	
	public Track(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Point[] getPoints() {
		return points;
	}


	public void setPoints(Point[] points) {
		this.points = points;
	}
	
	public void addPoint(Point point) {
		points[ind++] = point;
	}


	


	@Override
	public String toString() {
		return "Track [name=" + name + ", points of track="  + ind + "]";
	}


	public void printTrack() {
		System.out.println("track name " + name);
		System.out.println("points:");
		for (int i = 0; i < points.length; i++) {
			Point point = points[i];
					if (point !=null)
					System.out.println(point);	
		}
	}
	
	
}
