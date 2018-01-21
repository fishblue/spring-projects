package com.tencent.channel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tencent.channel.domain.Greet;

/**
 * restful 接口测试
 * @author seasonzhou
 * @version 1.0
 * @since 2018-1-14 19:29:24
 */
@RestController
public class HelloRestfulController {
	
	@RequestMapping("/greeting")
	public List<Greet> greeting(@RequestParam(value="name",defaultValue="World")String name) {
		List<Greet> list = new ArrayList<>();
		list.add(new Greet(1L, name));
		return list;
	}
}
