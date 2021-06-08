package com.bizpoll.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bizpoll.action.Action;
import com.bizpoll.action.ActionFoward;
import com.bizpoll.action.BoardAddAction;
import com.bizpoll.action.BoardModifyAction;
import com.bizpoll.action.BoardReplyAction;
import com.bizpoll.action.BoardReplyFormAction;
import com.bizpoll.action.BoardViewAction;
import com.bizpoll.action.ContractAction;
import com.bizpoll.action.IdCheckFormAction;
import com.bizpoll.action.ImagePreViewAction;
import com.bizpoll.action.IndexAction;
import com.bizpoll.action.JoinAction;
import com.bizpoll.action.JoinFormAction;
import com.bizpoll.action.LoginAction;
import com.bizpoll.action.LoginFormAction;
import com.bizpoll.action.LogoutAction;
import com.bizpoll.action.boardFormAction;

/**
 * Servlet implementation class BizpollController
 */
@WebServlet("/BizpollController")
public class BizpollFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BizpollFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 깨짐 방지(post방식)
		request.setCharacterEncoding("UTF-8");
		
		Action action = null;
		ActionFoward forward = null;
		
		String uri = request.getRequestURI();
		String ctx = request.getContextPath();
		String command = uri.substring(ctx.length());
		
		System.out.println("uri ===>" + uri);
		System.out.println("ctx ===>" + ctx);
		System.out.println("command ===>" + command);
		
		//---------------- 액션 맵핑 ----------------
		if (command.equals("/index.bizpoll")) {
			action = new IndexAction();
			forward = action.excute(request, response);
		} else if (command.equals("/login_form.bizpoll")) {
			action = new LoginFormAction();
			forward = action.excute(request, response);
		} else if (command.equals("/login.bizpoll")) {
			action = new LoginAction();
			forward = action.excute(request, response);
		} else if (command.equals("/logout.bizpoll")) {
			action = new LogoutAction();
			forward = action.excute(request, response);
		} else if (command.equals("/Contract.bizpoll")) {
			action = new ContractAction();
			forward = action.excute(request, response);
		} else if (command.equals("join_form.bizpoll")) {
			action = new JoinFormAction();
			forward = action.excute(request, response);
		} else if (command.equals("/id_check_form.bizpoll")) {
			action = new IdCheckFormAction();
			forward = action.excute(request, response);
		} else if (command.contentEquals("/find_zip_num.bizpoll")) {
				action = new IdCheckFormAction();
				forward = action.excute(request, response);
		} else if (command.contentEquals("/join.bizpoll")) {
			action = new JoinAction();
			forward = action.excute(request, response);
		} 
		
		// --------------- 게시판 액션 맵핑 ---------------
		if (command.contentEquals("/bordList.bizpoll")) {
				action = new JoinAction();
				forward = action.excute(request, response);
		} else if (command.equals("/boardForm.bizpoll")) {
				action = new boardFormAction();
				forward = action.excute(request, response);
        } else if (command.equals("/boardAdd.bizpoll")) {
        		action = new BoardAddAction();
	        	forward = action.excute(request, response);
        } else if (command.equals("/imagePreView.bozpoll")) {
	        	action = new ImagePreViewAction();
	        	forward = action.excute(request, response);
		} else if (command.equals("/boardView.bizpoll")) {
				action = new BoardViewAction();
				forward = action.excute(request, response);
		}  else if (command.equals("/boardModify.bizpoll")) {
				action = new BoardModifyAction();
				forward = action.excute(request, response);
		} else if (command.equals("/boardReplyForm.bizpoll")) {
				action = new BoardReplyFormAction();
				forward = action.excute(request, response);
		} else if (command.equals("/boardReply.bizpoll")) {
				action = new BoardReplyAction();
				forward = action.excute(request, response);
			
		}
		
		
		// --------------- 공통 분기 작업 ---------------
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher rd = request.getRequestDispatcher(forward.getPath());
				rd.forward(request, response);
			}	
		}
	}

	}




























