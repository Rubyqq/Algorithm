package threadTest;

import java.sql.Date;

public class threadT extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("==="+11+"===");
		
		try{
			sleep(1000);
		}catch(InterruptedException e){
			return;
//			System.out.print("hahhahaha");
		}
		}
	}
}
