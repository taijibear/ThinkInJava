package completed.c22_concurrency;
//: concurrency/MainThread.java

/**
 * 
 * 
 * @author taijibear
 * 
 * һ��С�� �������ʱģ�� ����, ����һ�� �������߳� ���е���ʱ����.
 * 
 */


public class MainThread {
	
	
	public static void main(String[] args) {
		LiftOff launch = new LiftOff();
		launch.run();
		
		// ��ʵ����������� ��û��ʹ�õ� ���̵߳�����
		// ������ �򵥵� ������  launch �����  run ��������
		// ��ʼ���� ��ʵֻ��һ�� main  ���߳� ������
	    System.out.println("");
	    System.out.println("Waiting for LiftOff");

	}
	
} 

/*
	 * Output: #0(9), #0(8), #0(7), #0(6), #0(5), #0(4), #0(3), #0(2), #0(1),
	 * #0(Liftoff!),
	 */// :~
