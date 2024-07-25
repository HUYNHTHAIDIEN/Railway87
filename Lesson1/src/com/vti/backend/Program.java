package com.vti.backend;

import java.util.Date;

public class Program {
  public static void main (String[] args) {
	  
	//create department
	Department department1 = new Department();
	department1.id = 1;
	department1.departmentName = "QA";
	
	Department department2 = new Department();
	department2.id = 2;
	department2.departmentName = "QC";
	
	//create position
	Position position1 = new Position();
	position1.positionId = 1;
	position1.positionName = "Manager";
	
	Position position2 = new Position();
	position2.positionId = 2;
	position2.positionName = "Supervisor";
		
    System.out.println("ID:" + department1.id);
    System.out.println("Name:" + department1.departmentName);
    
  //create user
  	User user1 = new User();
  	user1.Id = 1;
  	user1.userName = "Huynh Thai Dien";
  	user1.Email = "huynhthaidien@gmail.com";
  	user1.department = department1;
  	user1.gender = Gender.MALE;
  	user1.dateofBirth = new Date("2024/07/19");
  	System.out.println("--Thông tin user1--");
  	System.out.println("Id:" + user1.Id);
  	System.out.println("Name:" + user1.userName);
  	System.out.println("Email:" + user1.Email);
  	System.out.println("Gender:" + user1.gender);
  	System.out.println("Date of Birth:" + user1.dateofBirth);

}}