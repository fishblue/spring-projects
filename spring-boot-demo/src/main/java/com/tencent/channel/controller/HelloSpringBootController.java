package com.tencent.channel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.tencent.channel.dao.repository.GreetRepository;
import com.tencent.channel.domain.Greet;

/**
 * 用于测试spring boot中web服务构建的controller
 * @author seasonzhou
 * @since 2018-01-11 15:41:31
 */

@Controller
@RequestMapping("/")
public class HelloSpringBootController {
	
	@Autowired
	private GreetRepository gr;
	
	/**
	 * @param visitor 访问者
	 * @param greet 问候语
	 * @return template_name 返回视图的名称，该名称对应的路径为classpath:/template/template_name
	 */
	@RequestMapping(value="/hello/{visitor}",method=RequestMethod.GET)
	public String helloAction(@PathVariable String visitor,@RequestParam String greet,ModelMap model) {
		model.addAttribute("greet", greet);
		model.addAttribute("username", visitor);
		
		Greet gt = new Greet();
		gt.setGreetWords("from request");
		gt = gr.save(gt);
		
		return "hello_thymeleaf";
	}
}
