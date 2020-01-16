package inheritance;

public class EmployeeDTO {
	private String name,rank;
	private int pay,extraPay;
	private double tax,salary; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int getExtraPay() {
		return extraPay;
	}
	public void setExtraPay(int extraPay) {
		this.extraPay = extraPay;
	}
	public double getSalary() {
		salary = pay+extraPay-(pay+extraPay)*tax;
		return salary;
	}
	public double getTax() {
		if(pay <= 2000000) {
			tax = 0.01; 
		}else if(pay <= 4000000) {
			tax = 0.02;
		} else if(pay>4000000) {
			tax = 0.03;
		}
		return tax;
	}
	
}
