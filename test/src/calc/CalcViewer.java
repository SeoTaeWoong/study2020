package calc;

import java.util.Scanner;

public class CalcViewer {
	// ���� ���� ���� ������ ȭ�� �޴�
	// -----------------------
	// +(��) -(��) *(��) /(����) %(������) D(�ʱ�) E(����))
	// > �Է¼��� ȭ�����
	// ��������
	// -----------------------
	
	
	public static void viewer() {
		CalcDTO cDTO = new CalcDTO();
		CalcFunction cF = new CalcFunction();
		Scanner sc = new Scanner(System.in);

		// while('E') {
		while (true) {

			System.out.println("\t\t********************");
			System.out.println("\t\t********����********");
			System.out.println("\t\t********************");

			System.out.println("\t\t (+) (-) (*) (/) (%) ");
			System.out.println("\t\t   (D)�ʱ�ȭ (E)����");
			System.out.print("\t\t�� > ");
			cDTO.EXPLANATION = sc.nextLine();
			cDTO.RESULT = cF.decomposition(cDTO.EXPLANATION);
			
			System.out.println("\t\t�� > "+ cDTO.RESULT);
			
			
		}
	}

}
