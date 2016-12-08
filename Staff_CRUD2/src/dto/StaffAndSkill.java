package dto;

public class StaffAndSkill {
	private int no;
	private Staff staff;
	private Skill skill;
	public StaffAndSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffAndSkill(int no, Staff staff, Skill skill) {
		super();
		this.no = no;
		this.staff = staff;
		this.skill = skill;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "StaffSkill [no=" + no + ", staff=" + staff + ", skill=" + skill + "]";
	}
	
}
