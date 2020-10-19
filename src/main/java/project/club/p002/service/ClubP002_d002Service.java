package project.club.p002.service;

import java.util.List;
import java.util.Map;

import project.club.vo.ClubMemberVO;

public interface ClubP002_d002Service {
	public List<ClubMemberVO> waitMemberList(Map<String, Object> searchMap);
	public void permitMember(Map<String, Object> updateMap);
	public void denyMember(Map<String, Object> deleteMap);
	public List<ClubMemberVO> getClubMemberList(Map<String, Object> searchMap);
	public void qualifyMember(Map<String, Object> searchMap);
	public void kickMember(Map<String, Object> searchMap);
	public void usurpMember(Map<String, Object> searchMap);
}
