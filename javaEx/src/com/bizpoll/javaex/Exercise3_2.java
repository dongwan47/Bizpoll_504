package com.bizpoll.javaex;

public class Exercise3_2 {

	public static void main(String[] args) {
		// ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� �����
		// ���� �� �ִٸ�, ��� �ٱ��ϰ� �ʿ����� �ڵ带
		// �ۼ��Ͻÿ�.

		//int numOfApple = 121;
		//int sizeOfBucket = 10;

		//int numOfBucket = numOfApple / sizeOfBucket + (numOfApple % sizeOfBucket > 0 ? 1 : 0);

	//	System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);

		//int a = (5 < 4) ? 100 : 40;

		//System.out.println(a);

		// ����� ���� 50���̰� �ϳ��� �ٱ��Ͽ��� 3���� �����
		// ���� �� �ִٸ�, ��� �ٱ��ϰ� �ʿ����� �ڵ带
		// �ۼ��Ͻÿ�.
		
		int numOfApple = 50;
		int sizeOfBucket = 3;

		int numOfbucket = numOfApple / sizeOfBucket + (numOfApple % sizeOfBucket > 0 ? 2 : 0);
		
		System.out.println(numOfbucket);
	
	}

}