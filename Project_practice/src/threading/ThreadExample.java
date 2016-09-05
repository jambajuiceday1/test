package threading;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread threadA = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("");
				}
				
			}
		});

	}

}
