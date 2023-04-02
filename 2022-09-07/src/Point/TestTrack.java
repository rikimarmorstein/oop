package Point;

public class TestTrack {

	public static void main(String[] args) {


		Track track = new Track("Golan");
		Point telaviv = new Point("telaviv",50,10);
		Point ashdod = new Point("ashdod",50,100);
		Point golan = new Point("golan", 60,90);

		track.addPoint(telaviv);
		track.addPoint(ashdod);
		track.addPoint(golan);

		System.out.println(track);
		
		track.printTrack();
	}

}
