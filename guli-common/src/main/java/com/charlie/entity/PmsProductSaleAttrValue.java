package com.charlie.entity;

import java.io.Serializable;

public class PmsProductSaleAttrValue implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8237262384540839273L;

	String id;
	String productId;
	String saleAttrId;
	String saleAttrValueName;
	String isChecked;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSaleAttrId() {
		return saleAttrId;
	}

	public void setSaleAttrId(String saleAttrId) {
		this.saleAttrId = saleAttrId;
	}

	public String getSaleAttrValueName() {
		return saleAttrValueName;
	}

	public void setSaleAttrValueName(String saleAttrValueName) {
		this.saleAttrValueName = saleAttrValueName;
	}

	public String getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}
}
