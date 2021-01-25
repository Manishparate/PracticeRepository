package com.manish.demo;

public class Test {
	public static void dev1() {
		System.out.println("from dev1");
	}
	public static void main(String[] args) {
		System.out.println("from Dev1");
		System.out.println("from TL");
		dev1();
		dev2();
	}
	public static void dev2() {
		
	}
}
