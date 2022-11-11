package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열생성
		 * 아래와같이 생성할 수 있음
		 * 초기값없이 생성하면 int는 0 double은 0.0, 객체배열은 null로 채워짐*/
//		int[] numbers = new int[5];
//		for (int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		} // 0으로 출력됨
		
		double[] numbers = new double[5];
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}//0.0으로 출력됨
		

		
		
		/* 생성하면서 초기화 하기
		 * 배열길이 넣지 않고, {초기화하면서 넣을값} 넣어줌
		 * 자바에서는 잘 사용하지 않으나
		 * int[] numbers = {1,2,3}; 으로 사용가능 
		 */
//		int[] numbers = new int[] {0,1,2};
//		//배열의 메소드중 길이알아보는 메소드
//		System.out.println(numbers.length);
//		
		/* 혹은 일일이 넣을 수 도 있음.
		 */
//		int[] number_test = new int[3];
//		
//		number_test[0] = 1;
//		number_test[1] = 2;
//		number_test[2] = 3;
//		
//		for(int i=0; i<number_test.length; i++) {
//			System.out.println(number_test[i]);
//		}
		
		/* 선언시 또다른 방법
		 * */
//		int[] numbers;
//		
//		numbers = new int[3];
////		얘까지는 됨
////		numbers = new int [] {1,2,3};
////		그러나 numbers {1,2,3}은안됨. 반드시 배열선언과 같이있어야함
		
	}

}
