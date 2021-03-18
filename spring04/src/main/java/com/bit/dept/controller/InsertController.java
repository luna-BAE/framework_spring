package com.bit.dept.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;

public class InsertController extends AbstractCommandController {

	DeptDao deptDao;
	
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	@Override
	protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors)
			throws Exception {

		DeptVo bean = (DeptVo)command;
		if(bean.getDeptno()==0||bean.getDeptno()>100) {
			ObjectError error = new ObjectError("deptno", "1~99사이 숫자를 입력하세요");
			errors.addError(error);
		}
		if(bean.getDname().isEmpty()) {
			ObjectError error = new ObjectError("dname", "부서명을 입력하세요");
			errors.addError(error);
		}
		if(bean.getDeptno()==0) {
			ObjectError error = new ObjectError("loc", "지역을 입력하세요");
			errors.addError(error);
		}
		
		super.onBindAndValidate(request, command, errors);
	}

//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		if ("POST".equals(request.getMethod())) {
//			mav.setViewName("redirect:list.do");
//			
//			deptDao.insertOne(new DeptVo(
//					Integer.parseInt(request.getParameter("deptno"))
//					,request.getParameter("dname")
//					,request.getParameter("loc")
//					));
//			
//		}
//		
//		return mav;
//	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		System.out.println(command);
		ModelAndView mav = new ModelAndView();
		
		if(errors.hasErrors()) {
			mav.setViewName("deptadd");
			List<FieldError> errs = errors.getFieldErrors();
			
			for(FieldError err : errs)
				System.out.println(err);
			
		} else {
			mav.setViewName("redirect:list.do");
			deptDao.insertOne((DeptVo)command);
		}
	
			// deptvo의 bean 객체와 동일한 기능을 수행함. servlet.xml에 맵핑할 때 반드시 이름을 주게 되어있는데, 안 줘도 됨.
			// command는 오브젝트 타입이므로 deptvo로 캐스팅해서 사용해야 함
			// 이 클래스를 사용할 때 command를 사용하면 아래처럼 deptvo에서 겟파라미터로 하나하나 값을 꺼내지 않아도 됨
			
//			deptDao.insertOne(new DeptVo(
//					Integer.parseInt(request.getParameter("deptno"))
//					,request.getParameter("dname")
//					,request.getParameter("loc")
//					));
					
		return mav;
	}

}
