package com.jay.web.notice.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jay.web.common.Command;

public class NoticeForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 폼 호출
		return "notice/noticeForm";
	}

}
