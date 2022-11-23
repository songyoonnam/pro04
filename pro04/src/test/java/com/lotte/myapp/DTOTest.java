package com.lotte.myapp;


import org.codehaus.plexus.logging.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.lotte.dto.MemberDTO;

public class DTOTest {
	private static final Logger Logger = LoggerFactory.getLogger(DTOTest.class);
	

	@Test
	public void test() {
		MemberDTO dto = new MemberDTO();
		dto.setId("admin");
		dto.setPw("1234");
		dto.setName("관리자");
		dto.setTel("01011112222");
		dto.setAddr("경기도 고양시 일산서구");
		dto.setPt(300);
		dto.setRegdate("2022-11-01");
		
		Logger.info(dto.toString());
		
	}

}
