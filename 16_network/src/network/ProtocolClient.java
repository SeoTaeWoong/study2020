package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyBoard;
	
	public ProtocolClient() {
		
		//socket = new Socket("����IP", port);
		try {
			socket = new Socket("127.0.0.1", 9500); // ���� �ȿ� �߿��� IO�� ����ִ�.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			keyBoard = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (UnknownHostException e) { // ȣ��Ʈ �� ������ ã���� ������
			System.out.println("������ ã���� �����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) { // ������ ������ �ȵɶ�
			
		}
		String msg, line;
		while(true) {
			try {
				//������ �߼�
				/*
				 * "100:angel"
				 * "200:angel"
				 * "300:angel:�ȳ�"
				 */
				msg = keyBoard.readLine();
				bw.write(msg+"\n");
				bw.flush();
				//�����κ��� ����
				/*
				 * angel�� ����
				 * angel�� ����
				 * [angel]> �ȳ�
				 */
				line = br.readLine();
				System.out.println(line);
				
				String[] ar = msg.split(":");
				if(ar[0].equals("200")) { br.close();bw.close();socket.close(); keyBoard.close(); System.exit(0);}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ProtocolClient();
	}
}
