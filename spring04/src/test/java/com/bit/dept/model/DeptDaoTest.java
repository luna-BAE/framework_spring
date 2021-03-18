package com.bit.dept.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;

import com.bit.dept.model.entity.DeptVo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeptDaoTest {

	DeptDao deptDao;
	static DeptVo target;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		target = new DeptVo(99,"test","testing");
	}

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = null;
		// context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		// context = new FileSystemXmlApplicationContext("/src/main/resources/applicationContext.xml"); // 프로젝트 루트
		// context = new FileSystemXmlApplicationContext("classpath:/applicationContext.xml");
		context = new GenericXmlApplicationContext("/WEB-INF/spring/servlet-context.xml");
		deptDao = (DeptDao) context.getBean("deptDao"); 
	}

	@Test
	public void test1SelectAll() throws SQLException {
		assertNotNull(deptDao);
		assertNotNull(deptDao.selectAll());
		
		assertTrue(deptDao.selectAll().size()>0);
	}

	@Test
	public void test2InsertOne() {
		try {
			deptDao.insertOne(target);
		} catch (SQLException e) {
			fail("insert fail");
		}
	}
	
	@Test
	public void test3SelectOne() throws SQLException {
		assertEquals(target, deptDao.selectOne(target.getDeptno()));
	}

	@Test
	public void test4UpdateOne() throws SQLException {
		target.setDname("edit1");
		target.setLoc("seoul");
		assertSame(1, deptDao.updateOne(target)); // 성공하면 1이 나올것, 다오 업데이트원에 타겟을 넣었을때 정상적으로 수행되면 1이 나올것 두개가 같은지 비교하는 것
		assertEquals(target, deptDao.selectOne(target.getDeptno())); // 타겟과 다오 셀렉트 원의 객체가 같은지를 비교
	}

	@Test
	public void test5DeleteOne() throws SQLException {
		assertSame(1, deptDao.deleteOne(target.getDeptno()));
	}

}
