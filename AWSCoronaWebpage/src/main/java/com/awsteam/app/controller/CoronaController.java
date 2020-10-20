package com.awsteam.app.controller;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.awsteam.app.dao.AccuDAO;
import com.awsteam.app.dao.testDAO;
import com.awsteam.app.dto.AccuDTO;
import com.awsteam.app.dto.testDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
@MapperScan(basePackages="com.awsteam.app.dao")
public class CoronaController {
	@Autowired
	private testDAO testdao;
	
	@Autowired
	private AccuDAO Accudao;
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Model isRunning(Model model) {
		model.addAttribute("msg","<font color=red> 하이루</font>");
        return model;
    }
	@RequestMapping(path = "/hello2", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Model isRunning2(Model model) {
		model.addAttribute("msg","<font color=red> 하이루</font>");
        return model;
    }
	
	@RequestMapping(path = "/index", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Model isRunning3(Model model) {
		model.addAttribute("msg","<font color=red> 하이루</font>");
        return model;
    }
	@RequestMapping(path = "/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
	public Model users(Model model) throws Exception {//@RequestParam(value="country", defaultValue = "")String country) throws Exception { //query String으로 county를 받도록 설정
		//final testDTO param = new testDTO(0, null, country);//전달 받은 country를 받은 UserDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
		final List<testDTO> userList = testdao.selectTest();// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		//model.addAttribute
		//model.add
		//model.addAllAttributes("daily",userList);
		return model;
	}
	
	@RequestMapping(path = "/corona", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
	public String corona(@RequestParam(required = true) final long date) throws Exception {//@RequestParam(value="country", defaultValue = "")String country) throws Exception { //query String으로 county를 받도록 설정
		//final testDTO param = new testDTO(0, null, country);//전달 받은 country를 받은 UserDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
		final AccuDTO res = Accudao.selectAccu(date);// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		ObjectMapper mapper=new ObjectMapper();
		String jsonString=mapper.writeValueAsString(res);
		return jsonString;
	}

}
