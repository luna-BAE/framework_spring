package com.bit.dept.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.dept.model.entity.DeptVo;

public interface DeptDao {

	List<DeptVo> selectAll() throws SQLException;
	DeptVo selectOne(int deptno) throws SQLException;
	void insertOne(DeptVo bean) throws SQLException;
	void insertTwo(DeptVo bean) throws SQLException; // 양쪽 데이터베이스에 동시에 입력. // 한쪽은 주서버 한쪽은 백업서버가 될 것.
	int updateOne(DeptVo bean) throws SQLException;
	int deleteOne(int deptno) throws SQLException;
}
