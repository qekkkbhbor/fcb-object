package tw.com.fcb.music;

public class Music2 {

	private String code;
	private String nameDD;
	private String singerName;	
	private int price;
	private String abc;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return nameDD;
	}
	public void setNameDD(String nameDD) {
		this.nameDD = nameDD;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	@Override
	public String toString() {
		return "Music2 [code=" + code + ", nameDD=" + nameDD + ", singerName=" + singerName + ", price=" + price + ", abc="
				+ abc + "]";
	}

	
}
