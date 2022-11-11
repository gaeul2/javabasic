package singleton;

public class Company {
	
	private static Company instance = new Company();
	//생성을 여기서함. 그다음 이것만 쓸것임. 외부에서는 생성못하니까
	//그리고 또한 private로 해놓고 하나만 쓸꺼니까 static선언
	
	//생성 함부로 못하게 해놓고
	private Company(){}
	
	//생성한걸 가져다 사용해야하므로 가져다쓸수있는 메서드 만들어줌
	//외부접근 허용/ 객체생성없이 가져다쓰도록/ 리턴타입/ 메서드명
	public static Company getInstance() {
		//이건 선택이나 방어적인 코드로 짜면
		if (instance == null)
			instance = new Company();
		return instance;
	}
	//static을 선언해야 객체생성없이 메서드 불러서 쓸수있음
}
