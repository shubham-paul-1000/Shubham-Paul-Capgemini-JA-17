package lab8;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ThreadTimer implements Runnable{
	// synchronized display method to display the present time 
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Override
	public void run() {
		System.out.print("Present time : ");
		while(true) {
			try {
				display();
				Thread.sleep(10000);
				System.out.print("Time after 10 seconds : ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadTimer threadtimer=new ThreadTimer();
		Thread thread=new Thread(threadtimer);
		thread.start();
	}
}