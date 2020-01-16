package thread;

class JoinTest implements Runnable{
		
	@Override
	public void run() {
		
		for(int i=1; i<6; i++) {
				System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
//--------------------------------------------
public class JoinMain {
	
	public static void main(String[] args) {
		JoinTest jt = new JoinTest();
		Thread t = new Thread(jt);
		System.out.println("������ ����");
		t.start();
		try {
			t.join();//start�� ���������� ��޷���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("������ ����");
	
	}

}
