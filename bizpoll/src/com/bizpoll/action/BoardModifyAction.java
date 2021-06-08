package com.bizpoll.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

import com.bizpoll.common.Fileupload;
import com.bizpoll.dao.BoardDAO;
import com.bizpoll.dto.BoardDTO;

public class BoardModifyAction implements Action{

	@Override
	public ActionFoward excute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "board/boardList.jsp";
		
		BoardDTO bDto = new BoardDTO();
		BoardDAO bDao = new BoardDAO();
		
		Map<String, String> boardMap = Fileupload.upload(request, response);
		int articleNo = bDao.getNewArticleNo();
		String title = boardMap.get("content");
		String content = boardMap.get("originalFileName");
		String fileName = boardMap.get("filename");
		String savePath = boardMap.get("savePath");
		
		bDto.setArticleNo(articleNo);
		bDto.setSubject(title);
		bDto.setContent(content);
		bDto.setFileName(fileName);
		
		int result = bDao.modify(bDto);
		
		if (fileName != null && fileName.length() != 0) {
			File srcFile = new File(savePath + "\\" + "temp" + "\\" + fileName);
			File destDir = new File(savePath + "\\" + articleNo);
			destDir.mkdirs();
			FileUtils.moveFileToDirectory(srcFile, destDir, true);
	
			File oldFile = new File(savePath + "\\" + articleNo + "\\" + originalFileName);
			oldFile.delete();
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		
		if (result > 0) {
			pw.print("<script>" + " alert('글을 수정했습니다.');" + " location.href='" + "boardList.bizpoll';" + "</script>");
		} else {
			pw.print("<script>" + " alert('글 수정에 실패했습니다.');" + " history.go(-1);" + "</script>");
		}
		return null;
	}

}
