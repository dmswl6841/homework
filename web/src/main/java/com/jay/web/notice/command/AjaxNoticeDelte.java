package com.jay.web.notice.command;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jay.web.common.Command;
import com.jay.web.notice.service.NoticeService;
import com.jay.web.notice.serviceImpl.NoticeServiceImpl;
import com.jay.web.notice.vo.NoticeVO;

public class AjaxNoticeDelte implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// ajax 게시글 삭제
		NoticeService noticeDao = new NoticeServiceImpl();
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		ObjectMapper mapper = new ObjectMapper();  //jackson 라이브러리 사용(json)
		NoticeVO vo = new NoticeVO();
		vo.setNoticeId(Integer.valueOf(request.getParameter("id")));
		int n = noticeDao.noticeDelete(vo);
		String jsonList = "0";
		if(n != 0) {
//			list = noticeDao.noticeSelectList();
//			try {
//				jsonList = mapper.writeValueAsString(list);
//			} catch (JsonProcessingException e) {
//				e.printStackTrace();
//			}
			jsonList = "1";
		}		
		return "ajax:"+jsonList;
	}

}
