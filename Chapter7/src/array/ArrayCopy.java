package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		System.arraycopy(array1, 0, array2, 1, 2);
		for (int i =0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		array1[0]= 11;
		
		System.out.println("=====배열1=====");
		for (int i =0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("=====배열2=====");
		for (int i =0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}

}
