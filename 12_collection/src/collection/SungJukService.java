package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();;
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		int num=0;
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.�˻�");
			System.out.println("4.����");
			System.out.println("5.����");
			System.out.println("6.��");
			System.out.println("************");
			System.out.print("��ȣ : ");
			num = sc.nextInt();
			if (num == 6) break;
			
			if(num==1) insertArticle();
			else if(num==2) printArticle();
			else if(num==3) searchArticle();
			else if(num==4) deleteArticle();
			else if(num==5) sortArticle();
			else {
				System.out.println("1~6�߿� �����ϼ���");
			}
		}//while
	
	}
	private void insertArticle() {
		SungJukDTO sjd = new SungJukDTO();
		
		System.out.print("��ȣ �Է� : ");
		sjd.setKey(sc.nextInt());
		System.out.print("�̸� �Է� : ");
		sjd.setName(sc.next());
		System.out.print("���� �Է� : ");
		sjd.setKor(sc.nextInt());
		System.out.print("���� �Է� : ");
		sjd.setEng(sc.nextInt());		
		System.out.print("���� �Է� : ");
		sjd.setMath(sc.nextInt());
		
		//sjd.calc();
		list.add(sjd);
		System.out.println("�Է� �Ϸ�");

	}
	
	private void printArticle() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for(SungJukDTO dto : list) {
			dto.calc();
//			System.out.println(dto.getKey()+"\t"+ dto.getName()+"\t"+dto.getKor()+"\t"+dto.getEng()+"\t"+dto.getMath()+"\t"+dto.getTot()
//			+"\t"+dto.getAvg());
			System.out.println(dto);
		}
	}

	private void searchArticle() {
		
		System.out.print("ã�� �̸� �Է� : ");
		String name = sc.next();
		int cnt = 0;
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
				System.out.println(dto);
				cnt++;
			}
		}
		if(cnt==0)System.out.println("ã�� ȸ���� �����ϴ�.");

	}
	private void deleteArticle() {
		System.out.println("������ ȸ�� �̸� �Է� : ");
		String name = sc.next();
		int cnt=0;
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
		
			if(dto.getName().equals(name))  {
				it.remove();
				cnt++;
			}
		}if(cnt==0) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}else System.out.println(name+"�����Ǿ����ϴ�");
	}
	
	
	private void sortArticle() {
		int num =0;
		while(true) {
			System.out.println("1.�̸����� ��������");
			System.out.println("2.�������� ��������");
			System.out.println("3.�����޴�");
			System.out.println("��ȣ �Է� : ");
			num = sc.nextInt();
			if(num==3) break;
			if(num==1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}
					
				};
				Collections.sort(list,com);
				printArticle();
				
			}
			else if(num==2){
				Collections.sort(list);
				printArticle();
			}
		}
			
	}
	
}

	


