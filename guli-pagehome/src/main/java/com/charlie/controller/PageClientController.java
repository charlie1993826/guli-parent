package com.charlie.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.charlie.entity.PmsSkuInfo;
import com.charlie.feignApi.PageFeignServiceApi;

@Controller
@RequestMapping("/page")
public class PageClientController {

	@Autowired
	private PageFeignServiceApi pageServiceApi;

	/**
	 * 获取所有的商品信息
	 * 
	 * @param model
	 * @return 返回到list主页面
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {

		List<PmsSkuInfo> findAll = pageServiceApi.findAll();

		model.addAttribute("skuInfoList", findAll);

		return "list";
	}
}
