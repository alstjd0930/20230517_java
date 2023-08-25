package kh.lclass.db.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lclass.db.board.model.vo.BoardVo;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	public List<BoardVo> selectList() throws Exception{
		return sqlSession.selectList("board.boardselectlist"); 
	}
	
	public int  insert(BoardVo vo)throws Exception{
		return sqlSession.insert("board.insert" ,vo); 
	}
	
	public int  update(BoardVo vo)throws Exception{
		return sqlSession.update("board.update" , vo); 
	}
	
	public int  delete(int bno)throws Exception{
		return sqlSession.delete("board.delete" , bno); 
	}
	public List<BoardVo> selectOne(int bno)throws Exception{
		return sqlSession.selectOne("board.boardselectone",bno); 
	}
}
