package com.bizpoll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bizpoll.common.DBManager;
import com.bizpoll.dto.MemberDTO;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class MemberDAO {

	private MemberDAO() {

	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}
	
	public MemberDAO getMemberDAO(String userId) {
		MemberDTO mDto = null;
		
		String sql = "SELECT * "
			
				if(rs.next()) {
					mDto = new MemberDTO();
					mDto.setId(rs.getString("id"));
					mDto.setPwd(rs.getString("pwd"));
					mDto.setName(rs.getString("name"));
					mDto.setEmail(rs.getString("email"));
					mDto.setZipNum(rs.getString("zip_num"));
					mDto.setAddress(rs.getString("address"));
					mDto.setId(rs.getString("id"));
					mDto.setId(rs.getString("id"));
					mDto.setId(rs.getString("id"));
					
				}
					return mDto;
					
				
		
		}
	public int confirmId(String userId) {
		// 회원 가입유무 판별 변수
		int result = -1;
		
		String sql = "SELECT * " 
					+ "FROM member" 
					+ "WHERE id=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				result = 1;
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return 0;
	}
}
