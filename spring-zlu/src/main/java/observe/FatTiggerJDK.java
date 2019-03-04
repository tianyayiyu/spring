package observe;

import java.util.Observable;
import java.util.Observer;

public class FatTiggerJDK implements Observer {
	/**
	 *
	 * @param o 被观察者
	 * @param arg
	 */
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Observer FatTiggerJDK===========");
	}
}
