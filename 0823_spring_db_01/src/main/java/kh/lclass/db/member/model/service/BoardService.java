package kh.lclass.db.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.lclass.db.board.model.dao.BoardDao;
import kh.lclass.db.board.model.vo.BoardVo;


@Service
public class BoardService {
	@Autowired
	private BoardDao boardao;
	
	
	public List<BoardVo> selectlist() throws Exception{
		return boardao.selectList() ;
	}
	
	public int  insert(BoardVo vo) throws Exception{
		return boardao.insert(vo); 
	}
	
	public int  update(BoardVo vo) throws Exception{
		return boardao.update(vo); 
	}
	
	public int  delete(int bno) throws Exception{
		return boardao.delete(bno);
	}
	public List<BoardVo>  selectOne(int bno) throws Exception{
		return boardao.selectOne(bno);
	}
	@Transactional
	public int  insertReply(BoardVo vo)throws Exception{
		boardao.update(vo);
		return boardao.insert(vo);
	}
	
	
}
