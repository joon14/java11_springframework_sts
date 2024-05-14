package com.spring3.controller;

import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring3.service.SampleService;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

	private static final Logger log = LoggerFactory.getLogger(RestfulController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/")
	public String ajaxHome() {
		return "ajax/home";
	}
	
	@GetMapping("/ajax1.do")
	public String ajaxTest1() {
		return "ajax/ajax1";
	}
	
	@ResponseBody
	@GetMapping(value="/ajax1pro.do", produces="application/json;charset=utf-8") 
	public String ajaxTest1Pro() {
		String str = "GET 전송 테스트";
		log.info(str);
		return str;
	}
	
	@GetMapping("/ajax2.do")
	public String ajaxTest2() {
		return "/ajax/ajax2";
	}
	
	@PostMapping("/ajax2pro.do") 
	public String ajaxTest2Pro() {
		String str = "POST 전송 테스트";
		log.info(str);
		return "ajax/ajax2";
	}
	
	@GetMapping("/ajax3")
	public String ajaxTest3() {
		return "ajax/ajax3";
	}
	
	@GetMapping("/ajax3pro.do") 
	public String ajaxTest3Pro(@RequestParam("msg") String msg) {
		log.info(msg);
		return "ajax/ajax3";
	}
	
	@GetMapping("/ajax4.do")
	public String ajaxTest4() {
		return "/ajax/ajax4";
	}
	
	@PostMapping("/ajax4pro.do") 
	public String ajaxTest4Pro(@RequestParam("msg") String msg) {
		String str = "POST 전송 테스트";
		log.info(msg);
		return "ajax/ajax4";
	}
}
