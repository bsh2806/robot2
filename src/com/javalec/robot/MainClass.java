package com.javalec.robot;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("SuperRobot을 만들어주세요.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMisail();
		superRobot.actionKnife();
		
		System.out.println("--------------------------------------");
		System.out.println("StandardRobot을 만들어주세요.");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly();
		standardRobot.actionMisail();
		standardRobot.actionKnife();
		
		System.out.println("--------------------------------------");
		System.out.println("LowRobot을 만들어주세요.");
		Robot lowRobot = new LowRobot();
		lowRobot.shape();
		lowRobot.actionWalk();
		lowRobot.actionRun();
		lowRobot.actionFly();
		lowRobot.actionMisail();
		lowRobot.actionKnife();
	}
}
