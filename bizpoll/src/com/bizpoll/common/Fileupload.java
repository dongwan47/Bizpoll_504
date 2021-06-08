package com.bizpoll.common;

import java.io.File;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class Fileupload {

	public static Map<String, String upload(HttpServletRequest request, HttpServlet);
	String savePath = "D:\\servlet\\bizpoll\\WebContent\\image\\board";
	Map<String, String> boardMap = new HashMap<String, String>();
	String encodeing = "UTF-8";
	
	File currentDirPath = new File(savePath);
	
	DiskFileItemFactory factory = new DiskFileItemFactory();
	
	facory.setRepository(currentDirPath);
	
	facory.setSizeThreshold(10 * 1024 * 1024);
	
	ServletFileUpload upload = new ServletFileUpload(factory);
	
	try {
		List<FileItem> items = upload.parseRequest(request);
		
		for (int i = 0; i < items.size; i++) {
			FileItem fileItem = (FileItem)items.get(i);
			
			if (FileItem.isFormField()) {
				System.out.println(fileItem.getFieldName() + " = " + fileItem.getString(encodeing));
				
				boardMap.put(fileItem.getFieldName(), fileItem.getString(encodeing));
			} else {
				System.out.println("�Ķ���͸� : " + fileItem.getFieldName());
				System.out.println("����ũ�� : " + fileItem.getSize() + "bytes");
				
				if (fileItem.getSize() > 0) {
					int idx = fileItem.getName().lastIndexOf("\\");
					
					if (idx == -1) {
						idx = fileItem.getName().lastIndexOf("/");
					}
					
					String fileName = fileItem.getName().substring(idx + 1);
					System.out.println("���ϸ� : " + fileName);
					
					boardMap.put(fileItem.getFieldName(), fileName);
					
					File uploadFile =  new File(currentDirPath + "\\temp\\" + fileName);
					fileItem.write(uploadFile);
				}
			}
		}
		
		boardMap.put("savePath", savePath);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return boardMap;
}
}