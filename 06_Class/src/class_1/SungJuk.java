package class_1;

public class SungJuk {
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private char grade;

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

	public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}

	public void calc() {

		tot = kor + eng + math;
		avg = ((int)((tot / 3.0)*100))/100.0;
		if ((int) avg <= 100 && (int) avg >= 90) {
			grade = 'A';
		}else if((int) avg >= 80) {
			grade = 'B';
		}else if((int) avg >= 70) {
			grade = 'C';
		}else if((int) avg >= 60) {
			grade = 'D';
		}else grade = 'F';
	}

}
