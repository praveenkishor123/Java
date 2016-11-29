package coreJava;

public class Singleton {
	
	// volatile variable
	private static volatile Singleton _instance;
	
	public static Singleton getInstance() {
		if(_instance == null) {
			synchronized(Singleton.class) {
				if(_instance == null)
					_instance = new Singleton();
			}
		}
		
		return _instance;
	}
	
}
