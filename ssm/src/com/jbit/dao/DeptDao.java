package com.jbit.dao;

import java.util.List;

import com.jbit.entity.Dept;

public interface DeptDao {

	Dept findByNo(int id);
	
	List<Dept> findDept();
	
	int insertDept(Dept dept);
	
}
