package network;

import java.io.Serializable;
import java.net.Socket;

enum Info{
	EXIT,JOIN,SENT
}

public class InfoDTO implements Serializable{
	public static final String QUIT = "quit";
	private String msg="" ;
	private String nickName;
	private Info command;
	
	
	public InfoDTO() {
		
	}
	public void setCommand(Info com) {
		command = com;
	}
	public Info getCommand() {
		return command;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getMsg() {
		return msg;
	}
	public String getNickName() {
		return nickName;
	}
}
