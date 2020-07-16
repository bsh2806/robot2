package com.javalec.robot;

import com.javalec.robot.inter.FlyNo;
import com.javalec.robot.inter.FlyYes;
import com.javalec.robot.inter.KnifeLazer;
import com.javalec.robot.inter.KnifeNo;
import com.javalec.robot.inter.KnifeWood;
import com.javalec.robot.inter.MisailNo;
import com.javalec.robot.inter.MisailYes;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("SuperRobot을 만들어주세요.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		superRobot.setMisail(new MisailYes());
		superRobot.actionMisail();
		superRobot.setKnife(new KnifeLazer());
		superRobot.actionKnife();
		
		System.out.println("--------------------------------------");
		System.out.println("StandardRobot을 만들어주세요.");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.setFly(new FlyNo());
		standardRobot.actionFly();
		standardRobot.setMisail(new MisailYes());
		standardRobot.actionMisail();
		standardRobot.setKnife(new KnifeWood());
		standardRobot.actionKnife();
		
		System.out.println("--------------------------------------");
		System.out.println("LowRobot을 만들어주세요.");
		Robot lowRobot = new LowRobot();
		lowRobot.shape();
		lowRobot.actionWalk();
		lowRobot.actionRun();
		lowRobot.setFly(new FlyNo());
		lowRobot.actionFly();
		lowRobot.setMisail(new MisailNo());
		lowRobot.actionMisail();
		lowRobot.setKnife(new KnifeNo());
		lowRobot.actionKnife();
	}
}
