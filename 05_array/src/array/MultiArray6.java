package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class MultiArray6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] name;
		int cnt = 0;
		int subjectCnt = 0;
		String[][] subject = null;
		double[][] jumsu = null;
		int sum[];
		double avg[];
		
		System.out.print("�ο���: ");
		cnt = Integer.parseInt(br.readLine());
		name = new String[cnt];
		sum = new int[cnt];
		avg = new double[cnt];
		subject = new String[cnt][]; // �����
		jumsu = new double[cnt][]; // ��������
		for (int i = 0; i < cnt; i++) {
			System.out.println();
			System.out.print("�̸� �Է�: ");
			name[i] = br.readLine();
			System.out.print("����� �Է� : ");
			subjectCnt = Integer.parseInt(br.readLine()); //�����
			subject[i] = new String[subjectCnt];
			jumsu[i] = new double[subjectCnt+2];
			
			for (int j = 0; j < subject[i].length; j++) {				
				System.out.print("����� �Է� : ");
				subject[i][j] = br.readLine();
				
			}
			for(int j = 0; j<subjectCnt; j++) {
				System.out.print(subject[i][j]+" ���� �Է�: ");
				jumsu[i][j] = Double.parseDouble(br.readLine());
				jumsu[i][subjectCnt] += jumsu[i][j]; 
			}
			jumsu[i][subjectCnt+1] =jumsu[i][subjectCnt]/subjectCnt; 
		}
		for(int i = 0; i< cnt; i++) {
			System.out.print("�̸�\t");
			for(int j=0;j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("����\t���");
			
			System.out.print(name[i]+"\t");
			for(int j =0; j<jumsu[i].length-1;j++) {
				System.out.print((int)jumsu[i][j]+"\t");
			}
			
			System.out.println(String.format("%.2f \t", jumsu[i][jumsu[i].length-1]));
			System.out.println();
		}
		
	}
}
//��������
/* �ο���:2(cnt)
* 
* �̸��Է�: ȫ�浿(name)
* ����� �Է� :2 (subjectCnt)
* ����� �Է� : ����(subject)
* ����� �Է�: ����
* ���� ���� �Է�:95 (jumsu)
* ���� ���� �Է� : 100
* -------------
* �̸��Է�: ����(name)
* ����� �Է� :3 (subjectCnt)
* ����� �Է� : ����(subject)
* ����� �Է� : ����
* ����� �Է� : ����
* ���� ���� �Է�:95 (jumsu)
* ���� ���� �Է� : 100
* ���� ���� �Է� : 78
* 
* 
* 
* �̸�	����	����	����	���
* ȫ�浿	95	100	xxx	xx.xx

* 
* ȫ�浿	95	100	80	xxx xx.xx
*/