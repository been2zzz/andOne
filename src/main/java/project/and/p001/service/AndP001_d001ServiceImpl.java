package project.and.p001.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import project.and.p001.dao.AndP001_d001DAO;
import project.and.vo.AndP001AndOneVO;


@Service
public class AndP001_d001ServiceImpl implements AndP001_d001Service {
	@Autowired
	private AndP001_d001DAO p001_d001DAO;
	
	//메인 최근등록같이먹기
	@Override
	public List recentAndOneList(Map<String, Object> param) throws DataAccessException{
		List<AndP001AndOneVO> recentAndOneList = null;
		String g_id = (String) param.get("g_id");
		System.out.println("service찍혀라ㅠㅠㅠㅠ"+g_id);
		recentAndOneList = p001_d001DAO.selectRecentList(param);
		return recentAndOneList;
	}
	//카테고리(이름/번호)
	@Override
	public List searchCtg(String g_id) throws DataAccessException{
		List<AndP001AndOneVO> searchCtg = null;
		searchCtg = p001_d001DAO.selectCtg(g_id);
		return searchCtg;
	}
	//카테고리검색
	@Override
	public List ctgSearchList(Map<String, Object> searchMap) throws DataAccessException{
		List<AndP001AndOneVO> ctgSearchList = null;
		ctgSearchList = p001_d001DAO.selectCtgList(searchMap);
		return ctgSearchList;
	}
	//전체검색
	@Override
	public List totalSearchList(Map<String, Object> searchMap) throws DataAccessException{
		List<AndP001AndOneVO> totalSearchList = null;
		totalSearchList = p001_d001DAO.selectTotalSearchList(searchMap);
		return totalSearchList;
	}
	//회원위치가져오기
	@Override
	public Map<String, Object> selectMemLocate(String m_id) throws DataAccessException{
		Map<String, Object> locate =  p001_d001DAO.selectMemLocate(m_id);
		 System.out.println("나왔니,,,?"+locate.get("m_locate_Lat"));
		return locate;
	}
	@Override
	public List<Map<String,Object>> selectAndOneLocate(String g_id) throws DataAccessException{
		List<Map<String,Object>> AndOneLocate =  p001_d001DAO.selectAndOneLocate(g_id);
		return AndOneLocate;
	}
	
	
	
}
