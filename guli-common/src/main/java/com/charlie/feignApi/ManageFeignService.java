package com.charlie.feignApi;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.charlie.entity.PmsBaseAttrInfo;
import com.charlie.entity.PmsBaseAttrValue;
import com.charlie.entity.PmsBaseCatalog1;
import com.charlie.entity.PmsBaseCatalog2;
import com.charlie.entity.PmsBaseCatalog3;
import com.charlie.entity.PmsProductInfo;
import com.charlie.result.ResultEntity;

@FeignClient(value = "manage-server")
public interface ManageFeignService {

	@RequestMapping("/manage/getCatalog1")
	public List<PmsBaseCatalog1> getCatalog1();

	@RequestMapping("/manage/getCatalog2")
	public List<PmsBaseCatalog2> getCatalog2(@RequestParam("catalog1Id") String catalog1Id);

	@RequestMapping("/manage/getCatalog3")
	public List<PmsBaseCatalog3> getCatalog3(@RequestParam("catalog2Id") String catalog2Id);

	@RequestMapping("/manage/attr/info/list")
	public List<PmsBaseAttrInfo> getPmsAttrInfoAll(@RequestParam("catalog3Id") String catalog3Id);

	@RequestMapping("/manage/save/attr/info")
	public void saveAttrInfo(@RequestBody PmsBaseAttrInfo attrInfo);

	@RequestMapping("/manage/attr/value/list")
	public List<PmsBaseAttrValue> getAttrValueList(@RequestParam("attrId") String attrId);

	@RequestMapping("/manage/spu/list")
	public List<PmsProductInfo> spuList(@RequestParam("catalog3Id") String catalog3Id);
}
