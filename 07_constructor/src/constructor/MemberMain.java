package constructor;

import java.util.Scanner;

public class MemberMain {
	// ������ ���
	MemberDTO[] mDTO = new MemberDTO[5];

	public void menu() {
		Scanner sc = new Scanner(System.in);
		String choice;
		int count = 0;
		
		
		LOOP: while (true) {
			System.out.println("***********");
			System.out.println("  1. ����");
			System.out.println("  2. ���");
			System.out.println("  3. ����");
			System.out.println("  4. Ż��");
			System.out.println("  5. ������");
			System.out.println("***********");
			System.out.print(" ��ȣ : ");
			choice = sc.next();

			switch (choice) {
			case "1":
				count = insert(count,sc);
				break;
			case "2":
				list();
				break;
			case "3":
				update(sc);
				break;
			case "4":
				count = delete(count,sc);
				break;
			case "5":
				sc.close();
				System.out.println("���α׷� ����");
				break LOOP;
			default:
				System.out.println("�Է��� �ٸ��� �ʽ��ϴ�.");
			}
		}
		
	}
	public int insert(int count,Scanner sc) {
		int i = 0;
		for(; i<mDTO.length; i++) { //����� ã��
			if(mDTO[i] == null) break;
		}
		if (i >= 5) {
			System.out.println("5���� ������ �� á���ϴ�...");
			
		}else {
			System.out.print("�̸� �Է� : ");
			String name = sc.next();
			System.out.print("���� �Է� : ");
			String age = sc.next();
			System.out.print("�ڵ��� �Է� : ");
			String phon = sc.next();
			System.out.print("�ּ� �Է� : ");
			String addr = sc.next();
			mDTO[i] = new MemberDTO(name, age, phon, addr);
			
			System.out.println("1 row created");
			System.out.println(mDTO.length-++count+"�ڸ� ���ҽ��ϴ�");
		}
		return count;
	}

	public void list() {
		
		System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
		for(int i = 0; i<mDTO.length; i++) {
			if(mDTO[i] != null)
			System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
					"\t" +mDTO[i].getPhon() + "\t"+ mDTO[i].getAddr());
		}
		System.out.println();
	}

	public void update(Scanner sc) {

		System.out.println("�ڵ��� ��ȣ �Է�: ");
		String check_phon = sc.next();
		for (int i = 0; i < mDTO.length; i++) {
			if (mDTO[i] != null && check_phon.equals(mDTO[i].getPhon())) {
				System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
						"\t" + mDTO[i].getPhon() + "\t"	+ mDTO[i].getAddr());
				System.out.print("���� �� �̸� �Է�: ");
				String name = sc.next();
				System.out.print("���� �� ���� �Է�: ");
				String age = sc.next();
				System.out.print("���� �� �ڵ��� �Է�: ");
				String phon = sc.next();
				System.out.print("���� �� �ּ� �Է�: ");
				String addr = sc.next();
				mDTO[i] = new MemberDTO(name, age, phon, addr);
				System.out.println("1 row(s) updated");
				return;
			}
		}
		System.out.println("ã�� ȸ���� �����ϴ�.");
	}

	public int delete(int count,Scanner sc) {
		System.out.print("�ڵ��� ��ȣ �Է�: ");
		String check_phon = sc.next();
		for (int i = 0; i < mDTO.length; i++) {
			if (mDTO[i] != null && check_phon.equals(mDTO[i].getPhon())) {
				System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
						"\t" + mDTO[i].getPhon() + "\t\t"	+ mDTO[i].getAddr());
				System.out.println("1 row deleted");
				mDTO[i] = null;
				count--;
				return count;
			}
		}
		System.out.println("ã�� ȸ���� �����ϴ�.");
		return count;
	}

	

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.menu();
	}
	
//------------------ set�� ����ϸ� �ʵ忡 MemberDTO�Ⱦ��� Ǯ��� ----------------
/*		int cnt = 0; //����� ����ڰ� ���ԵǾ��ִ��� Ȯ���ϴ� ����
		public void menu() {
		MemberDTO[] mDTO = new MemberDTO[5];
		
		Scanner sc = new Scanner(System.in);
		String choice;
		for(;;) {
			System.out.println("***********");
			System.out.println("  1. ����");
			System.out.println("  2. ���");
			System.out.println("  3. ����");
			System.out.println("  4. Ż��");
			System.out.println("  5. ������");
			System.out.println("***********");

			System.out.print(" ��ȣ : ");
			choice = sc.next();
			
			if(choice.equals("1")) {
				insert(mDTO,sc);
			}else if(choice.equals("2")) {
				list(mDTO);
			}else if(choice.equals("3")) {
				update(mDTO,sc);
			}else if(choice.equals("4")) {
				delete(mDTO,sc);
			}else if(choice.equals("5")) {
				sc.close();
				System.out.println("���α׷� ����");
				break;
			}else {
				
			}
		}
	}  
		public void insert(MemberDTO[] mDTO,Scanner sc) {
			if(cnt == 5) {
				System.out.println("5���� ������ �� á���ϴ�...");
			}else {
				mDTO[cnt] = new MemberDTO();
				System.out.print("�̸� �Է�: ");
				mDTO[cnt].setName(sc.next()); 
				System.out.print("���� �Է�: ");
				mDTO[cnt].setAge(sc.next()); 
				System.out.print("�ڵ��� �Է�: ");
				mDTO[cnt].setPhon(sc.next()); 
				System.out.print("�ּ� �Է�: ");
				mDTO[cnt].setAddr(sc.next());
				System.out.println("1 row created");
				cnt++;
				System.out.println(mDTO.length-cnt+"�ڸ� ���ҽ��ϴ�");
			}
		}
		public void list(MemberDTO[] mDTO) {
			System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
			for(int i = 0; i<cnt;i++) {
				System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
						"\t" +mDTO[i].getPhon() + "\t"+ mDTO[i].getAddr());
			}
		}
		public void update(MemberDTO[] mDTO, Scanner sc) {
			System.out.print("�ڵ��� ��ȣ �Է�: ");
			String check_phon = sc.next();
			for(int i = 0; i<cnt; i++) {
				if(check_phon.equals(mDTO[i].getPhon())) {
					System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
							"\t" + mDTO[i].getPhon() + "\t"+ mDTO[i].getAddr());
					System.out.print("���� �� �̸� �Է�: ");
					mDTO[i].setName(sc.next());
					System.out.print("���� �� ���� �Է�: ");
					mDTO[i].setAge(sc.next());
					System.out.print("���� �� �ڵ��� �Է�: ");
					mDTO[i].setPhon(sc.next());
					System.out.print("���� �� �ּ� �Է�: ");
					mDTO[i].setAddr(sc.next());
					
					System.out.println("1 row(s) updated");
					break;
				}else if(i == cnt-1) {
					System.out.println("ã�� ȸ���� �����ϴ�.");
				}
			}
		}
		
		public void delete(MemberDTO[] mDTO, Scanner sc) {

			System.out.print("�ڵ��� ��ȣ �Է�: ");
			String check_phon = sc.next();
			for(int i = 0; i<cnt; i++) {
				if(check_phon.equals(mDTO[i].getPhon())) { //�Է°��̶� ��ġ�ϴ� �ڵ�����ȣ�� ������
					mDTO[i] = null;
					System.out.println("1 row(s) delete");
					for(int n = i; n< cnt; n++) { 
						if(n<4)	mDTO[n] = mDTO[n+1];
					}
					cnt--;
					break;
				}else if(i == cnt-1) {
					System.out.println("ã�� ȸ���� �����ϴ�.");
				}
			}
		}*/
}
