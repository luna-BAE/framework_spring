package com.bit.dept.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.dept.model.entity.DeptVo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeptDaoTest {

	DeptDao deptDao;
	static DeptVo target;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		target = new DeptVo(88, "test", "test");
	}

	@Before
	public void setUp() throws Exception {
		ApplicationContext context;
		context = new GenericXmlApplicationContext("classpath:/applicationContext.xml");
		deptDao = (DeptDao) context.getBean("proxy");
	}

	@Test
	public void test1SelectAll() { // 실패만 있을 뿐 에러는 없음
		assertNotNull(deptDao);
		try {
			assertNotNull(deptDao.selectAll());
			assertFalse(deptDao.selectAll().size()==0);
		} catch (SQLException e) {
			fail("Not yet implemented");
		}
		
		
	}
	
	@Test
	public void test3SelectOne() {
		try {
			assertEquals(target, deptDao.selectOne(target.getDeptno()));
		} catch (SQLException e) {
			fail("Not yet implemented");
		}
		
	}

	@Test
	public void test2InsertOne() {
		try {
			deptDao.insertOne(target);
		} catch (SQLException e) {
			fail("Not yet implemented");
		}
		
	}

	@Test
	public void test4UpdateOne() {
		target.setDname("change");
		target.setLoc("none");
		try {
			assertSame(1, deptDao.updateOne(target));
		} catch (SQLException e) {
			fail("Not yet implemented");
		}
	}

	@Test
	public void testDeleteOne() {
		try {
			assertSame(1, deptDao.deleteOne(target.getDeptno()));
		} catch (SQLException e) {
			fail("Not yet implemented");
		}
	}

}
