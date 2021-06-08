package com.bizpoll.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.bizpoll.dto.BoardDTO;
import com.bizpoll.mybatis.SqlMapConfig;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class BoardDAO {

	
		return;
	
	SqlSessionFactory sqlSessionFactory = SqlMapConfig.get
	SqlSession sqlSession;

	public List<BoardDTO> boardList(Map<String, object> boardParmMap) {
		SqlSession = sqlSessionFactory.openSession();
		
		List<BoardDTO> boardList = null;
		
		try {
			boardList = sqlSession.selectlist("selBoardList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
		return boardList;
		
	}
	public int boardListAllCnot(Map<String, Object> ) {
		SqlSession = sqlSessionFactory.openSession();
		
		int boardListAllCnt = 0;
		try {
			boardListAllCnt = SqlSession.selectOne("boardListAllCnt", );
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlSession.close();
		}
		
		return boardListAllCnt;
		
	}
	public Integer getNewArticleNo() {
		SqlSession = SqlSessionFactory.openSession();

		Integer articleNo = 0;
		
		try {
			articleNo = SqlSession.selectOne("getNewArticleNo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return articleNo;
	}
	
	public int create(BoardDTO bDto) {
		sqlSession = sqlSessionFactory.openSession();
		
		int result = 0;
		
		try {
			result = sqlSession.insert("createBoard", bDto);
			sqlSession.commit;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
			
		return result;
	}
	public BoardDTO selBoardView(int articleNo) {
		BoardDTO selBoard = null;
		
		SqlSession = SqlSessionFactory.openSession();
		
		try {
			selBoard = sqlSession.selectOne("selectBoardView", articleNo);
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			sqlSession.close();
		}
	
		return selBoard;
	}
	
	public int modify(BoardDTO bDto) {
		SqlSession = sqlSessionFactory.openSession();
		
		int result = 0;
		try {
			result = SqlSession.update("modifyBoard", bDto);
			SqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlSession.close();
		}
		return result;
	}
	
	public int replyReStepUpdate(BoardDTO bDto) {
		SqlSession = sqlSessionFactory.openSession();
		
		int result = 0;
		
		try {
			int maxsOrder = SqlSession.selectOne("selectBoardReplyMaxOrder", bDto);
			System.out.println("¤Ñ¤±¤¼†w¤·¤§¤¡ ===> " + maxsOrder);
			
			if (maxsOrder == 0) {
				int selectReStep = SqlSession.selectOne("selectReStep", bDto);
				int re_level = bDto.getRe_level() + 1;
			
				bDto.setRe_step(selectReStep);
				bDto.setRe_level(re_level);
				
				result = SqlSession.insert("createBaord", bDto);
			} else {
				maxsOrder = SqlSession.selectOne("selectBoardReplyMaxOrder", arg0);
				bDto.setRe_step(maxsOrder);
				
				SqlSession.update("replyReStepUpdate", bDto);
				bDto.setRe_step(bDto.getRe_step() +1);
				
				int re_level = bDto.getRe_level() + 1;
				bDto.setRe_level(re_level);
				
				result = SqlSession.insert("createBaord", bDto);
				SqlSession.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlSession.close();
		}
		return result;
	}
	
	public List<BoardDTO> selsAllBoard
}
















