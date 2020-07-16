package com.javalec.robot;

public abstract class Robot {
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("걸을 수 있습니다.");
	}
	
	public void actionRun() {
		// TODO Auto-generated method stub
		System.out.println("달릴 수 있습니다.");
	}
	
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("외형은 머리, 몸통, 팔, 다리가 있습니다.");
	}
	
	public abstract void actionFly();
	public abstract void actionMisail();
	public abstract void actionKnife();
}
