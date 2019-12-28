package com.charlie.feignApi;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.charlie.entity.PmsSkuInfo;

@FeignClient("guli-page")
public interface PageFeignServiceApi {

	@RequestMapping("/private/find/info/list")
	public List<PmsSkuInfo> findAll();
}
