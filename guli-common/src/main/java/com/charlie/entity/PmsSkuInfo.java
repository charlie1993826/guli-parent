package com.charlie.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @param
 * @return
 */
public class PmsSkuInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -957701951591243004L;
	String id;
	String productId;
	String spuId;
	BigDecimal price;
	String skuName;
	BigDecimal weight;
	String skuDesc;
	String catalog3Id;
	String skuDefaultImg;
	List<PmsSkuImage> skuImageList;
	List<PmsSkuAttrValue> skuAttrValueList;
	List<PmsSkuSaleAttrValue> skuSaleAttrValueList;

	public String getSpuId() {
		return spuId;
	}

	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getSkuDesc() {
		return skuDesc;
	}

	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}

	public String getCatalog3Id() {
		return catalog3Id;
	}

	public void setCatalog3Id(String catalog3Id) {
		this.catalog3Id = catalog3Id;
	}

	public String getSkuDefaultImg() {
		return skuDefaultImg;
	}

	public void setSkuDefaultImg(String skuDefaultImg) {
		this.skuDefaultImg = skuDefaultImg;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public List<PmsSkuImage> getSkuImageList() {
		return skuImageList;
	}

	public void setSkuImageList(List<PmsSkuImage> skuImageList) {
		this.skuImageList = skuImageList;
	}

	public List<PmsSkuAttrValue> getSkuAttrValueList() {
		return skuAttrValueList;
	}

	public void setSkuAttrValueList(List<PmsSkuAttrValue> skuAttrValueList) {
		this.skuAttrValueList = skuAttrValueList;
	}

	public List<PmsSkuSaleAttrValue> getSkuSaleAttrValueList() {
		return skuSaleAttrValueList;
	}

	public void setSkuSaleAttrValueList(List<PmsSkuSaleAttrValue> skuSaleAttrValueList) {
		this.skuSaleAttrValueList = skuSaleAttrValueList;
	}
}
