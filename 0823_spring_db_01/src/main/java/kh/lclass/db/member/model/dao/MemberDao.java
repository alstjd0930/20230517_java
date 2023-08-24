package kh.lclass.db.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lclass.db.member.model.vo.MemberVo;

@Repository("memberDao")
public class MemberDao {
	@Autowired
	private SqlSession sqlSession;
	
	
	public List<MemberVo> selectList(){
		return sqlSession.selectList("member.selectlist"); 
	}
	
	public int  insert(MemberVo vo){
		return sqlSession.insert("member.insert" ,vo); 
	}
	
	public int  update(MemberVo vo){
		return sqlSession.update("member.update" , vo); 
	}
	
	public int  delete(String pk){
		return sqlSession.delete("member.delete" , pk); 
	}
	public List<MemberVo> selectOne(String pk){
		return sqlSession.selectOne("member.selectOnet",pk); 
	}
}
