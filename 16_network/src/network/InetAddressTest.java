package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress naver = InetAddress.getByName("www.naver.com"); // ������ ã�� ���Ҽ��� ������
		//host ����
		//	   ����� = client
		
		System.out.println("NAVER IP: "+ naver.getHostAddress());
		System.out.println();
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("LOCAL IP: "+ local.getHostAddress());
		System.out.println();
		
		
		InetAddress[] ar = InetAddress.getAllByName("www.daum.net");
		
		for(int a=0; a<ar.length; a++) {
			System.out.println("DAUM IP: "+ ar[a].getHostAddress());
			System.out.println();
		}
		
		for(InetAddress data : ar) {
			System.out.println("DAUM IP: "+ data.getHostAddress());
			System.out.println();
		}
	}
}
