package day14;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[]args) {
		
		Student s1=new Student("arjun",15,"A1",true);
		Student s2=new Student("kumar",16,"A1",true);
		Student s3=new Student("lokesh",13,"A2",true);
		Student s4=new Student("pavi",17,"A1",false);
		Student s5=new Student("gilbert",18,"A1",true);
		Student s6=new Student("tharani",19,"A1",false);
		
		ArrayList<Student> stu=new ArrayList<>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		stu.add(s6);
		
//		ArrayList<Student> maleStudents=new ArrayList<>();  //finding malestudents
//		
//		stu.forEach(s-> {
//			if(s.getIsMale()==true) {
//				maleStudents.add(s);
//			}
//		});
//		
//		for(Student s:maleStudents) {
//			System.out.println(s);
//		}
		
ArrayList<Student> femaleStudents=new ArrayList<>();  //finding femalestudents
		
		stu.forEach(s-> {
			if(s.getIsMale()==false) {
				femaleStudents.add(s);
			}
		});
		
		for(Student s:femaleStudents) {
			System.out.println(s);
		}
		
		
		
		
		
	}

}
