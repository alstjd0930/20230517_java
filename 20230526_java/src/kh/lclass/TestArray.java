package kh.lclass;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = new String[3];
		strArr[0] = "apple";
		strArr[1] = "banana";
		strArr[2] = "mango";
		// strArr 복사 > strCopyArr 생성
		String[] strCopyArr = new String[strArr.length];
		for(int i = 0 ; i< strArr.length; i++) {
			strCopyArr[i]= strArr[i];
		}
		strArr[2]= "orange";
		strCopyArr[1]= "딸기";
		for(int i = 0 ; i < strArr.length ; i++) {
			System.out.println(strArr[i] + " ; " + strCopyArr[i]);
		}
		System.out.println("==========");
		
		String[] strCoptArr2 = Arrays.copyOf(strArr, 3);
		for(int i=0 ; i< strCoptArr2.length ; i++) {
			System.out.println(strCoptArr2[i]);
		}
			System.out.println("==========");
			String[] strCopyArr3 = new String[5];
			System.arraycopy(strArr, 1, strCopyArr3, 0, 2);
		
		String[] strArr2 = {"apple","banana",new String("mango")};
		String[] strArr3 = {"apple","banana",new String("mango")};
		String[] strArr4 = {"apple","banana",new String("mango")};
		String[] strArr5 = {"apple","banana",new String("mango")};
	//	System.out.println(strArr[0]);
		System.out.println("strArr의 0번째 과일은"+ strArr[0]);
		System.out.println("strArr의 1번째 과일은"+ strArr[1]);
		System.out.println("strArr의 2번째 과일은"+ strArr[2]);
		
		for(int i =0 ; i <strArr.length ; i++) {
			System.out.println("strArr의 "+i+"번째 과일은 "+ strArr[i]);
			
		}

		
		
		int intArr[] =new int[3];
		System.out.println(intArr[1]);
		
		int[] intArr2 = new int[]{1,2,3};
		int[] intArr3 = {1,2,3};
		
		
		
	}

}
