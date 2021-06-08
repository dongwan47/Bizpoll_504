package com.bizpoll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bizpoll.common.DBManager;

public class AddressDAO {
	private AddressDAO {}
	
	private static AddressDAO instance = new AddressDAO();
	
	public static AddressDAO getInstance() {
		return instance;
	}
	
	public ArrayList<AddressDTO> selectAdressByDong(String dong)
		ArrayList<AddressDTO> list = new ArrayList<Address>

		String sql = "SELECT * FROM address WHERE dong LIKE '%'||?||'%'";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, x);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				AddressDTO aDto = new AddressDTO();
				
				aDto.setZipNum(rs.getString("zip_num"));
				aDto.setSido(rs.getString("sido"));
				aDto.setGugu(rs.getString("zip_num"));
				aDto.setZipNum(rs.getString("zip_num"));
				aDto.setZipNum(rs.getString("zip_num"));
				aDto.setZipNum(rs.getString("zip_num"));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
}
