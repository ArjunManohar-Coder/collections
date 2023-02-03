package day14;

import java.util.ArrayList;

public class UseBook {
	
	public static void main(String[]args) {
		
		Book b1=new Book("einsten",556,1200,true);
		Book b2=new Book("marvel",120,550,false);
		Book b3=new Book("arjun",50,85,true);
		Book b4=new Book("kumar",65,855,true);
		Book b5=new Book("albert",78,452,false);
		
		ArrayList<Book> bk =new ArrayList<>();
		
		bk.add(b1);
		bk.add(b2);
		bk.add(b3);
		bk.add(b4);
		bk.add(b5);
		
		for(Book i:bk) {
			System.out.println(i);
		}
		
		Book max=bk.get(0);
		for(int i=0;i<bk.size();i++) {
			if(max.getNoOfPages()<bk.get(i).getNoOfPages()) {
				max=bk.get(i);
			}
		}
		System.out.println(max);
		
	
	
	bk.forEach(x-> {
	if(x.getIsStoryBook()==true) {
		System.out.println(x.getAuthor()+" is story book");
	}
	else {
		System.out.println(x.getAuthor()+" is not story book");
	}
});
	
	
	
	
	
}

}
