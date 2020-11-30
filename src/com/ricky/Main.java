package com.ricky;

import java.util.ArrayList;
import java.util.List;

public class Main {

//	public Main() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teachers lizzy = new Teachers(1,"Lizzy",500);
		Teachers mellisa = new Teachers(2,"Mellisa",700);
		Teachers vanderhorn = new Teachers(3,"Vanderhorn",600);
		
		List<Teachers> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);
		
		Students tamasha = new Students(1, "Tamasha",4);
		Students rakshith = new Students(2,"Rakshith",12);
		Students rabbi = new Students(3,"Rabbi",5);
		List<Students> studentList = new ArrayList<>();
		
		studentList.add(tamasha);
		studentList.add(rabbi);
		studentList.add(rakshith);
		
		School ghs = new School(teacherList,studentList);
		System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
	}
}