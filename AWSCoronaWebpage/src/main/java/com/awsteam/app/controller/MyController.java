package com.awsteam.app.controller;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@RestController
//@Controller
public class MyController {
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

}
