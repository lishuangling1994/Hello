

public class sylnasize {

	public static void main(String[] args) {
		new thread().start();
		new thread().start();
		new thread().start();
		new thread().start();
	}
}
class thread extends Thread{
	private static int ticket=100;
	public  void run(){
		synchronized(thread.class){
		while (true) {
			if (ticket<1) {
				break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("第"+this.getName()+"窗口卖的第"+ticket--+"号票");
		}
		}
	}


}
