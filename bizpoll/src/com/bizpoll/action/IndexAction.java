package com.bizpoll.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bizpoll.dao.ProductDAO;
import com.bizpoll.dto.ProductDTO;

public class IndexAction implements Action{
	
	@Override
	public ActionFoward excute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = "index.jsp";
		
		ProductDAO pDAo = ProductDAO.getInstance();
		ArrayList<ProductDTO> newProductList = pDAo.listNewProduct();
		ArrayList<ProductDTO> bestProductList = pDAo.listBestProduct();
		
		request.setAttribute("newProductList", newProductList);
		request.setAttribute("bestProductList", bestProductList);
		
		ActionFoward forward = new ActionFoward();
		forward.setPath(uri);
		forward.setRedirect(false);
			
		return forward;
	}

}

	