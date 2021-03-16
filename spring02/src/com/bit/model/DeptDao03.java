package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;
import org.mariadb.jdbc.internal.com.read.dao.Results;

import com.bit.model.entity.DeptVo;

public class DeptDao03 implements DeptDao {

	DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
//	public DeptDao03() {
//		// 기본 생성자를 통해서 데이터 베이스 연결
//		String driver = "org.mariadb.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/xe";
//		String user = "scott";
//		String password = "tiger";
//		
//		MariaDbDataSource source = new MariaDbDataSource();
//		try {
//			source.setUrl(url);
//			source.setUser(user);
//			source.setPassword(password);
//			// 이렇게 하면 심플 데이터 소스가 됨
//			dataSource = source;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	public List<DeptVo> selectAll(){
		String sql = "select * from dept";
		List<DeptVo> list = new ArrayList<>();
		
		// 향상된 트라이문은 오토 클로즈
		try( // 기본 생성자에서 만든 데이터베이스를 통해서 쿼리를 날림
				Connection conn = dataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				){
			while(rs.next())
				list.add(new DeptVo(
						rs.getInt("deptno")
						,rs.getString("dname")
						,rs.getString("loc")
						));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insertOne(DeptVo bean) {
		
		String sql = "insert into dept values (?,?,?)";
		
		try(
				Connection conn = dataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setInt(1, bean.getDeptno());
			pstmt.setString(2, bean.getDname());
			pstmt.setString(3, bean.getLoc());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
					e.printStackTrace();
		}
		
	}

	@Override
	public DeptVo selectOne(int deptno) {

		String sql = "select * from dept where deptno=?";
		
		try(
				Connection conn = dataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setInt(1, deptno);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
				return new DeptVo(
						rs.getInt("deptno")
						,rs.getString("dname")
						,rs.getString("loc")
						);
			
			rs.close();
		} catch (SQLException e) {
					e.printStackTrace();
				}
		
		return null;
	}

	@Override
	public int updateOne(DeptVo bean) {

		String sql = "update dept set dname=?, loc=? where deptno=?";
		
		try(
				Connection conn =dataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setString(1, bean.getDname());
			pstmt.setString(2, bean.getLoc());
			pstmt.setInt(3, bean.getDeptno());
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
					e.printStackTrace();
				}
		
		return 0;
	}

	@Override
	public int deleteOne(int deptno) {

		String sql = "delete from dept where deptno=?";
		
		try(
				Connection conn = dataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setInt(1, deptno);
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
					e.printStackTrace();
				}

		return 0;
	}
	
}
