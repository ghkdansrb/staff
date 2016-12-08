package dto;

public class School {
	private int no;
	private String graduate;
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public School(int no, String graduate) {
		super();
		this.no = no;
		this.graduate = graduate;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getGraduate() {
		return graduate;
	}
	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}

	@Override
	public String toString() {
		return "School [no=" + no + ", graduate=" + graduate + "]";
	}
	
}
