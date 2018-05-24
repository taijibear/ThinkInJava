package completed.c22_concurrency;
//: concurrency/MainThread.java

/**
 * 
 * 
 * @author taijibear
 * 
 * 一个小的 火箭倒计时模拟 程序, 启用一个 独立的线程 进行倒计时任务.
 * 
 */


public class MainThread {
	
	
	public static void main(String[] args) {
		LiftOff launch = new LiftOff();
		launch.run();
		
		// 其实在这种情况下 并没有使用到 多线程的能力
		// 仅仅是 简单的 调用了  launch 对象的  run 方法而已
		// 自始至终 其实只有一个 main  主线程 在运行
	    System.out.println("");
	    System.out.println("Waiting for LiftOff");

	}
	
} 

/*
	 * Output: #0(9), #0(8), #0(7), #0(6), #0(5), #0(4), #0(3), #0(2), #0(1),
	 * #0(Liftoff!),
	 */// :~
