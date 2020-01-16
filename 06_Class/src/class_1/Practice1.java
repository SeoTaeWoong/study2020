package class_1;

public class Practice1 {
	public static void main(String[] args) {
		BookShop[] bs = new BookShop[2];
		
		for(int i = 0; i<bs.length; i++) {
			bs[i] = new BookShop();
		}
		bs[0].setBookName("자바완성");
		bs[0].setAuthor("김완성");
		bs[0].setPrice(25000);
		
		bs[1].setBookName("JSP잡기");
		bs[1].setAuthor("송JP");
		bs[1].setPrice(35000);
		
		for(BookShop data : bs) {
			System.out.println("책이름: "+data.getBookName());
			System.out.println("저   자: "+data.getAuthor());
			System.out.println("가   격: "+data.getPrice());
			System.out.println();
		}
		
		
	}
}
