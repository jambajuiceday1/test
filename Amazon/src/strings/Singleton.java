package strings;

public class Singleton {
	
	private volatile static Singleton _instance = null;
	
	private Singleton(){};
	
	public Singleton getInstance(){
		if(_instance == null){
			synchronized (Singleton.class) {
				if(_instance == null){
					_instance = new Singleton();
				}
			}
		}
		return _instance;
	}

}
