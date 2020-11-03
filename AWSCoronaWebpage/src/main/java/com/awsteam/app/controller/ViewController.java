package com.awsteam.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan(basePackages="com.awsteam.app.dao")
public class ViewController {
	@RequestMapping(path = "/index", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Model isRunning3(@RequestParam(required = false) final Long date,Model model) {
		if(date!=null) {
		model.addAttribute("getdate", date);
		//System.out.println("hihi"+date);
		}else {
			SimpleDateFormat sd=new SimpleDateFormat("yyyyMMdd");
			String n=sd.format(new Date());
			//System.out.println("hihi"+n);
			model.addAttribute("getdate", Long.parseLong(n));
		}
        return model;
    }
	
	@RequestMapping(path = "/header", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Model isRunning(Model model) {
        return model;
    }
}
