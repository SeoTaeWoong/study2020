package inheritance;

import java.util.Scanner;

public class Exam {
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";
	
public Exam(String name, String dap, char[] ox, int score, final String JUNG) {
		
	}
			
	public Exam() {
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("답 입력 : ");
		dap = sc.next();
		System.out.println();
	}
	public void compare() {
		ox = new char[5];
		for(int i =0; i<dap.length(); i++) {
			if(dap.charAt(i)==JUNG.charAt(i)) {
				ox[i] = 'O';
				score = score+20;
			}else {
				ox[i] = 'X';
			}
		}//for		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDap() {
		return dap;
	}

	public void setDap(String dap) {
		this.dap = dap;
	}

	public char[] getOx() {
		return ox;
	}

	public void setOx(char[] ox) {
		this.ox = ox;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getJUNG() {
		return JUNG;
	}


}
