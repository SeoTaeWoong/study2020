package inheritance;

import java.util.Scanner;

public class SalaryManager {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		EmployeeDTO[] eDTO = new EmployeeDTO[5];
		while (true) {
			System.out.println("*************************");
			System.out.println("\t1.���");
			System.out.println("\t2.���");
			System.out.println("\t3.����");
			System.out.println("\t4.�˻�");
			System.out.println("\t5.����");
			System.out.println("*************************");
			System.out.print("  >> ");
			switch(sc.nextInt()) {
			case 1:
				cnt = input(sc,eDTO,cnt);
				break;
			case 2:
				output(eDTO,cnt);
				break;
			case 3:
				update(sc,eDTO,cnt);
				break;
			case 4:
				search(sc,eDTO,cnt);
				break;
			case 5:
				return;
			default :
				System.out.println("**�Է°��� �ٸ��� �ʽ��ϴ�.**");
			}
			System.out.println();
		}
	}
	public int input(Scanner sc, EmployeeDTO[] eDTO,int cnt) {
		eDTO[cnt] = new EmployeeDTO();
		System.out.print("�̸� �Է�: ");
		eDTO[cnt].setName(sc.next());
		System.out.print("���� �Է�: ");
		eDTO[cnt].setRank(sc.next());
		System.out.print("�⺻�� �Է�: ");
		eDTO[cnt].setPay(sc.nextInt());
		System.out.print("���� �Է�: ");
		eDTO[cnt].setExtraPay(sc.nextInt());
		
		return ++cnt;
		
	}
	public void output(EmployeeDTO[] eDTO, int cnt) {
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����");
		if(cnt == 0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		} 
		for(int i = 0; i<cnt; i++) {
			System.out.println(eDTO[i].getName()+"\t"+eDTO[i].getRank()+"\t"+eDTO[i].getPay()+"\t"+eDTO[i].getExtraPay()+"\t"+eDTO[i].getTax()+"\t"+eDTO[i].getSalary());
		}
	}
	public void update(Scanner sc,EmployeeDTO[] eDTO,int cnt) {
		System.out.println("�̸� �Է�: ");
		String check= sc.next();
		for(int i = 0; i<cnt; i++) {
			if(check.equals(eDTO[i].getName())) {
				System.out.print("������ ���� �Է�: ");
				eDTO[i].setRank(sc.next());
				System.out.print("������ �⺻�� �Է�: ");
				eDTO[i].setPay(sc.nextInt());
				System.out.print("������ ���� �Է�: ");
				eDTO[i].setExtraPay(sc.nextInt());
			}
		}
	}
	public void search(Scanner sc,EmployeeDTO[] eDTO, int cnt) {
		System.out.println("�̸� �Է�: ");
		String check= sc.next();
		if(cnt == 0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		} 
		for(int i = 0; i<cnt; i++) {
			if(check.equals(eDTO[i].getName())) {
				System.out.println("�̸�\t����\t�⺻��\t����\t����\t����");
				System.out.println(eDTO[i].getName()+"\t"+eDTO[i].getRank()+"\t"+eDTO[i].getPay()+"\t"+eDTO[i].getExtraPay()+"\t"+eDTO[i].getTax()+"\t"+eDTO[i].getSalary());
				return;
			}
		}
		System.out.println("ã���ô� ������ ���� �����Դϴ�.");
	}
}
