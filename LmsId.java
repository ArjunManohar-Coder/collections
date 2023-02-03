package day14;

import java.util.ArrayList;

public class LmsId {
	public static void main(String[]args) {
	
	int id1=542;
	int id2=154;
	int id3=785;
	int id4=455;
	int id5=568;
	
	ArrayList<Integer> ids=new ArrayList<>();
	
	ids.add(id1);
	ids.add(id2);
	ids.add(id3);
	ids.add(id4);
	ids.add(id5);
	
//	for(int i=0;i<ids.size();i++) {                //for
//	 System.out.println(ids.get(i));
//	}
	
//	Integer max=ids.get(0);                        //enhanced for loop
//	for(Integer i:ids) {
//		if(max<i) {
//			max=i;
//		
//		System.out.println(max);
//		}
//	}
	//ids.forEach(x->System.out.println(x));        // foreach LAMDA
	
	
	
	ids.forEach(x-> {                                  //foreach LAMDA using if
		
		if(x%2==0) {
			System.out.println("it is even");
		}
		else {
			System.out.println("it is odd");
		}
	});
	
	
	
	

	}
}
