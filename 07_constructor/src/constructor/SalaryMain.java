package constructor;

import java.text.DecimalFormat;

public class SalaryMain {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		SalaryDTO[] sDTO = new SalaryDTO[3];
		sDTO[0] = new SalaryDTO("ȫ�浿","����",5000000,200000);
		sDTO[1] = new SalaryDTO("���缮","����",3500000,150000);
		sDTO[2] = new SalaryDTO("�ڸ��","���",1800000,100000);
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����\t ����");
		for(SalaryDTO data : sDTO) {
			data.calc();
			System.out.println(data.getName()+"\t"+data.getPosition()+"\t"+data.getBasePay()+"\t"+data.getBenefit()+"\t"+df.format((data.getTaxRate()*100))+"%\t"+df.format(data.getTax())+"\t "+df.format(data.getSalary())+"\t");
		}
	}
}
