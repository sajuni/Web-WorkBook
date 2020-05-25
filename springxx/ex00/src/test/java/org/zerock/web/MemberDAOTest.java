package org.zerock.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime()throws Exception{
		System.out.println(dao.getTime());
	}
	
	
	@Test
	public void testInsertMember()throws Exception{
		MemberVO vo = new MemberVO();
		vo.setMemberid("user00");
		vo.setMemberpwd("1234");
		vo.setEmail("user00@naver.com");
		System.out.println(vo);
		dao.insertMember(vo);
	}
	
}
