package project.shop.p001.dao;

import java.util.Map;

import org.springframework.dao.DataAccessException;

import project.shop.p001.vo.ShopP001BmemberVO;

public interface ShopP001_d001DAO {
	public int checkId(String bm_id) throws DataAccessException;
	public int checkEmail(String bm_email) throws DataAccessException;
	public int insertBmember(ShopP001BmemberVO vo) throws DataAccessException;
}

