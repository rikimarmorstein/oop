package Points;

public class Track {

	private int i;
private String name;
private Point[]points = new Point[10];

public Track() {

}



public Track(String name, Point[] points) {
	super();
	this.name = name;
	this.points = points;
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
	points[i++] = point;
}

public void ptintTrack() {
	for (int i = 0; i < points.length; i++) {
			Point point = points[i];		
if(point!=null) {
			System.out.println(point );
		}
	}
}



}
