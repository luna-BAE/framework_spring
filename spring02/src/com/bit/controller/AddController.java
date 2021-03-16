package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.DeptDao;
import com.bit.model.DeptDao01;
import com.bit.model.DeptDao02;
import com.bit.model.entity.DeptVo;

public class AddController implements Controller {

	DeptDao dao;
	
	public void setDao(DeptDao dao) {
		this.dao = dao;
	}
	
//	DeptDao01 dao;
	
//	public AddController() {
//		dao = new DeptDao01();
		// 여기 있거나 필드에서 선언, 생성이 이루어지면 처음에는 객체를 생성하고 값을 반환하겠지만, 
		// 한번 수행되면 개선된 트라이문에 의해서 객체가 클로즈되기 때문에 오류를 발생시킴
		// 이 컨트롤러는 싱글톤 패턴으로 객체가 생성됐을 때 처리한다는 것
		// 그래서 커넥션 풀을 사용하면 하나의 객체를 재사용할 수 있게 됨
//	} 
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView(); // 리턴해줄 모델앤뷰 객체를 생성
		
		
		DeptVo bean = new DeptVo(
				Integer.parseInt(request.getParameter("deptno"))
				,request.getParameter("dname")
				,request.getParameter("loc")
				); 
		dao.insertOne(bean);
		
		mav.setViewName("redirect:list.do"); // step04에 servlet dispatcher 만들었던 것 참고
		// 핸들러에 의해서 이 컨트롤러를 타면 위에 코드를 수행하고 셋뷰네임 메소드에 의해서 리다이렉트돼서 리스트로 돌아감
		
		return mav;
	}

}
