package class_1;

public class Practice1 {
	public static void main(String[] args) {
		BookShop[] bs = new BookShop[2];
		
		for(int i = 0; i<bs.length; i++) {
			bs[i] = new BookShop();
		}
		bs[0].setBookName("�ڹٿϼ�");
		bs[0].setAuthor("��ϼ�");
		bs[0].setPrice(25000);
		
		bs[1].setBookName("JSP���");
		bs[1].setAuthor("��JP");
		bs[1].setPrice(35000);
		
		for(BookShop data : bs) {
			System.out.println("å�̸�: "+data.getBookName());
			System.out.println("��   ��: "+data.getAuthor());
			System.out.println("��   ��: "+data.getPrice());
			System.out.println();
		}
		
		
	}
}
