package array;

public class InstanceArrayCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0]=new Book("태백산맥", "조정래");
		bookArray1[1]=new Book("데이안", "헤르만헤세");
		bookArray1[2]=new Book("어떻게 살 것인가", "유시민");
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
	
		bookArray2 = bookArray1;
		
		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		System.out.println("변경점-----------");
		bookArray1[0].setBookName("나무");
		bookArray1[0].setAuthor("베르나르 베르베르");
		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
