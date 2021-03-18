package com.bit.emp.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.emp.model.entity.EmpVo;

public class EmpDaoTest {
   static EmpVo target;

   @BeforeClass
   public static void setUpBeforeClass() throws Exception {
      target=new EmpVo(5000,5000,1,"user5");
   }

   private EmpDao empDao;

   @Before
   public void setUp() throws Exception {
      ApplicationContext context;
      context=new GenericXmlApplicationContext("classpath:/applicationContext.xml");
      empDao=(EmpDao) context.getBean("empDao");
   }

   @Test
   public void testSelectAll() {
      assertNotNull(empDao);
      assertNotNull(empDao.selectAll());
//      assertTrue(empDao.selectAll().size()>0);
      assertFalse(empDao.selectAll().size()==0);
   }

   @Test
   public void testSelectOne() {
      assertEquals(target, empDao.selectOne(target.getEmpno()));
   }

   @Test
   public void testInsertOne() {
      try {
    	  empDao.insertOne(target);
      }catch(Exception e) {
    	  fail("문제가 있습니다.");
      }
   }

   @Test
   public void testUpdateOne() {
      fail("Not yet implemented");
   }

   @Test
   public void testDeleteOne() {
      fail("Not yet implemented");
   }

}