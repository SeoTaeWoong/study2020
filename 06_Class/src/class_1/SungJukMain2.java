package class_1;

public class SungJukMain2 {
	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3]; // sungjukŬ����Ÿ�Ը� ���ü��ִ� ������ 3�� ������ (��ü �迭 ����)
		for(int i =0; i < ar.length; i++) {
			ar[i] = new SungJuk();
			ar[i].setName("�����");
			ar[i].setKor(95);
			ar[i].setEng(85);
			ar[i].setMath(97);
			
		}		
		ar[0].setName("ȫ�浿");
		ar[0].setKor(90);
		ar[0].setEng(91);
		ar[0].setMath(100);
		ar[2].setName("zz");
		ar[2].setKor(85);
		ar[2].setEng(96);
		ar[2].setMath(92);
		for(SungJuk data:ar) {
			data.calc();
			System.out.println(data.getName()+"\t"+data.getKor()+"\t"+data.getEng()+"\t"+data.getMath()+"\t"+data.getTot()+"\t"+data.getAvg()+"\t"+data.getGrade());
		}
	}
}
