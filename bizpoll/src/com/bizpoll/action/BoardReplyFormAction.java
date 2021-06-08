package com.bizpoll.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardReplyFormAction implements Action{

	@Override
	public ActionFoward excute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "board/boardReplyForm.jsp";
		
		System.out.println("action ref ===> " + request.getParameter("ref"));
		System.out.println("action re_step ===> " + request.getParameter("re_step"));
		System.out.println("action re_level ===> " + request.getParameter("ref"));

		int articleNo = Integer.parseInt(request.getParameter("articleNo"));
		int ref = Integer.parseInt(request.getParameter("ref"));
		int re_step = Integer.parseInt(request.getParameter("re_step"));
		int re_level = Integer.parseInt(request.getParameter("re_level"));

		Map<String, Integer> replyInfo = new HashMap<>();
		replyInfo.put("articleNo", articleNo);
		replyInfo.put("ref", ref);
		replyInfo.put("re_step", re_step);
		replyInfo.put("re_level", re_level);
		
		request.setAttribute("replyInfo" , replyInfo);
		
		ActionFoward foward = new ActionFoward();
		foward.setPath(url);
		foward.setRedirect(false);
		
		return null;
	}

}
