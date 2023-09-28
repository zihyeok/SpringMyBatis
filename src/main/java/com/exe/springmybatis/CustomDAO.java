package com.exe.springmybatis;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;


public class CustomDAO {
	
	//�����ڸ� ���� ������ ����
	private SqlSessionTemplate sessionTemplate;//���� �޾Ƽ� �ʱ�ȭ�� ���� ����
	
	 //������ ����(DI) - �����ڸ� ���� / �Ѿ�� ���� �־��ش�.
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
