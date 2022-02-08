package com.simplilearn.threads;

public class MainThread implements Runnable {
public static int count=1;
    
    public MainThread() {
        
    }
    @Override
    public void run() {
    	
        while(count<=10)
        {
            System.out.println("Exc Thread "+ (count++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

	public static void main(String[] args) {
		 MainThread main=new MainThread();
	        Thread m=new Thread(main);
	        m.start();
	        
	        while(count<=10)
	        {
	            System.out.println("Main Thread "+ (count++));
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	}

}
