package observe;

import java.util.Observable;

public class MovieJDK extends Observable {

	public void move(){
		setChanged();//状态发生改变
		notifyObservers();//通知观察者
	}
}
