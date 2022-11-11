package array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		//변수의 형은 배열원소의 형과 같게 해주면 됨.
		for (String lang : strArray) {
			System.out.println(lang);
		}
		
		int[] numbers = {1,2,3,4};
		
		//변수의 형은 배열원소의 형과 같게 해주면 됨.
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
