package threadTest;

public class threadTest {
	public static void main(String...args){
		threadT thread = new threadT();
		thread.start();
		
//		try{Thread.sleep(10000);}
//		catch(InterruptedException e){}
		thread.interrupt();
	}
}
