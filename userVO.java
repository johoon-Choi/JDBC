package johoon;

public class userVO {
	private int num;
	private String name;
	private String addr;
	private String tel;
	private String date;
	
	public userVO() {
		this.num = 0;
		this.name = this.addr = this.tel = this.date = "No value";
	}

	public userVO(String name, String addr, String tel, String date) {
		super();
		this.num = 0;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.date = date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return " UserVO\n\t num=" + num 
				+ "\n\t name=" + name 
				+ "\n\t addr=" + addr 
				+ "\n\t tel=" + tel 
				+ "\n\t date=" + date;
	}
}
