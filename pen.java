package day14;

import java.util.ArrayList;


public class pen {
	
	public static void main(String[]args) {
		String pen1="cello";
		String pen2="natraj";
		String pen3="flair";
		String pen4="REYNOLDS";
		String pen5="RORITO";
		
		ArrayList<String> pens=new ArrayList<>();
		
		pens.add(pen1);
		pens.add(pen2);
		pens.add(pen3);
		pens.add(pen4);
		pens.add(pen5);
		//pens.remove(2);
		//pens.add(2,pen5);
		pens.set(2, pen4);
		
//		for(int i=0;i<pens.size();i++) {
//			
//			System.out.println(pens.get(i));
//		}
		
		for(String i:pens) {
		
		System.out.println(i);
	}

}
}
