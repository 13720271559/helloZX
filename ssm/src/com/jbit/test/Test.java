package com.jbit.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jbit.dao.DeptDao;
import com.jbit.entity.Dept;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptDao deptDao= (DeptDao) app.getBean("deptDao");
		
		//int res= deptDao.insertDept(new Dept("b", "b"));
		//System.out.println(res);
		//Dept dept= deptDao.findByNo(10);
		List<Dept> list=deptDao.findDept();
		
		for (Dept dept : list) {
			System.out.println(dept);
		}
		//System.out.println(dept);
	}

}
