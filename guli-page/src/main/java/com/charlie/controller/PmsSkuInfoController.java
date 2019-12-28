package com.charlie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.charlie.entity.PmsSkuInfo;
import com.charlie.service.PmsSkuInfoService;

@RestController
@RequestMapping("/private")
public class PmsSkuInfoController {

	@Autowired
	private PmsSkuInfoService service;

	@RequestMapping(value = "/find/info/list", method = RequestMethod.GET)
	public List<PmsSkuInfo> findAll() {
		
		return service.findAll();
	}
}
