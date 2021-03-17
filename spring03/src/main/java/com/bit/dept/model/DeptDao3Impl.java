package com.bit.dept.model;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bit.dept.model.entity.DeptVo;

public class DeptDao3Impl implements DeptDao {

	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<DeptVo> selectAll() throws SQLException {
		String sql = "select * from dept order by deptno desc";
		
		return null;
	}

	@Override
	public DeptVo selectOne(int deptno) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOne(DeptVo bean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertTwo(DeptVo bean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int updateOne(DeptVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int deptno) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
