package project.member.p005.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import common.Common;
import common.Pagination;
import project.member.p005.service.MemberP005_d001Service;
import project.member.p005.vo.MemberP005VO;

/*
 * @Title	알림
 * @Author 	김세영
 * @Date	2020.10.21
 * 
 * */

@Controller
public class MemberP005_d001ControllerImpl implements MemberP005_d001Controller{
	
	@Autowired
	MemberP005_d001Service memberP005_d001Service;
	
	// 알림조회 (전체)
	@RequestMapping("/member/notify.do")
	public ModelAndView notifyInit(@RequestParam(defaultValue = "1") int curPage, HttpServletRequest request) throws Exception{
		ModelAndView mav = new ModelAndView(Common.checkLoginDestinationView("MemberP005_d001_init", request));
		String m_id = (String) request.getSession(false).getAttribute("m_id");
		// 세션에 m_id가 존재할 때 
		if(m_id != null && !"".equals(m_id)){
			// 새로운 알람 조회
			List<MemberP005VO> newList = memberP005_d001Service.searchNewNotifyList(m_id);
			// 이전 알람 조회
			Map<String, String> searchParam = new HashMap<String, String>();
//			int listCnt = memberP005_d001Service.selectOldNotifyCnt(m_id);
//			Pagination pagination = new Pagination(listCnt, curPage);
//			searchParam.put("startIndex", "1");	// 시작 index는 1부터 이므로 1을 더해줌.
//			searchParam.put("endIndex", "5");	// 5개씩 조회
//			searchParam.put("m_id", m_id);
//			List<MemberP005VO> oldList = memberP005_d001Service.searchOldNotifyList(searchParam);
			// 정보 전달
//			mav.addObject("pagination", pagination);
			mav.addObject("newList", newList);
//			mav.addObject("oldList", oldList);
			mav.addObject("oldListCnt", memberP005_d001Service.selectOldNotifyCnt(m_id));
		}
		return mav;
	}
	
	// 더보기 요청
	@RequestMapping("/member/searchMoreNotify.do")
	@ResponseBody
	public String searchMoreNotify(@RequestParam String m_id, @RequestParam int startIndex) {
		Map<String, String> searchParam = new HashMap<String, String>();
		searchParam.put("startIndex", startIndex+"");	// 시작 index는 1부터 이므로 1을 더해줌.
		searchParam.put("endIndex", startIndex+5+"" );	// 5개씩 조회
		searchParam.put("m_id", m_id);
		List<MemberP005VO> addList = memberP005_d001Service.searchOldNotifyList(searchParam);
		String result = "";
		return result;
	}
	
	// 읽음상태 변경 
	@RequestMapping("/member/readNotify.do")
	@ResponseBody
	public void readNotify(@RequestParam String n_id, HttpServletRequest request) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("n_id", n_id);
		param.put("m_id", (String)request.getSession(false).getAttribute("m_id"));
		memberP005_d001Service.updateNotifyChecked(param);
	}
	
	// 새 알림 조회
	@RequestMapping("member/selectNewNoticeCnt.do")
	@ResponseBody
	public String selectNewNoticeCnt(@RequestParam String m_id) {
		return memberP005_d001Service.selectNewNotifyCnt(m_id)+"";
	}
	
}
