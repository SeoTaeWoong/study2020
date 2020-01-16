package abstract_01;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("���ó�¥ : "+date);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y�� MM�� dd�� E���� H:m:s");
		
		System.out.println("���ó�¥ : "+simpleDateFormat.format(date));
		System.out.println();
		
		//������ - 1991 07 16
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910716103515");
		
		System.out.println("������ : "+birth);
		System.out.println("������ : "+simpleDateFormat.format(birth));
		
		//Calendar cal = new Calendar(); �߻�Ŭ������ ������
		//Calendar cal = new GregorianCalendar();//sub class�� �̿��� ����
		Calendar cal = Calendar.getInstance();//�޼ҵ带 �̿��� ����
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//1��~0
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);//�Ͽ��� ���� 1
		
		String dayOfweek=null;
		switch(week) {
			case 1 : dayOfweek="�Ͽ���"; break;
			case 2 : dayOfweek="������"; break;
			case 3 : dayOfweek="ȭ����"; break;
			case 4 : dayOfweek="������"; break;
			case 5 : dayOfweek="�����"; break;
			case 6 : dayOfweek="�ݿ���"; break;
			case 7 : dayOfweek="�����"; break;
		}
		System.out.println("���ó�¥"+year+"��"
							+month+"��"
							+day+"��"
							+dayOfweek);
		
	}

}
