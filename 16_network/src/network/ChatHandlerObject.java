package network;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ChatHandlerObject extends Thread{
	
	private Socket socket;
	private List<ChatHandlerObject> list;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private InfoDTO dto;

	public ChatHandlerObject(Socket socket, List<ChatHandlerObject> list) throws IOException {
		this.socket=socket;
		this.list=list;
		ois = new ObjectInputStream((socket.getInputStream()));
		oos = new ObjectOutputStream((socket.getOutputStream()));
	}
	@Override
	public void run() {
		try {
			//πﬁ¥¬¬ 
			dto = (InfoDTO)ois.readObject();
			broadcast(dto.getNickName()+"¥‘ ¿‘¿Â");
			String line;
			while(true){
				dto = (InfoDTO)ois.readObject();
				if(dto==null||dto.getMsg().toLowerCase().equals("quit")) {
					break;
				}
				broadcast(dto.getNickName()+": "+dto.getMsg());
			}
			
			oos.writeObject(dto);
			
			list.remove(this);
			broadcast(dto.getNickName()+"¥‘ ≈¿Â");
			oos.close();
			ois.close();
			socket.close();
			//∫∏≥ª¥¬¬ 
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void broadcast(String msg) throws IOException {
		for(ChatHandlerObject data : list ) {
			dto.setMsg(msg);
			data.oos.writeObject(dto);
			data.oos.flush();
		}
	}
	
}
