package singleton;

public class ComapanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1 = Company.getInstance();
		
		Company c2 = Company.getInstance();
		
		//두번불러와서 주소값 출력해보기
		
		System.out.println(c1);
		System.out.println(c2);
		//주소값 동일한걸 알 수 있음.
		
	}

}
