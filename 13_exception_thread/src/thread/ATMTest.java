package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable {
	private long depositeMoney=100000;//�ܾ�
	private long balance;
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm);
		Thread son = new Thread(atm);
		
		
		mom.setName("����");
		son.setName("�Ƶ�");
		mom.start();
		son.start();
	}

	@Override
	//public synchronized void run() {//����ȭ = �Ѱ��� �����常 ��� �����ϴ�.
	
	public void run() {
		
		synchronized (ATMTest.class) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Thread.currentThread().getName()+"�� �ȳ��ϼ���");
			
			
			try {
				System.out.println("ã���� �ϴ� �ݾ� �Է� : ");
				balance = Long.parseLong(br.readLine());
				
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
			withDraw();	
		}
	}
	
	public void withDraw() {
		if(balance<=depositeMoney) {
			if(balance%10000==0) {
				depositeMoney = depositeMoney-balance; 		
				System.out.println("�ܾ���"+depositeMoney);
			} else {
				System.out.println("���������� �Է��ϼ���");
			} 
				
		} else
			System.out.println("�ܾ� ����");

	}
}