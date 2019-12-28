package com.charlie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.charlie.entity.PmsSkuInfo;

@Mapper
public interface PmsSkuInfoMapper extends BaseMapper<PmsSkuInfo>{

	List<PmsSkuInfo> selectAll();
}
