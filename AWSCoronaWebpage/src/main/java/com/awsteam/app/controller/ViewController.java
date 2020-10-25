package com.awsteam.app.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan(basePackages="com.awsteam.app.dao")
public class ViewController {
	@RequestMapping(path = "/index", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Model isRunning3(Model model) {
        return model;
    }
}
