package observe;

public class TestJDK {
	public static void main(String[] args) {
		MovieJDK movieJDK=new MovieJDK();
		MasterJDK masterJDK=new MasterJDK();
		movieJDK.addObserver(masterJDK);
		movieJDK.move();
		movieJDK.deleteObserver(masterJDK);
	}
}
