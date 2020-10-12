package project.and.p001.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import project.and.vo.AndP001AndOneVO;

public interface AndP001_d001DAO {
	public List selectRecentList(String g_id) throws DataAccessException; //최근등록 같이먹기
	public List selectCtg(String g_id) throws DataAccessException;//카테고리 이름
	public List selectCtgList(AndP001AndOneVO vo) throws DataAccessException;
	public List selectTotalSearchList(AndP001AndOneVO vo) throws DataAccessException;
}
