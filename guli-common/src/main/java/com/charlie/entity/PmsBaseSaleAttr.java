package com.charlie.entity;

import java.io.Serializable;

/**
 * @param
 * @return
 */
public class PmsBaseSaleAttr implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3906115854842535372L;
	String id ;
    String name;
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