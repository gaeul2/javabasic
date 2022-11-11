package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		//문자열 배열
		char[] alphabets = new char[26];
		char ch = 'A'; // 65 아스키값이용
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch; //A부터 차례로넣으려면 ch값이 증가해야함
		}
		System.out.println(alphabets);
		
		
	}

}
