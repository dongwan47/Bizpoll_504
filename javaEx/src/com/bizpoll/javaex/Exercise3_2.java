package com.bizpoll.javaex;

public class Exercise3_2 {

	public static void main(String[] args) {
		// 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를
		// 담을 수 있다면, 몇개의 바구니가 필요한지 코드를
		// 작성하시오.

		//int numOfApple = 121;
		//int sizeOfBucket = 10;

		//int numOfBucket = numOfApple / sizeOfBucket + (numOfApple % sizeOfBucket > 0 ? 1 : 0);

	//	System.out.println("필요한 바구니의 수 : " + numOfBucket);

		//int a = (5 < 4) ? 100 : 40;

		//System.out.println(a);

		// 사과의 수가 50개이고 하나의 바구니에는 3개의 사과를
		// 담을 수 있다면, 몇개의 바구니가 필요한지 코드를
		// 작성하시오.
		
		int numOfApple = 50;
		int sizeOfBucket = 3;

		int numOfbucket = numOfApple / sizeOfBucket + (numOfApple % sizeOfBucket > 0 ? 2 : 0);
		
		System.out.println(numOfbucket);
	
	}

}