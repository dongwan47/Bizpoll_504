package com.bizpoll.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bizpoll.common.DBManager;
import com.bizpoll.dao.MemberDAO;
import com.bizpoll.dto.MemberDTO;

public class LoginAction implements Action {

	@Override
	public ActionFoward excute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "member/login_fail.jsp";

		HttpSession session = request.getSession();

		String userId = request.getParameter("id");
		String userPw = request.getParameter("pwd");

		MemberDAO mDao = MemberDAO.getInstance();
		MemberDTO mDto = mDao.getMemberDAO(userId);

		MemberDTO mDto = null;

		String sql = "SELECT" + "AND pwd=?";

		try {

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}

		String userId = request.getParameter("id");
		String userPw = request.getParameter("pwd");

		MemberDAO mDao = MemberDAO.getInstance();
		MemberDTO mDto = mDao.getMember(userId);

		if (mDto != null) {
			if (mDto.getPwd().equals(userPw)) {
				session.removeAttribute("id");
				session.setAttribute("loginUser", mDto);
				url = "index.bizpoll";
			}
		}

		ActionFoward foward = new ActionFoward();
		foward.setPath(url);
		foward.setRedirect(false);

		return null;
	}

}
