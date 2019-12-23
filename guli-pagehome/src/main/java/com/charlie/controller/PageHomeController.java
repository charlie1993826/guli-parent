package com.charlie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageHomeController {

	
	
	/**
	 * 查询出所有的商品sku
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		
		return "list";
	}
}
