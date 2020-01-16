package inheritance;

enum EnumColor2{
	RED("»¡°­"),GREEN("ÃÊ·Ï"),BULE("ÆÄ¶û"),MAGENTA("º¸¶ó");
	
	private String colorName;
	
	EnumColor2(String colorName){
		this.colorName = colorName;
	}
	public String getColorName() {
		return colorName;
	}
}
	

public class EnumMain2 {

	public static void main(String[] args) {
		System.out.println(EnumColor2.RED);
		System.out.println();
		
		for(EnumColor2 data : EnumColor2.values()) {
			System.out.println(data+"\t"
							+data.ordinal()+"\t"
							+data.valueOf(data+"")
							+data.getColorName());	
		}

	}

}
