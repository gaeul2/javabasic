package array;

public class BookArray {

	public static void main(String[] args) {

//		배열 선언하는것과 같고 자료형이 객체일뿐
		Book[] library = new Book[5];
		/* 이렇게 선언한다고해서 메모리값이나, 인스턴스가 빡 만들어지는것이 아니라
		 * 이 인스턴스가 들어갈 메모리 주소자리가 생기는것.
		 * 따라서 배열선언했다고 객체5개 생성되는것이 아님. 주소가 들어갈 자리만 생긴것
		 * 따라서 배열만들고 객체를 각각 생성해서 배열에 넣어줘야함.*/
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데이안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		
		for (int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	
		
	}

}
