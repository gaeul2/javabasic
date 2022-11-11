package array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("aaa");
		arrayList.add("bbb");
		arrayList.add("ccc");
		
//		for (String elem:arrayList) {
//			System.out.print(elem +", ");
//		}
		for (int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	
	
	
	}
}
