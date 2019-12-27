package com.charlie.entity;

import java.io.Serializable;

/**
 * @param
 * @return
 */
public class PmsSkuImage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4492756345931421695L;
	String id;
	String skuId;
	String imgName;
	String imgUrl;
	String spuImgId;
	String isDefault;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSpuImgId() {
		return spuImgId;
	}

	public void setSpuImgId(String spuImgId) {
		this.spuImgId = spuImgId;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
}