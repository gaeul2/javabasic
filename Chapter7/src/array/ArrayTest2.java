package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];
		int size = 0; //값이들어있는 사이즈를 알기위함
		
		num[0] = 1; size++;
		num[1] = 2; size++;
		num[2] = 3; size++;
		
		double total = 1;
		for (int i=0; i<size; i++) {
			total *= num[i];
		}
		System.out.println(total);
	}

}
