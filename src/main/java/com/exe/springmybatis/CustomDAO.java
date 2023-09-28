package com.exe.springmybatis;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;


public class CustomDAO {
	
	//생성자를 통한 의존성 주입
	private SqlSessionTemplate sessionTemplate;//값을 받아서 초기화할 변수 생성
	
	 //의존성 주입(DI) - 생성자를 통한 / 넘어올 값을 넣어준다.
	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
	
	
	
	public void insertData(CustomDTO dto) {
		
		sessionTemplate.insert("com.custom.insert",dto);
		
	}
	
	public void updateData(CustomDTO dto) {
		
		sessionTemplate.update("com.custom.update",dto);
	}
	
	public void deleteData(int id) {
		
		sessionTemplate.delete("com.custom.delete",id);
	}
	
	public List<CustomDTO> getList(){
		
		List<CustomDTO> lists = sessionTemplate.selectList("com.custom.list");
	
		return lists;
	}
	
	public CustomDTO getReadData(int id){
		
		CustomDTO dto = sessionTemplate.selectOne("com.custom.readData",id);
		
			

		return dto;
	}
	
}
