package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

//		int[][] arr = new int[2][3];
//		System.out.println(arr.length);//행의 총개수
//		System.out.println(arr[0].length); // 열개수

		int[][] arr = {{1,2,3},{4,5,6}}; 
		/* 이차원배열인 arr의 길이를 출력해보면 2가 나옴.
		 * 행을 기준으로 2개로 나온것*/
		
		//일단 하나의 행을 잡고 열을 돌리는것.
		for (int i=0; i<arr.length; i++) {
			for (int j =0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		char[][] alphabets = new char[13][2];
		char al ='A';
		for (int i=0; i<alphabets.length; i++) {
			for (int j=0; j<alphabets[i].length; j++,al++) {
				alphabets[i][j] = al;
				System.out.print(alphabets[i][j]);
			}
		}
	}

}
