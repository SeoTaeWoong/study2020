package network;

import java.util.List;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerObject {
	ServerSocket serverSocket;
	List<ChatHandlerObject> list;
	public ChatServerObject() {
		try {
			serverSocket = new ServerSocket(9500);
			System.out.println("서버 준비 완료");
			list = new ArrayList<ChatHandlerObject>();
			
			while(true) {
				Socket socket = serverSocket.accept();
				ChatHandlerObject handler = new ChatHandlerObject(socket,list);
				handler.start();
				list.add(handler);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ChatServerObject();
	}
}
