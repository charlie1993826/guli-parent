package com.charlie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.charlie.util.RedisUtil;

@Controller
public class PageHomeController {

	@Autowired
	private RedisUtil redisUtil;

	/**
	 * 查询出所有的商品sku
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {

		String value = redisUtil.get("k1", 0, "lock", 5);
		System.err.println(value);
		return "list";
	}
}
