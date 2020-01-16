package abstract_01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat();
		//3�ڸ����� ,��� �Ҽ����� 3°�ڸ�
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##��");
		//��ȿ���ڰ� �ƴѰ��� ǥ������ �ʴ´�
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		//0�� ������ ǥ��
		NumberFormat nf3 = new DecimalFormat("#,###.00��");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance();//�޼ҵ带 �̿��� ����
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.CHINA); //��ǥ��
		nf4.setMaximumFractionDigits(2);
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
		
		
	}

}
