package inheritance;

public class Circle {
	/* 이부분이 Point클래스와 겹친다고해서 상속을 받는것이아님
	 * 점이 추상적이고 원이 구체적인 관계가 아니기때문
	 * 그럼 어떻게하냐? 아래 예시대로*/ 
//	private int x;
//	private int y;
//	
//	private int radius;
	
	/* Circle 클래스안에서 Point를 변수로 선언하여
	 * Circle 생성시 Point를 생성.*/
	Point point; // 애는 상속이아닌 합성.
	/* 상속은 is - a 관계에 사용하고
	 * 합성은 has - a 관계에 사용
	 */
	
	private int radius;
	
	public Circle(){
		point = new Point();
	}
	

}
