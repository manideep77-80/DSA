package com.mru.oops;

class Parent11{
	public void m1() {
		System.out.println("-Parent.");
		
	}
}

class Child11 extends Parent11{
	public void m2() {
		System.out.println("-Child.");
	}
}
class subchild extends Child11{
	public void m3() {
		System.out.println("-subchild.");
	}
}
public class OOP2{
	public static void main(String[] args) {
		subchild obj1 = new subchild();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		
		}
	}
