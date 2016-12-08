package dto;

public class Religion {
	private int no;
	private String name;
	
	public Religion() {
		super();
	}
	
	public Religion(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Religion [no=" + no + ", name=" + name + "]";
	}
	
}