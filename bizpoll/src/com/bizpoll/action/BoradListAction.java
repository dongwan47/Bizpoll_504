package com.bizpoll.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bizpoll.dao.BoardDAO;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class BoradListAction {

BoardDAO bDao = BoardDAO.getInstance();

String_section = request.getParameter("section");
String_section = request.getParameter("pageNum");

String searchType = req
String searchKeyword = request.getParameter("searchKeyword");

int section = Integer.parseInt(((_section == null) ? "1" : _section);
int pageNum = Integer.parseInt(((_section == null) ? "1" : _pageNum);

Map<String, Integer> pagingMap = new HashMap<>();
pagingMap.put("section", section);
pagingMap.put("pageNum", pageNum);
pagingMap.put("searchType", searchType);
pagingMap.put("searchKeyword", searchKeyword);

List<BoardDTO> boardList = bDao.boardList(pagingMap);
int boardListAllCnt = bDao.boardListAllCnt(pagingMap);

Map<String, Object> boardInfo = new HashMap<>();

boardInfo.put("selAllBoardList", boardList);
boardInfo.put("boardListAllCnt", boardListAction);
boardInfo.put("section", section);
boardInfo.put("pageNum", pageNum);
boardInfo.put("searchType", searchType);
boardInfo.put("searchKeyword", searchKeyword);

request.setAttribute

}
