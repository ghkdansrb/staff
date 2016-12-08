package dto;

public class Staff {
	private int no;
	private	String name;
	private String sn;
	private String graduateday;
	private School school;
	private Religion religion;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int no, String name, String sn, String graduateday, School school, Religion religion) {
		super();
		this.no = no;
		this.name = name;
		this.sn = sn;
		this.graduateday = graduateday;
		this.school = school;
		this.religion = religion;
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
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getGraduateday() {
		return graduateday;
	}
	public void setGraduateday(String graduateday) {
		this.graduateday = graduateday;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Religion getReligion() {
		return religion;
	}
	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	@Override
	public String toString() {
		return "Staff [no=" + no + ", name=" + name + ", sn=" + sn + ", graduateday=" + graduateday + ", school="
				+ school + ", religion=" + religion + "]";
	}
	
	
}
