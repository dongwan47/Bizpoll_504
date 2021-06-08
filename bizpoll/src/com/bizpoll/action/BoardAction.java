package com.bizpoll.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bizpoll.dao.BoardDAO;

public class BoardAction implements Action{

	@Override
	public ActionFoward excute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	String url = "board/boardList.jsp"
	
	BoardDAO bDao = BoardDAO.getInstance();
	
	List<BoardDTO> boardList = bDao.boardlist();
	
	request.setAttribute(name, o);
	return null;
}
	}

}
