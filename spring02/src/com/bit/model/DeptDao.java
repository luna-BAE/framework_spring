package com.bit.model;

import java.util.List;

import com.bit.model.entity.DeptVo;

public interface DeptDao {

	List<DeptVo> selectAll();
	
	void insertOne(DeptVo bean);
	
	DeptVo selectOne(int deptno);
	
	int updateOne(DeptVo bean);
	
	int deleteOne(int deptno);
	
	// 다형성에 의해서 다오 타입으로 받을 수 있음
}
