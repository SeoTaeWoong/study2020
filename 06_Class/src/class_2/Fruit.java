package class_2;

public class Fruit {
	private String pum;
	private int jan,feb,mar,tot;
	private static int sumJan,sumFeb,sumMar;

	public Fruit(String pum,int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		
		
		
	}
	public Fruit() {
		
	}
	public void display() {
		
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
	}
	public void calcTot() {
		tot=jan+feb+mar;
		sumJan = sumJan+jan;
		sumFeb = sumFeb+feb;
		sumMar = sumMar+mar;
	}
	public static void output() {
		
		System.out.println("\t"+ sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
	
	////////////////////////////////////////////////////////////////
	
	public void setPum(String pum) {
		this.pum=pum;
	}
	public String getPum() {
		return pum;
	}

	public int getJan() {
		return jan;
	}

	public void setJan(int jan) {
		this.jan = jan;
	}

	public int getFeb() {
		return feb;
	}

	public void setFeb(int feb) {
		this.feb = feb;
	}

	public int getMar() {
		return mar;
	}

	public void setMar(int mar) {
		this.mar = mar;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

}
