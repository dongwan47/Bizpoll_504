package com.bizpoll.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImagePreViewAction implements Action{

	@Override
	public ActionFoward excute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String savePath = "D:\\servlet\\bizpoll\\WebContent\\image\\board";
		
		String fileName = request.getParameter("fileName");
		String articleNo = request.getParameter("articleNo");
		
		System.out.println("fileName ===> " + fileName);
		
		OutputStream out = response.getOutputStream();

		String path = savePath + "\\" + articleNo + "\\" + fileName;
		File imageFile = new File(path);
		
		response.setHeader("Cache-Control","no-cache");
		response.addHeader("Content-disposition", "attachment);fileName=" + fileName);
		
		FileInputStream in = new FileInputStream(imageFile);
		
		byte[] buffer = new byte[8 * 1024];
		
		while(true) {
			int count = in.read(buffer);
			
			if (count == -1) {
				break;
			}
			
			out.write(buffer, 0, count);
		}
		
		in.close();
		out.close();
		
		
		
		return null;
	}

}
