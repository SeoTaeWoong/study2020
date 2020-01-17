package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ChatHandler extends Thread{
	
	private Socket socket;
	private List<ChatHandler> list;
	private BufferedReader br;
	private PrintWriter pw;

	public ChatHandler(Socket socket, List<ChatHandler> list) throws IOException {
		this.socket=socket;
		this.list=list;
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	@Override
	public void run() {
		try {
			//πﬁ¥¬¬ 
			String nickName = br.readLine();
			broadcast(nickName+"¥‘ ¿‘¿Â");
			String line;
			while(true){
				line = br.readLine();
				if(line == null || line.toLowerCase().equals("quit")) {
					break;
				}
				broadcast(nickName+": "+line);
			}
			
			pw.println("quit");
			
			list.remove(this);
			broadcast(nickName+"¥‘ ≈¿Â");
			pw.close();
			br.close();
			socket.close();
			//∫∏≥ª¥¬¬ 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void broadcast(String msg) {
		for(ChatHandler data : list ) {
			data.pw.println(msg);
			data.pw.flush();
		}
	}
	
}
