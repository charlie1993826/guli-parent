package com.charlie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.charlie.entity.PmsSkuInfo;
import com.charlie.mapper.PmsSkuInfoMapper;
import com.charlie.service.PmsSkuInfoService;

@Service
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService{

	@Autowired
	private PmsSkuInfoMapper pmsSkuInfoMapper;
	
	/**
	 * 获取到所有的PmsInfo信息
	 */
	@Override
	public List<PmsSkuInfo> findAll() {
		// TODO Auto-generated method stub
		
		return pmsSkuInfoMapper.selectAll();
	}

}
