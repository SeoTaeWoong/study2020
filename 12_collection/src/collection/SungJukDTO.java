package collection;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO>{
	
	private int key;//번호 입력 :
	private String name;//이름 입력 :
	private int kor;	//국어 입력 :
	private int eng;	//영어 입력 :
	private int math;	//수학 입력 :
	
	private int tot;	//총점 
	private double avg;
	
	
	//public SungJukDTO() {
//		this.key = key;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
	
	
	
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public SungJukDTO() {
		// TODO Auto-generated constructor stub
	}
	public void setKey(int key) {
		this.key = key;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getKey() {
		return key;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}	
	public int getTot() {
		return tot;
	}
	public void calc() {
		tot = kor+eng+math;
		
		avg = (double)tot/3;
	}
	
	@Override
	public String toString() {
		return key+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+new DecimalFormat("#.##").format(avg);
	
	}
	
	@Override
	public int compareTo(SungJukDTO dto) {
//		if(tot < dto.tot) return 1;
//		else if(tot == dto.tot) return 0;
//		else if(tot > dto.tot) return -1;
		//return name.compareTo(dto.getName());//문자는 자체적으로 가지고있음
		
		return tot > dto.tot ?-1:1;

	}

}
