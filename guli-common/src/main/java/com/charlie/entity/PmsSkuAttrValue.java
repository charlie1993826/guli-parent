package com.charlie.entity;

import java.io.Serializable;

public class PmsSkuAttrValue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1279122192388783717L;

	String id;

	String attrId;

	String valueId;

	String skuId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttrId() {
		return attrId;
	}

	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}

	public String getValueId() {
		return valueId;
	}

	public void setValueId(String valueId) {
		this.valueId = valueId;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
}
