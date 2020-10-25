package com.awsteam.app.controller;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

import com.awsteam.app.dto.AccuDTO;
import com.awsteam.app.service.CoronaService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@MapperScan(basePackages="com.awsteam.app.dao")
public class CoronaController {
	@Autowired
	private CoronaService Coserv;

	@RequestMapping(path = "/corona", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
	public String corona(@RequestParam(required = true) final long date) throws Exception {//@RequestParam(value="country", defaultValue = "")String country) throws Exception { //query String으로 county를 받도록 설정
		AccuDTO res=Coserv.getDaily(date);
		ObjectMapper mapper=new ObjectMapper();
		String jsonString=mapper.writeValueAsString(res);
		return jsonString;
	}
	//https://onlyformylittlefox.tistory.com/13
	//https://m.blog.naver.com/scw0531/220988401816
	
	@RequestMapping(path="/weekly",method = RequestMethod.GET)
	@ResponseStatus(value= HttpStatus.OK)
	public Object weekly(@RequestParam(required = true) final long date) throws Exception{
		//HashMap<String, Object> map = new HashMap<String, Object>();
		List<AccuDTO> list=Coserv.getWeekly(date);
		//map.put("weekly_list",list);
		return list;
	}
	

}
