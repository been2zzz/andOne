package project.root.p001.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class P001_d001DAOImpl implements P001_d001DAO{
	@Autowired
	private SqlSession sqlSession;
		



}
