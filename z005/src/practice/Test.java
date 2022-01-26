package practice;

import java.util.HashMap;

public class Test {
	void run() {
		int n  = 1;
		Integer nn = 1;
		//         키 ,    값
//		            숫자  , 문자
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		
		h.put(11, "고양이");
		h.put(12, "개");
		h.put(13, "너굴맨");
		
		System.out.println(h.get(11));
		
		HashMap<String,String> h2 = new HashMap<>();
		h2.put("C001H001", "고양이");
		h2.put("C001H002", "너굴맨");
		
		System.out.println(h2.get("C001H002"));
		
		HashMap<String,String> products = new HashMap<>();
		products.put("SAMSUNG01", "갤럭시1");
		products.put("SAMSUNG02", "갤럭시2");
		
		System.out.println(products.get("SAMSUNG02"));
		
		HashMap<String,Book> books = new HashMap<>();
		
		Book b1 = new Book("열혈강호",1);
		Book b2 = new Book("고양이",2);
		
		
		books.put("001", b1);
		books.put("002", b2);
		
		String title = books.get("001").getTitle();
		
		System.out.println(title);
	}
}
