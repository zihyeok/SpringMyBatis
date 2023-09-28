package com.exe.springmybatis;


import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("app-context.xml");
		
		CustomDAO dao = (CustomDAO)context.getBean("customDAO");
		
		CustomDTO dto;
		
		//insert
		/*	
		 dto = new CustomDTO(); 
		 dto.setId(444); 
		 dto.setName("������"); 
		 dto.setAge(46);
		 
		 dao.insertData(dto);
		 
		 System.out.println("insert �Ϸ�....");
		*/
		
		
		//OneSelect
		/*
		dto = dao.getReadData(333);
		
		if (dto!=null) { System.out.printf("%d %s %d\n",
		dto.getId(),
		dto.getName(),
		dto.getAge()); 
		//System.out.println(dto.toString());
		System.out.println("OneSelect �Ϸ�.."); }
		*/
		
		//update
		/*
		dto = new CustomDTO(); 
		dto.setId(444); 
		dto.setName("�����"); 
		dto.setAge(27);
		  
		dao.updateData(dto);
		  
		System.out.println("update �Ϸ�");
		*/
		
		//delete
		//dao.deleteData(111);
		
		
		//select
		List<CustomDTO> lists = dao.getList();
		
		for(CustomDTO dto1 : lists) {
			System.out.printf("%d %s %d\n",
					dto1.getId(),dto1.getName(),dto1.getAge()); 
			
			System.out.println(dto1.toString());
		}
		
		
		
		System.out.println("select �Ϸ�..");
		
	}

}
