package class_2;

//import static java.lang.Math.*
import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

public class ImportStatic {
	
	public static void main(String[] args) {
		System.out.println("����= "+Math.random());
		System.out.println("����= "+random());
		
		System.out.println("����= "+Math.pow(2,5));
		System.out.println("����= "+pow(2,5));
		
		System.out.println("�Ҽ� ���� 2°�ڸ� = "+ String.format("%.2f", 12.34567));
		System.out.println("�Ҽ� ���� 2°�ڸ� = "+ format("%.2f", 12.34567));
		out.println("���");
		
	}
}
