package inheritance;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽을 수 있음");
	}
}

class Cat extends Animal{
	public void move() {
		System.out.println("고양이가 네발로 걸어갑니다.");
	}
	
	public void climing() {
		System.out.println("고양이가 벽을 탑니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 납니다.");
	}
}




public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Cat());
		test.moveAnimal(new Eagle());
	}

	public void moveAnimal(Animal animal) {
		animal.move();
		
		//다운캐스팅. animal을 상속받았지만 move()처럼 오버라이딩할 수 없을때
		// 다운캐스팅 사용
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		else if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.climing();
		}
		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
		}
}
		
		
}

