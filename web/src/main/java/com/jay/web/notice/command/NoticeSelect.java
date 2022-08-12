package com.jay.web.notice.command;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import com.jay.web.common.Command;
import com.jay.web.notice.service.NoticeService;
import com.jay.web.notice.serviceImpl.NoticeServiceImpl;
import com.jay.web.notice.vo.NoticeVO;

public class NoticeSelect implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 조회
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setNoticeId(Integer.valueOf(request.getParameter("id")));
		vo = noticeDao.noticeSelect(vo);
		request.setAttribute("vo", vo);
		return "notice/noticeSelect";
	}

}
