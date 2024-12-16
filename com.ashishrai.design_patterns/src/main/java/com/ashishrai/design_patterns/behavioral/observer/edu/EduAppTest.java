
package com.ashishrai.design_patterns.behavioral.observer.edu;

import com.ashishrai.design_patterns.behavioral.observer.Observer;

public class EduAppTest {

	public static void main(String[] args) {

		EduApp myEduApp = new EduApp();
		Observer student1 = new Student("George");
		Observer student2 = new Student("Martina");
		Observer student3 = new Student("Lily");
		Observer student4 = new Student("Christopher");
		Observer student5 = new Student("Kevin");
		Observer student6 = new Student("Igor");
		myEduApp.register(student1);
		myEduApp.register(student2);
		myEduApp.register(student3);
		myEduApp.register(student4);
		myEduApp.setTopic("Learn Java introduction");
		System.out.println("-------------------------------");
		myEduApp.setTopic("Learn Java OOPS");
		System.out.println("-------------------------------");
		myEduApp.unregister(student4);
		myEduApp.setTopic("Learn Java Advanced");
		System.out.println("-------------------------------");
		myEduApp.unregister(student2);
		myEduApp.register(student5);
		myEduApp.register(student6);
		myEduApp.setTopic("Learn Java Spring and Spring Boot");
		System.out.println("-------------------------------");
		myEduApp.setTopic("Learn Java Microservices");
	}
}
