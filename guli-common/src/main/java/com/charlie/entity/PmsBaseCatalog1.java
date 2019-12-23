package com.charlie.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @param
 * @return
 */
public class PmsBaseCatalog1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5015878619237047804L;
	private String id;
	private String name;
	private List<PmsBaseCatalog2> catalog2s;

	public List<PmsBaseCatalog2> getCatalog2s() {
		return catalog2s;
	}

	public void setCatalog2s(List<PmsBaseCatalog2> catalog2s) {
		this.catalog2s = catalog2s;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
