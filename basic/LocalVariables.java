package com.courses.java8.basic;

public class LocalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
//		System.out.println(onlyOneBranch);  //no esta inicializada
	}


}
