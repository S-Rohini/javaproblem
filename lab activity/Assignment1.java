package com;

import java.util.ArrayList;

public class Assignment1 {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> saveEvenNumbers(int N) {
		list = new ArrayList<Integer>();
		for(int i = 2; i <= N;i++) {
			if(i % 2 ==0)
				list.add(i);
		}
		return list;
	}
	public ArrayList<Integer> printEvenNumber() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		return  newList;
	}

	public static void main(String[] args) {
		Assignment1 asg = new Assignment1();
		asg.saveEvenNumbers(10);
		asg.printEvenNumber();
		
	}

}
