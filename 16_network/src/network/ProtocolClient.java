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
		
		//socket = new Socket("서버IP", port);
		try {
			socket = new Socket("127.0.0.1", 9500); // 소켓 안에 중요한 IO가 들어있다.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			keyBoard = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (UnknownHostException e) { // 호스트 즉 서버를 찾을수 없을때
			System.out.println("서버를 찾을수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) { // 서버와 연결이 안될때
			
		}
		String msg, line;
		while(true) {
			try {
				//서버로 발송
				/*
				 * "100:angel"
				 * "200:angel"
				 * "300:angel:안녕"
				 */
				msg = keyBoard.readLine();
				bw.write(msg+"\n");
				bw.flush();
				//서버로부터 수신
				/*
				 * angel님 입장
				 * angel님 퇴장
				 * [angel]> 안녕
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
