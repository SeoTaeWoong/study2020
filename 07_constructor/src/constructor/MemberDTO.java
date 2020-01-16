package constructor;

public class MemberDTO {
	private String name;
	private String age;
	private String phon;
	private String addr;
	
	public MemberDTO() {
		
	}
	public MemberDTO(String name, String age, String phon, String addr) {
		this.name = name;
		this.age = age;
		this.phon = phon;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getPhon() {
		return phon;
	}
	public String getAddr() {
		return addr;
	}
	////////// 셋으로 풀어보기/////////////
	public void setName(String name) {
		this.name = name;
	} 
	public void setAge(String age) {
		this.age = age;
	} 
	public void setPhon(String phon) {
		this.phon = phon;
	} 
	public void setAddr(String addr) {
		this.addr = addr;
	} 
	
	
}
