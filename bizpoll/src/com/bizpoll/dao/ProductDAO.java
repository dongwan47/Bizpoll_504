package com.bizpoll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bizpoll.common.DBManager;
import com.bizpoll.dto.ProductDTO;

public class ProductDAO {

	private ProductDAO() {
		
	}

	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}

	public ArrayList<ProductDTO> listNewProduct() {
		
		String sql = "SELECT * FROM new_pro_view";
		ArrayList<ProductDTO> newProductList = new ArrayList<ProductDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ProductDTO product = new ProductDTO();
				product.setP_code(rs.getString("p_code"));
				product.setP_code(rs.getString("p_name"));
				product.setP_code(rs.getString("p_price2"));
				product.setP_code(rs.getString("p_img"));
				
				newProductList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				DBManager.close(conn, pstmt, rs);;
		}
		return newProductList;
	}
public ArrayList<ProductDTO> listBestProduct() {
		
		String sql = "SELECT * FROM best_pro_view";
		ArrayList<ProductDTO> bestProductList = new ArrayList<ProductDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ProductDTO product = new ProductDTO();
				product.setP_code(rs.getString("p_code"));
				product.setP_code(rs.getString("p_name"));
				product.setP_code(rs.getString("p_price2"));
				product.setP_code(rs.getString("p_img"));
				
				bestProductList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				DBManager.close(conn, pstmt, rs);;
		}
		return bestProductList;
	}

}
