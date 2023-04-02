import javax.swing.JFrame;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

JFrame fr = new JFrame("Riki");
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fr.setBounds(100, 100, 300, 300);
fr.setVisible(true);
Thread.sleep(1000);
fr.setLocation(fr.getX()+200, fr.getY());
Thread.sleep(1000);
fr.setLocation(0, 0);

	}

}
