package day14;

public class Student {
	
	private String name;
	private int rollNo;
	private String section;
	private boolean isMale;
	
	public void setName(String name) {
		System.out.println(name);
	}
	public String getName() {
		return name;
	}
	public void setRollNo(int rollNo) {
		System.out.println(rollNo);
	}
	public int getRollNo() {
		return rollNo;
		
	}
	public void setSection(String section) {
		System.out.println(section);
	}
	public String getSection() {
		return section;
	}
	public void setIsMale(boolean isMale) {
		System.out.println(isMale);
	}
	public boolean getIsMale() {
		return isMale;
	}
	
	public Student(String name,int rollNo,String section,boolean isMale) {
		this.name=name;
		this.rollNo=rollNo;
		this.section=section;
		this.isMale=isMale;
	}
	
	public String toString() {
		return name+rollNo+section+isMale;
	}
	
	
	

}
